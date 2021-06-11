package KotlinLearnings.src

open class BaseClass(){}

class DerivedClass :BaseClass()

fun BaseClass.someMethod(){
    print("BaseClass.someMethod()")
}

fun DerivedClass.someMethod(){
    print("DerivedClass.someMethod()")
}

fun printMessage(base:BaseClass){
    base.someMethod();
}

fun main(args: Array<String>) {
    printMessage(DerivedClass())
}