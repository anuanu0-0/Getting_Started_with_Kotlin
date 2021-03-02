import java.util.Scanner;

// Fibonacci Numbers
fun main(args:Array<String>) {
    val reader = Scanner(System.`in`)
    val arr = Array(10017) {0}
    precompute(arr)
    var n:Int = reader.nextInt()
    val result:Boolean = if(arr.contains(n)) true else false
    println(result)
}

fun precompute(arr:Array<Int>) : Unit{
    arr[0]=0
    arr[1]=1

    for(i in 2..10000) {
        arr[i] = arr[i-1] + arr[i-2]
    }
}
