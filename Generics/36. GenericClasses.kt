class Printer<T>() {
    fun <T> printContent(content:T) {
        println("Content is $content")
    }

    fun<T> someOtherFunctions(value: T) {
        // Code
    }
}

fun main() {
    val printer = Printer<String>()
    printer.printContent("Hello World")

    val printer1 = Printer<Int>()
    printer1.printContent(45)
}