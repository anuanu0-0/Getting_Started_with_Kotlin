
fun main(args: Array<String>) {
    // If-else
    var discount = 0
    var price = 90
    discount = if(price>50) 10 else 3
    println(discount)

    // When
    val rating = 4
    val result = when(rating){
        5 -> "High"
        3,4 -> "Good"
        1,2 -> "Poor"
        else -> {
            println("No Rating")
            "Zero"
        }
    }
    println("The rating is $result ($rating)")
}