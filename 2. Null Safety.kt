
fun main(args:Array<String>) {
    // Null Safety - ?
    var name:String? = null

    // Safe call operator ?.
    println(name?.length)

    // Elvis operator ?:
    println(name?.length ?: 0)

    printNameLength("Anu", "anu0-0")
}

fun printNameLength(firstName:String?, lastName:String?) {
    if(firstName!=null) {
        // Non null assertion operator - !!
            // Compiler deoesnot checks for null in this case, user must handle
                // Null pointer exception if case not handled
        println("Name: ${firstName.length} ${lastName!!.length}")
    }
}