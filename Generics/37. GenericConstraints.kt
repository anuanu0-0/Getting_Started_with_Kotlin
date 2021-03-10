
// Number or its subtype can only be passed
fun <T:Number> printPrice(price: T) {
    println("The price is : $price")
}

// For multiple type constraints
fun<T> printPrice1(price: T) where T:Number, T:java.io.Serializable {
    // Code
}

// Any? is default When no type specified
fun <T> printPrice2(price: T) {
    println("The price is : $price")
}
fun main() {
    printPrice<Int> (23)
    printPrice<Double>(23.45)

    val price: Int? = null
    printPrice2<Int?> (price)
}