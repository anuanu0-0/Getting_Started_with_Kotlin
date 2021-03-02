import java.util.Scanner

// Print Multiplication Table
fun main(args:Array<String>) {
    val reader = Scanner(System.`in`)
    var num:Int = reader.nextInt();
    for(i in 1..10)
        println(i*num)
}