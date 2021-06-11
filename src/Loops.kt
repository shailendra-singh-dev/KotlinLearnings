fun main(args: Array<String>) {
    val list = listOf("Banana", "Apple", "Mango", "Pineapple", "Orange")
    for (item in list) {
        println(item)
    }

    val map = mapOf("India" to "Delhi", "SriLanka" to "Colombo", "China" to "Beijing", "Nepal" to "Bhutan")
    for ((key, value) in map) {
        println("$key=$value");
    }

    var x = 10
    while (x > 0) {
        print(","+x)
        x--
    }
}