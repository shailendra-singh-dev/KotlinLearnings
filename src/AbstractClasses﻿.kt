package KotlinLearnings.src

abstract class Polygon {
    abstract fun draw()
}

class Rectangle : Polygon() {
    override fun draw() {
        print("Overridden draw() - Rectangle")
    }
}

class WildShape : Polygon() {
    override fun draw() {
        print("Overridden draw() - WildShape")
    }
}

fun main(args: Array<String>) {
    val wildShape = WildShape()
    wildShape.draw()
}