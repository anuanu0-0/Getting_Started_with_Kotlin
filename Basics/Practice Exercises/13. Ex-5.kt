import java.util.Scanner;

// Fahrenheit to Celsius Function
fun main(args:Array<String>) {
    val reader = Scanner(System.`in`)
    var s: Int = reader.nextInt()
    var e: Int = reader.nextInt()
    var w: Int = reader.nextInt()

    printCelsius(s,e,w)
}

fun printCelsius (s:Int, e:Int, w:Int) :Unit {
    (s..e step w).forEach{fr->
       val cel = ((fr-32)*5)/9
       println("$fr $cel")
    }
}
