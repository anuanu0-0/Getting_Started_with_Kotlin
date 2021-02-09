fun main() {
    // Type Conversion
    val a:Int = 10
    val b:Long = a.toLong()
    println(b)

    // Type Checking
    // Any -> Base Class
    val name:Any = "Anu"
    if(name is String) {
        println(name.length)
    }

    // Type Casting
    //eg1
    val name1: String = name as String
    println(name1)

    //eg2
    val x:Int = 7
    //val y:Long = x as Long // Error Integer cannot be casted to long

    // as?  -> Safe cast operator with as
    // If everything goes fine it will cast else it will return null
    val z:Long? = x as? Long
    println(z)




}