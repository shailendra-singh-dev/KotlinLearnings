package KotlinLearnings.src

fun value(r: Char): Int {
    if (r == 'I') return 1
    if (r == 'V') return 5
    if (r == 'X') return 10
    if (r == 'L') return 50
    if (r == 'C') return 100
    if (r == 'D') return 500
    return if (r == 'M') 1000 else -1
}

fun romanToInt(s: String): Int {
    var total = 0
    for (i in 0 until s.length) {
        val s1 = value(s[i])
        total = if (i + 1 < s.length) {
            val s2 = value(s[i + 1])
            if (s1 >= s2) {
                total + s1
            } else {
                total - s1
            }
        } else {
            total + s1
        }
    }
    return total
}

/*
fun StringToDecimal(roman:String) : Int {
    return Symbol.highestStartingSymbol(roman)
        .let{
            if (it != null) {
                it.decimalValue + it.
            } else {
                0
            }
        }
}

private enum class Symbol(val decimalValue: Int) {
    I(1),
    IV(4),
    V(5),
    IX(9),
    X(10),
    XL(40),
    L(50),
    XC(90),
    C(100),
    CD(400),
    D(500),
    CM(900),
    M(1000);

    companion object {
        fun highestStartingSymbol(value: String) =
            values()
                .sortedByDescending { it.decimalValue }
                .firstOrNull { value.startsWith(it.name) }
    }
}
*/

fun main(args: Array<String>) {
    println(romanToInt("I"));
    println(romanToInt("XXI"));
    println(romanToInt("IV"));
}


fun decode(s: String): Int {
    val values= mapOf('I' to 1,'V' to 5,'X' to 10, 'L' to 50,'C' to 100,'D' to 500, 'M' to 1000);
//    val values: map<Char, Int> = arrayOf(
//        arrayOf('I', 1),
//        arrayOf('V', 5),
//        arrayOf('X', 10),
//        arrayOf('L', 50),
//        arrayOf('C', 100),
//        arrayOf('D', 500),
//        arrayOf('M', 1000)
//    )
    var total = 0
    for (i in s.indices) {
        // If the current value is greater than or equal
        // to the value of the symbol to the right
        if ((i + 1) < s.length && values[s[i]]!! >= values[s[i + 1]]!!) {
            total += values[s[i]]!!
        } else {
            total -= values[s[i]]!!
        }
    }
    return total
}