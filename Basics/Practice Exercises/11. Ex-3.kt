
import java.util.Scanner;

// Print Pattern
fun main(args:Array<String>) {
    val reader = Scanner(System.`in`)
    var n:Int = reader.nextInt()

    for(i in 1..n) {
        for (j in i downTo 1)
            print(j)
        println()
    }
}