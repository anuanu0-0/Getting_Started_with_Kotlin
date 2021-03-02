import java.util.Scanner;

// Power Function
fun main(args:Array<String>) {
    val reader = Scanner(System.`in`)
    var x:Int = reader.nextInt()
    var n:Int = reader.nextInt()
    var result:Int = 1

    for(i in 1..n)
       result = x*result

    println(result)
}