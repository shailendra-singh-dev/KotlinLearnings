import kotlin.collections.Iterator;

fun main(args: Array<String>) {
    arrayTest();
}

fun arrayTest(){
    var  array = arrayOf("Kumara", "Satish", "Suneel", "Rakesh")
    for(item in array){
        print("$item ")
    }
}

fun immutableSetTest(){
    val set= setOf<String>("Singh","Devi","Singh")
    for(item in set){
        print(item)
    }
    set.forEach{
        print(it)
    }
}

fun mutableSetTest(){
    val set= mutableSetOf<String>("Singh","Devi","Singh");//hashSetOf<String>("Singh","Devi","Singh")
    set.add("Pandey")
    for(item in set){
        print(item)
    }
}

fun mutableMapTest() {
    println("mutableMap")
    val map = hashMapOf<String,String>("KK" to "Jhansi", "Amit" to "Bangalore")
    println(map.entries)
    for((key,value) in map){
        print("key=$key and value=$value")
    }
    map.put("Shashibhusan","Bihar")
    println(map.entries)
}

fun immutableListTest() {
    println("immutableList")
    val list = listOf("Banana", "Apple", "Mango", "Pineapple", "Orange")
    println(list)
    val sortedList = list.sorted();
//    println(sortedList)
    val appleIndex = list.indexOf("Apple")
//    println(appleIndex)

    list.forEach{
        print(it)
    }
    for(item in list){
        print(item)
    }
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        val element = iterator.next();
//        print("element:" + element + "\n")
    }
}

fun mutableListTest() {
    println("mutableList")
    val list = arrayListOf<String>("Banana")
    list.add("Apple")
    val size = list.size
    println(size)
}

fun immutableMapTest() {
    val map = mapOf("India" to "Delhi", "SriLanka" to "Colombo", "China" to "Beijing", "Nepal" to "Bhutan")
    val entries = map.entries
    println("entries:$entries")

    /*
    println("Iteration via for-loop")
    for ((key, value) in map) {
        println("key:$key,value:$value")
    }
    println("Iteration via forEach")
    map.forEach() { (key, value) ->
        run {
            println("key:$key, value:$value")
        }
    }
    println("Iteration via Set iterator")
    val iterator = map.iterator();
    for (entry in iterator) {
        println(entry);
    }
    */

    val iterator = map.iterator()
    println("Iteration via Set iterator")
    while (iterator.hasNext()) {
        val element = iterator.next()
        println("key:${element.key},value:${element.value}")
    }

    map.forEach{
        print("key=$it.key, value=${it.value}")
    }
}
