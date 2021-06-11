package KotlinLearnings.src

fun main(args: Array<String>) {
    val imyInterfaceImplObj: IMyInterfaceImpl = IMyInterfaceImpl()
    println(imyInterfaceImplObj.prop)
    println(imyInterfaceImplObj.propertyWithImplementation)
    imyInterfaceImplObj.foo()
}

class IMyInterfaceImpl : IMyInterface {
    override val prop: Int = 1000

    override val propertyWithImplementation: String
        get() = "IMyInterfaceImpl get() propertyWithImplementation"//super.propertyWithImplementation

    override fun foo() {
        println("IMyInterfaceImpl foo()")
    }
}