
fun main(args:Array<String>) {
    // Declarations
    println(addNumbers(5, 6))
    printUserName("Anunu0-0")

    // Default Arguments
    printUserNames("Hi")
    printUserNames("Hi", "Tom")

    // Named Arguments
    println(volume("Box", 1, height = 20, width = 9))

}
// Single Expressions
fun addNumbers(x:Int, y:Int):Int = x+y
fun printUserName(name:String):Unit = println(name)
fun printUserNames(firstName:String, lastName:String="Anu") = println("The name is: $firstName $lastName")
// Order of arguments is not important in case of named arguments
fun volume(boxName:String, lenght:Int, width:Int, height:Int):Int {
    println(boxName)
    return lenght*width*height
}