fun main() {
    // declaration
    println(addNumbers(4, 5))
    printUserName("Anu")

    // default arguments
    printUserName1("Anu", "Srivastava")
    printUserName1("Anuanu")

    // Named Arguments
    println(volume("Box", 1, height=10, width=5))

    // Single Expressions
    addNumber1(3,7)
}

fun addNumbers(x:Int, y:Int):Int {
    return x+y
}

fun printUserName(name:String): Unit {
    println(name)
}

fun printUserName1(firstName:String, lastName:String="Noe") {
    println("The name is: $firstName $lastName")
}

// Order of arguments is not important in case of named arguments
fun volume(boxName:String, length:Int, width:Int, height:Int) : Int {
    println(boxName)
    return length*width*height
}


//fun addNumber1(x:Int, y:Int) : Int {
//    return x+y
//}

fun addNumber1(x:Int, y:Int) =  x+y