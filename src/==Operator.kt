fun checkEqual() {
    //primitive types
    val a: Int = 100;
    val b: Int = 100;
    println(a == b)
    println(a === b)

    //Wrapper types
    val aObj: Integer = Integer(100);
    val bObj: Integer = Integer(100);
    println(aObj == bObj);
    println(aObj === bObj);
}


fun main(args: Array<String>) {
    checkEqual()
}