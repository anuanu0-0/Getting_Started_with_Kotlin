
// If no modifier or annotation is present we can get rid of "constructor" keyword
// Constructor parameter can have default values
// Primary constructors can't contain any code. Use init block for initialization
// There can be multiple init blocks in a class
// Primary constructor can have properties

// Declaration 1 :
class NewStudent_1 constructor(fn:String= "Anu") {
    val fn : String
    var ln : String? = null
    init{
        println("Init block called")
        this.fn = fn
    }

    constructor(fn:String, ln:String):this(fn) {
        println ("Secondary constructor called")
        this.ln = ln
    }
}

// Declaration 2: Omitting constructor keyword in primary
class NewStudent_2(fN:String= "Anu") {
    val fN : String
    var lN : String? = null
    init{
        println("Init block called")
        this.fN = fN
    }

    constructor(fN:String, lN:String):this(fN) {
        println ("Secondary constructor called")
        this.lN = lN
    }
}

// Declaration 3: Initializing inside primary constructor
class NewStudent_3(val firstName:String="Anu") {
    // firstName declared & initialized inside primary constructor
    var lastName : String? = null
    init{
        println("Init block called")
    }

    constructor(firstName:String, lastName:String):this(firstName) {
        println("Secondary constructor called")
        this.lastName = lastName
    }
}

fun main(args:Array<String>) {
    val st1:NewStudent_3 = NewStudent_3("Hi kotlin!!")
    println("Name : ${st1.firstName} ${st1.lastName}")

    val st2:NewStudent_3 = NewStudent_3("I'm in", "Miami!!")
    println("Name : ${st2.firstName} ${st2.lastName}")

}

