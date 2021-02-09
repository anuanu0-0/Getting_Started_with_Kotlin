fun main() {
    // Null Safety
    var name:String? = null

    // safe call operator ?.
    println(name?.length)

    // Elvis operator ?:
    println(name?.length ?: 0)

    printNameLength("Anu", "SRI")
}

fun printNameLength(firstName:String?, lastName:String?) {
    if(firstName!=null){
        // Non null assertion operator!!
        // Compiler doesnot checks for null in this case, user must handle
        // Null pointer Exception if case not handled
        println("Name: ${firstName.length} ${lastName!!.length}")
    }
}