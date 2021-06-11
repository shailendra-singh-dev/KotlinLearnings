
fun decode(s: String): Int {
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

fun value(r: Char): Int {
    if (r == 'I') return 1
    if (r == 'V') return 5
    if (r == 'X') return 10
    if (r == 'L') return 50
    if (r == 'C') return 100
    if (r == 'D') return 500
    return if (r == 'M') 1000 else -1
}
