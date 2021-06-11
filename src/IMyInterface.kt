package KotlinLearnings.src

interface IMyInterface {
    val prop:Int; //abstract

    val propertyWithImplementation:String
    get() = "IMyInterface get()- foo"

    fun foo(){
        print("IMyInterface foo() abstract method $prop")
    }
}