// Any class has 3 functionalities only which may restricts
// our goals for the function
fun printContent(content:Any) {
    println("Content is $content")
}

// Other Way is using Generics
fun<T> printContent1(content:T) {
    println("The content is $content")
}

fun main() {
    printContent("Hello World")
    printContent(9)

    printContent1<String>("Hello World")
    printContent1<Int>(9)

}
