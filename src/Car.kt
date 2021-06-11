class Car(val make: String, val model: String, var color: String) {
    fun makeSound(sound: String = "hummmmmmmmm") {
        println("Car which has make:$make, model:$model , color:$color is making sound ${sound}")
    }

}

