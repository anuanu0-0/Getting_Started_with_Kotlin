import java.util.Scanner;

// Find Duplicate Number
fun main(args:Array<String>) {
    val reader = Scanner(System.`in`)
    var t: Int = reader.nextInt()
    var n: Int = 0
    while(t-- > 0) {
        n = reader.nextInt()
        var arr = IntArray(n){reader.nextInt()}
        println(getDouble(arr, n))
    }
}

fun getDouble(arr:IntArray, size:Int):Int {
    var result:Int = arr[0]
    for(i in 1..size-1)
        result = result xor arr[i]

    return result
}


