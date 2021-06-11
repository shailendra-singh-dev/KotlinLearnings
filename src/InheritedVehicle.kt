class InheritedVehicle(make: String, model: String, var color: String = "Red") : Vehicle(make, model) {

    override fun accelerate() {
        super.accelerate()
        println("InheritedVehicle accelerate");
    }

    override fun park() {
        super.park()
        println("InheritedVehicle park");
    }
}