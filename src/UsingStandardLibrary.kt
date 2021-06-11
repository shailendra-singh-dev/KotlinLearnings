package KotlinLearnings.src

fun main(args: Array<String>) {
    val list = listOf("C", "C++", null, "Java", null)
    list.filterNotNull()
        .takeLast(3)
        .forEach {
            print(it)
        }
}