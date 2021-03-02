interface Footballer{
    val position:String
    fun dribble()
    fun kick() {
        println("Kick the football")
    }
}

open class Man(val name: String)

class Disciple(name:String, override val position:String) : Man(name), Footballer{
    override fun dribble() {
        println("Dribble the ball")
    }
}

fun playFootball(footballer: Footballer){
    footballer.dribble()
    footballer.kick()
}

fun printName(man: Man) {
    println("Name is : ${man.name}")
}

fun main() {
    val disciple = Disciple("Tom", "Defender")
    playFootball(disciple)
    printName(disciple)
}