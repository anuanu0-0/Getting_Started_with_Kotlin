
fun main(args:Array<String>) {
    val nums = arrayOf(1,2,3,4)
    println("Second pos: ${nums.get(1)}")
    println("Third pos: ${nums[2]}")
    // set(Index, Value)
    nums.set(3, 50)
    nums[1]=12
    println(nums.joinToString(","))

    // Array creation using constructor
    val numsZero = Array(4){1}
    println(numsZero.joinToString(","))
}