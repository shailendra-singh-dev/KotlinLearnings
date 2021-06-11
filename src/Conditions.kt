fun main(args: Array<String>) {
    isWeatherGood(30)
    println()
    usingWhen(10)
}

//Conditions
fun isWeatherGood(temperature: Int) {
    if (temperature == 40) {
        print("Quite better")
    } else if (temperature >= 50 && temperature <= 70) {
        print("Quite warm")
    } else {
        print("Quite cool")
    }
}

//Switch case in Kotlin
fun usingWhen(x: Int) {
    when (x) {
        1 -> {
            println("Matched with 1")
        }

        2 -> {
            println("Matched with 2")
        }

        3 -> {
            println("Matched with 3")
        }
        else -> {
            println("Not matching with any value which is $x")
        }
    }
}
