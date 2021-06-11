import KotlinLearnings.src.Person

/**
 * https://www.geeksforgeeks.org/kotlin-constructor/
 */

//Primary Constructor
class Add constructor(val a: Int, val b: Int) {
    fun add() {
        println("add:" + (a + b))
    }
}

////Primary Constructor with initializating fields.
//class Employee(empId:Int, empName: String) {
//    val empId :Int = empId
//    val empName :String = empName
//}

// primary constructor with initializer block
class Employee(empID: Int, empName: String, empPhone: Int) {
    val id: Int;
    val name: String;
    val phone: Int;

    init {
        id = empID
        name = empName
        phone = empPhone
    }

    fun details() {
        println("Detail id- $id,name:$name ,phone-$phone")
    }
}

//Default values in primary constructor.
class EmployeeWithDefault(empID: Int = 1002, empName: String = "Singh", empPhone: Int = 804215888) {
    val id: Int
    val name: String
    val phone: Int

    init {
        id = empID
        name = empName
        phone = empPhone
    }

    fun details() {
        println("Detail id- $id,name:$name ,phone-$phone")
    }

}

//class with one secondary constructor
class ClassWith1SecondaryConstructor {

    constructor(a: Int, b: Int) {
        val c = a + b
        println(c)
    }

}

//Two secondary constructors in a class.
class ClassWith2SecondaryConstructor {

    constructor(empID: Int, empName: String) {
        var id = empID
        var name = empName;
        println("id:$id , name:$name")
    }

    constructor(empID: Int, empName: String, empPhone: Int) {
        var id = empID
        var name = empName
        var phone = empPhone;
        println("id:$id , name:$name, phone:$phone")
    }

}

// three secondary constructor in a class
class ClassWith3SecondaryConstructor {
    constructor(a: Int, b: Int) {
        var c = a + b;
        println(c)
    }

    constructor(a: Int, b: Int, c: Int) {
        var d = a + b + c;
        println(d)
    }

    constructor(a: Int, b: Int, c: Int, d: Int) {
        var e = a + b + c + d;
        println(e)
    }
}

//Calling one constructor from another
class CallingOneFromAnother {

    constructor(a: Int, b: Int, c: Int, d: Int) : this(a, b, c) {
        var e = a + b + c + d;
        println("Sum of the 4 numbers:$e")
    }

    constructor(a: Int, b: Int, c: Int) {
        var d = a + b + c;
        println("Sum of the 3 numbers:$d")
    }
}

//Calling parent class secondary constructor from child class secondary constructor.
open class Parent {
    constructor(a: Int, b: Int, c: Int) {
        val d = a + b + c
        println("Sum in Parent class:$d")
    }
}

class Child : Parent {
    constructor(a: Int, b: Int, c: Int, d: Int) : super(a, b, c) {
        val e = a + b + c + d
        println("Sum in Child class:$e")
    }
}



fun main(args: Array<String>) {
    /*
    val add = Add(10, 20)
    add.add()

    val employee = Employee(122000, "Amit", 986686612);
    employee.details()

    val employeeWithDefault = EmployeeWithDefault()
    employeeWithDefault.details()

    val classWith1Secondary = ClassWith1SecondaryConstructor(10, 20);
    val classWith2SecondaryConstructor = ClassWith2SecondaryConstructor(10000, "Pawan");
    val classWith2SecondaryConstructorObj = ClassWith2SecondaryConstructor(10000, "Pawan", 8989888)

    val classWith3SecondaryConstructor1 = ClassWith3SecondaryConstructor(10, 20)
    val classWith3SecondaryConstructor2 = ClassWith3SecondaryConstructor(10, 20, 30)
    val classWith3SecondaryConstructor3 = ClassWith3SecondaryConstructor(10, 20, 30, 40)

    val callingOneFromAnother = CallingOneFromAnother(10, 20, 30, 40);
*/
//    val child = Child(10, 20, 30, 40)
//    var constructor:ConstructorInit= ConstructorInit(10,20)
//    constructor.details()

//    val person1:Person = Person() //Called secondary constructor
//    person1.details()

    val person2:Person = Person() //Called primary constructor
    person2.nickName = "NickName"
    person2.printInfo()

}

class ConstructorInit(val proA:Int, val propB:Int){
    var a:Int =proA;
    var b:Int =propB;
    var c:Int;

    init {
        c =1000
    }

    constructor():this(1000,2000){
       this.a = a
       this.b= b
    }

    fun details(){
        println("a=$a,b=$b,c=$c")
    }
}