class StaticAsCompanion {

    companion object StaticAsCompanion {
        fun getStaticFunction(): String {
            return "StaticFunction in Kotlin"
        }
    }
}

fun main(args: Array<String>) {
    val str = StaticAsCompanion.getStaticFunction();
    println(str)
    print(Person.getMessage())

}

class Person {
    companion object Test{
        fun getMessage():String {
            return "";
        }
    }
}