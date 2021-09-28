import kotlin.NumberFormatException

// main function
fun main() {
    val someStringValue: String? = null
    var someIntValue = 0

    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) { // e: sama dengan error:
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when (someIntValue) {
            0 -> println("Catch block NullPointerException terpanggil!")
            -1 -> println("Catch block NumberFormatException terpanggil!")
            else -> println(someIntValue)
        }
    }
}