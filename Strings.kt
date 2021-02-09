fun main() {
    //String Concatenation
    val name:String = "John"+"Doe"
    println(name)

    val address:String = "House no." + 23
    println(address)

    // First element while concatenating should of type string
    // Error
    // val address1:String = 23 + "Block C"
    //  println(address1)


    // String Template
    val flatNumber:Int = 25
    val address1 :  String = "Tower 1, Flat no. $flatNumber"
    println(address1)

    println("Name is ${name.length} chars long")
}