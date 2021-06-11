class Truck(val make: String, val model: String, val towingCapacity: Int) {
    fun details() {
        println("Truck has make:$make, model:$model,towingCapacity:$towingCapacity ")
    }

    fun tow() {
        println("Truck is towing ")
    }
}