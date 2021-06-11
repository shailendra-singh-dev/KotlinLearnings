fun main(args: Array<String>) {
    /*
    println(functionWithReturnValue("Hello,"))

    fun functionWithReturnValueWithin(a: Int, b: Int): Int {
        return a + b
    }

    val returnValue = functionWithReturnValueWithin(10, 20)
    println("returnValue: $returnValue")

    val returnValueString = functionWithReturnValue("GoodBye,");
    println("returnValueString: ${returnValueString.substring(2, returnValueString.length - 1)}")

    val default = functionWithDefaultParams();
    println("default: $default")

    println("functionWithDefaultParams(): ${functionWithDefaultParams("Not default Value")}")
    */
//    print(getGreeting())
//    sayHello("Shailendra")
    greetPerson(name="Sanjay",greeting = "Hello") //any order
    greetPersonWithDefault()
}

fun functionWithDefaultParams(message: String = "Default Value"): String {
    return message
}

fun functionWithReturnValue(str: String): String {
    return str + "World!!!"
}

//Single Expression functions
fun getGreeting():String = "Hello Kotlin!!!"
fun sayHello(message:String):Unit  = print("The message is $message")

fun greetPerson(greeting:String, name:String) = print("$greeting, Mr. $name")
fun greetPersonWithDefault(greeting:String = "Hello", name:String = "World!!!") = print("$greeting, Mr. $name")

