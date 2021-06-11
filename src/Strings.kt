fun main(args: Array<String>) {
    val stringValue: String = """This is Shailendra Singh
        |I am trying my best to get selected in interview
        |I will continue to do the same.
    """.trimMargin()
    println(stringValue)

    for (char in stringValue) {
        print(char)
    }

    var stringVar = "This is Shailendra Singh.";
    var lowercase = stringVar.toLowerCase();
    var upperCase = stringVar.toUpperCase();

    var subString = stringVar.substring(6, stringVar.length - 1)
    stringVar += "Appended String."
    println(subString)

    stringVar = stringVar.plus("This is end")
    println(stringVar)

    println("lowercase getchar at 0 index:${lowercase.get(0)}")

}

