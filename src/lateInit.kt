class LateInitCheck {
    private lateinit var mName: String;

    fun checkForInitialization() {
        println(this::mName.isInitialized)
        mName = "Amit"
        println(this::mName.isInitialized)
    }
}

fun main(args: Array<String>) {
    val lateInitCheck: LateInitCheck = LateInitCheck();
    lateInitCheck.checkForInitialization()
}