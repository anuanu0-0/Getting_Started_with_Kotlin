
fun main(args:Array<String>) {
    // String Concatenation
    val name:String = "Hi"+"Anu"
    println(name)

    val address:String = "House no, " + 213
    println(address)

    // Note:
    // First element in concatenation must be of type string
    // val addressNew : String  = 123 + ", Block C"    // Error!!
    // println(addressNew)

    // String Template
    val flatNum:Int = 421
    val addressTemp : String = "Tower 1, Flat no. $flatNum"
    println(addressTemp)

    println("Name is ${name.length} chars long")
}