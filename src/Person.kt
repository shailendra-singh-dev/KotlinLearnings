package KotlinLearnings.src

class Person(val firstName:String = "David", val lastName:String= "Bakheam") {

    var nickName:String? = null
        set(value){
            field = value
            println("set(value):$field")
        }
        get() {
            println("get() :$field")
            return field
        }
    constructor(): this("Peter","Parker"){
        println("Called secondary constructor")
    }
    init {
        println("1st init()")
    }
    init {
        println("2nd init()")
    }
    fun printInfo(){
        //val nickName = if(nickName != null) nickName else "No nick name";
        val nickName = nickName ?: "No Nick Name";
        print("$firstName,$nickName,$lastName")
    }
}