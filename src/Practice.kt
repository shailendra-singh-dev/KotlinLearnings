fun main(args: Array<String>) {
    var a: A = A(100, 200)
    a.printVariables()
    var b:B = B(100,200,300)
    b.printVariables()
}

open class A(var a: Int = 10, var b: Int = 20) {
    open fun printVariables() {
        print("a=$a, b=$b")
    }
}

class B(a: Int, b: Int, var c: Int = 30) : A(a, b) {
    override fun printVariables() {
        print("a=$a, b=$b, c=$c")
    }
}



