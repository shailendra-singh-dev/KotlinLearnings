open class Vehicle(val make: String, val model: String) {
    open fun accelerate() {
        println("accelerate")
    }

    open fun park() {
        println("brake")
    }

    fun brake() {
        println("brake")
    }
}