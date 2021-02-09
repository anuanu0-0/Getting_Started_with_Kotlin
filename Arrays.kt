fun main () {
    val nums = arrayOf(1, 2, 3, 4)

    println("Second pos: ${nums.get(1)}")
    println("Third pos: ${nums[2]}")
    nums.set(3, 10) // set(Index, Value)
    nums[1]=12
    println(nums.joinToString (","))

    // Array creation using constructor
    val numsZero = Array(4){0}
    println(numsZero.joinToString ("," ))
}