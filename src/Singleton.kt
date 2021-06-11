object SingletonClass {
    var instanceVar: String;

    init {
        instanceVar = "Name"
    }

    fun printInstanceVariable() {
        println("instanceVar is Initialized with..$instanceVar");
    }
}

class Caller {
    fun callSingleton() {
        println("instanceVar is called in callSingleton()");
        SingletonClass.printInstanceVariable()
    }
}

fun main(args: Array<String>) {
    val singletonClass = SingletonClass
    singletonClass.instanceVar = "Name is Changed"
    singletonClass.printInstanceVariable()

    val caller = Caller();
    caller.callSingleton()
}