package KotlinLearnings.src

class FancyInfoProvider:BasicInfoProvider() {

    override val sessionIDPrefix: String
        get() = "Fancy Session" //super.sessionIDPrefix

    override val providerInfo: String
        get() = "FancyInfoProvider"//super.providerInfo

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("FancyInfo")
    }
}