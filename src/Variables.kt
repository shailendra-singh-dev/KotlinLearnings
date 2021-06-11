var instanceVar:String? = "Hello"

fun main(args: Array<String>) {
//    var intVar = 1
//    var stringVar = "Shailendra"
//    var floatVar = 12.23f
//    var booleanVar = false
//    //print("intVar:$intVar,stringVar:$stringVar,floatVar:$floatVar,booleanVar:$booleanVar")
//    //Using type inference
//    val intVal = 122222 //immutable
//
//    var intType: Int = 1222
//    var doubleType: Double = 111212212.21212122
//    var stringType: String = "Singh is king"
//
//    var converted = intType.toString();
//
//    print("intType:" + intType + ",doubleType:" + doubleType + ",stringType:" + stringType + ",converted:" + converted)

    instanceVar = null;
    print(instanceVar)

    val value = when(instanceVar){
        null -> "Hello it's NULL"
        else -> instanceVar
    }
    print(value)
}

