// Singleton Classes / Objects and companion objects

object GameScore{
    var score: Int = 0
        private set

    fun addScore(point: Int) {
        if(point > 0) {
            this.score += point
        }
    }
}

// Singleton Object inside a class
class CStudent (val name: String) {
    object School {
        const val schoolName = "Android School"
    }
}

class BStudent(val time : String) {
    // Companion object
    companion object {
        const val msg = "Clock is ticking"
    }
}

fun main() {
    GameScore.addScore(10)
    println("The score is: ${GameScore.score}")
    println("The schoolName is: ${CStudent.School.schoolName}")

    // Accessing a companion class
    println("The msg is: ${BStudent.msg}")


}