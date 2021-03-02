
fun main(args: Array<String>) {
    // Type Conversion
    val a:Int = 10
    val b:Long = a.toLong()
    println(b)

    val c:Int = 15
    val d:Double = c.toDouble()
    println(d)

    // Type Checking
        // Any is a Base class
    val name:Any = "Anu"
    if(name is String)
        println(name.length)

    val age:Any = 50
    if(age !is Double)
        println("Not double but Int")

    // Type Casting
    val n1:String = name as String
    println(n1)

    val num:Int = 100
    val num2:Long = num as Long  // Cast will never succeed.  Error!!
    println(num2)

    // Safe cast operator with as - as?
    // If everything goes fione it will cast elese it will return null
    val z:Long? = num as? Long   // Error!!
    println(z)





}