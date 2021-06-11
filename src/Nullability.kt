fun main(args: Array<String>) {
    val str: String = "Tom"
//    str = null

    var nullableString: String? = "Do I really exists!!"
//    nullableString = null

    //1. Null check
    var length = 0
    if (null != nullableString) {
        length = nullableString.length
    } else {
        length = -1
    }
    println("length from condition :$length")

    //2. length From Ternary Operator like Condition
    val lengthFromCondition: Int = if (null != nullableString) nullableString.length else -1
    println("length From Ternary Operator like Condition:$lengthFromCondition")

    //3. Safe call Operator
    var lengthSafeCall = nullableString?.length
    println("Safe call Operator $lengthSafeCall")

    //4. Elvis Operator
    var lengthElvisOperator = nullableString?.length ?: -1
    println("Elvis Operator $lengthElvisOperator ")

    //5. null check or !! operator
    println(nullableString!!.length)

}