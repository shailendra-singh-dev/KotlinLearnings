fun printFilteredString(list: List<String>, predicate: (String) -> Boolean) {
    list.forEach {
        if (predicate(it)) {
            println(it)
        }
    }
}

fun printFilteredString_(list: List<String>, predicate: (String) -> Boolean, dummy: String) {
    list.forEach {
        if (predicate(it)) {
            println("$dummy,$it")
        }
    }
}

val predicate: (String) -> Boolean = {
    it.startsWith("J")
}

fun main(args: Array<String>) {
    val list = listOf<String>("Java", "C", "C++", "Kotlin", "Javascript")
//    printFilteredString(list, {it.startsWith("J")})
    printFilteredString(list) {
        it.startsWith("J")
    }

    printFilteredString_(list, { it.startsWith("J") }, "Dummy")

}