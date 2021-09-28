// main function
fun main() {
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    try { // try adalah block of code yg bisa menimbulkan error
        someMustNotNullValue = someNullValue!!
    } catch (e: Exception) { // kalo error terjadi, block of code yg ada di dalam catch akan dieksekusi
        someMustNotNullValue = "Nilai String Null"
    } finally { // finally akan SELALU dieksekusi, entah error atau engga
        println(someMustNotNullValue)
    }
}