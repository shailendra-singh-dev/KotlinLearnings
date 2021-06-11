fun main(args: Array<String>) {
    val car: Car = Car("Totota", "ABC", "Blue")
    println("Car Info - make:$car.make ,model:$car.model, color:${car.color}")
    car.makeSound("Burrrrrrrr")

    val truck: Truck = Truck("Mahindra", "NNNNN", 10000)
    truck.details()

    val inheritedVehicle = InheritedVehicle("Ford", "F-100", "White");
    inheritedVehicle.accelerate()
    inheritedVehicle.park()
}