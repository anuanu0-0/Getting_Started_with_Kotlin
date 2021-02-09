// var <propertyName>[:<PropertyType>] [=<property_initializer>]
// [<getter>]
// [<setter>]

//class Student1 constructor(firstName: String="Anu"){
class Student1 (firstName: String="Anu"){
    //Also we can declare and assign firstname inside constructor arguments
    //class Student1(val firstName: String="Anu")   ------ 1
    val firstName:String     // Remove this when opting ------1
    var lastName: String? = null

    init{
        println("Primary Constructor Called")
        this.firstName = firstName // Remove this when opting ----- 1
    }

    constructor(firstName: String, lastName: String) : this(firstName) {
        println("Second Constructor Called")
        this.lastName=lastName
    }
}

fun main() {
    val student1: Student1 = Student1("Hello World")
    println("Name of the student is: ${student1.firstName} ${student1.lastName}")
    val student2: Student1 = Student1("Hi", "John")
    println("Name of the student is: ${student2.firstName} ${student2.lastName}")


}