class S (val fName : String, val lName : String)

fun S.fullName() = "${this.fName} ${this.lName}"

fun Int.getEven() :Int {
    if(this%2 == 0)
        return this
    else
        return this+1
}

fun main() {
    val s = S("Anu", "Doe")
    println("The full name of student : ${s.fullName()} ")

    val x:Int = 32
    println("The even age is: ${x.getEven()}")

}