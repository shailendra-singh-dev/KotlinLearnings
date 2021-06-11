package KotlinLearnings.src

fun sayHello(greeting:String, vararg args:String){
    //For loop
    for(arg in args){
        print("$greeting $arg\n")
    }
    println()
    //For each
    args.forEach { item->
        print("$greeting $item")
    }
}

fun main(args: Array<String>) {
    var  array = arrayOf("Kumara", "Satish", "Suneel", "Rakesh")
    //sayHello("Hi,","Shailendra","Singh")
    sayHello("Hello,",*array)
}