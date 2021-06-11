package KotlinLearnings.src

interface IPersonInfoProvider {
    val providerInfo: String

    fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
    }
}

interface ISessionInfoProvider {
    fun getSessionId(): String
}

open class BasicInfoProvider : IPersonInfoProvider, ISessionInfoProvider {
    override val providerInfo: String
        get() = "BasicInfoProvider"

    protected open val sessionIDPrefix: String = "Session"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Additional info provided")
    }

    override fun getSessionId(): String {
        return sessionIDPrefix
    }
}

fun main(args: Array<String>) {
//    val basicInfoProvider: BasicInfoProvider = FancyInfoProvider()
//    basicInfoProvider.printInfo(Person())
//    basicInfoProvider.getSessionId()
//    basicInfoProvider.getSessionId()
//    checkTypes(basicInfoProvider);

    val basicInfoProvider: BasicInfoProvider = object : BasicInfoProvider() {

        override val providerInfo: String
            get() = "Anonymous providerInfo"//super.providerInfo

        override fun getSessionId(): String {
//            return super.getSessionId()
            return "Anonymous SessionId "
        }

        override fun printInfo(person: Person) {
            super.printInfo(person)
            println("Anonymous ${person.printInfo()}")
        }

        override val sessionIDPrefix: String
            get() = "Anonymous sessionIDPrefix"//super.sessionIDPrefix
    }

    basicInfoProvider.printInfo(Person())
    print(basicInfoProvider.getSessionId())

    //Object Expression. (Anonymous Inner class)
    val iPersonInfoProvider: IPersonInfoProvider = object : IPersonInfoProvider {
        override val providerInfo: String
            get() = "New Info Provider"//TODO("Not yet implemented")

        override fun printInfo(person: Person) {
            super.printInfo(person)
            println("Object expression")
        }

        fun getSessionId() = "Session"
    }
//    iPersonInfoProvider.printInfo(Person())
//    iPersonInfoProvider.getSessionId()
}

fun checkTypes(iPersonInfoProvider: IPersonInfoProvider) {
    if (iPersonInfoProvider !is ISessionInfoProvider) {
        println("Not a Session Info Provider")
    } else {
        println("A Session Info Provider")
        iPersonInfoProvider.getSessionId()
//        (iPersonInfoProvider as ISessionInfoProvider).getSessionId()
    }
}