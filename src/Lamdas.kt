import javax.annotation.processing.Completion

/**
 * https://www.geeksforgeeks.org/kotlin-lambdas-expressions-and-anonymous-functions/
 */

// with type annotation in lambda expression
val sum1 = { a: Int, b: Int -> a + b }

// without type annotation in lambda expression
val sum2: (Int, Int) -> Int = { a, b -> a + b }

val append: (String, String) -> String = { a, b ->
    a + b
}

fun main(args: Array<String>) {
    print(append("Singh","King"))

    /*
    val company = { println("GeeksForGeeks") }
//    company();
//    company.invoke();

//    println(sum1(10, 20));
//    println(sum2(100, 200))

    //Type inference in lambdas-
    val sum = { a: Int, b: Int ->
        val c = a + b
        c.toString()
    }

    val sumValue = sum(33, 33);
//    println("Sum value is $sumValue")

    /**
     * Pattern: (Input) -> Output
    Lambdas examples with return type –

    val lambda1: (Int) -> Int = (a -> a * a)
    val lambda2: (String,String) -> String = { a , b -> a + b }
    val lambda3: (Int)-> Unit = {print(Int)}
     */

    val sumTwoNumbers: (Int, Int) -> Int = { a, b -> (a + b) };
//    println(sumTwoNumbers(99, 1))

    val appendStrings: (String, String) -> String = { a, b -> (a + " " + b) }
//    println(appendStrings("Shailendra", "Singh"))

    val returnNothing: (Int) -> Unit = { a -> print("returnNothing:$a") }
//    returnNothing(100000);

    downloadURL("fakeURl.com", {
        println("Code in this block will only run after completion ")
    });

    downloadCarData("fakeURL.com", { car ->
        car.makeSound("Ghrrrrrrrr");
    })

    downloadCarData("fakeURL.com", {
        print(it.make)
        print(it.model)
    })

    downloadTruckData("fakeURL.com", { truck: Truck?, b: Boolean ->
        {
            if (b) {
                truck?.tow()
            } else {
                print("Something went wrong")
            }
        }
    })
    */

}

fun downloadURL(url: String, completion: () -> Unit) {
    //sent a network request ,we got the data.
    completion();
}

fun downloadCarData(url: String, completion: (Car) -> Unit) {
    val car = Car("Ford", "F-1999", "Blue");
    completion(car);
}

fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit) {
    val downloadSuccess = true
    if (downloadSuccess) {
        val truck = Truck("Toyota", "T-199", 1000);
        completion(truck, true)
    } else {
        completion(null, false)
    }
}