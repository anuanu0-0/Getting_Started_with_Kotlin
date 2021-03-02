// All classes in kotlin are final by default,
// to inherit from them we have to define them a open
open class Person (val name:String) {
    init{
        println("This is a person")
    }
    open var age:Int = 1
    open fun doWork(){
        println("Person is doing work")
    }
}

 class student(name:String, val school:String, override var age:Int): Person(name) {
    init{
        println("This is a student")
    }
    override fun doWork() {
        println("Student is studying")
        super.doWork()
    }
}

// Override function
// Override property
// Call super
fun main(args:Array<String>) {
    val student = student("Anu", "KOtlin School", 20)
    student.doWork()
    println("The age off student is ${student.age}")

    // Any - Top level class
    // Every class in kotlin has Any as superclass
    val x:Any = 56
    val y:Any = "Tom"
}