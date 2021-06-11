data class Student(val name: String, val age: Int) {

    fun details() {
        println("Name:$name ,Age:$age")
    }
}

fun main(args: Array<String>) {
    val student: Student = Student("Amit", 40);
    val (name, age) = student;
    println(name);
    println(age);
    student.details()
    println(student.toString())
}