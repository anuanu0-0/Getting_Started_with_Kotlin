//// var <propertyName>[:<PropertyType>] [=<property_initializer>]
//// [<getter>]
//// [<setter>]
//

class Student {
    val school:String = "Kotlin School"
    var age:Int = 21

    val isTeen:Boolean
        get()= age > 20

    var name:String? = null
        get() = field ?: "Unknown"
        set(value) {
            if(value!=null) field = value
        }
}

fun main(args:Array<String>) {
    val student : Student = Student()

    println("1. Student is a teenager: ${student.isTeen}")
    student.age = 10
    println("2. Student is a teenager: ${student.isTeen}")
    println("3. Student name is: ${student.name}")
    student.name = "Anu"
    println("4. Student name is: ${student.name}")
    student.name = null
    println("4. Student name is: ${student.name}")

}
