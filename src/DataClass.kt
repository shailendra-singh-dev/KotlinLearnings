data class Developer(val name: String, val age: Int)

fun main(args: Array<String>) {
    val developer: Developer = Developer("Amit", 30);
    println(developer.toString())
}