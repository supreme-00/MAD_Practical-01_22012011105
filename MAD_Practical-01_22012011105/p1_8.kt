//fun main()
//{
//    var A1 = arrayOf(10,90,60,80,100) A1.forEach( { index -> println(index) }) var A2 = Array<Int>(5){i -> i*2} A2.forEach ({ index -> println(index) })
import java.util.Collections.swap

fun main() {

    val a = arrayOf("kotlin", "java", "python", "c++")
    val b = Array<Int>(3) { 0 }
    val c = Array(7) { i -> i + 1 }
    val d = IntArray(5) { 0 }
    val e = intArrayOf(32, 544, 76, 87, 98)

    print("By Using arrayof (contentDeepToString) :  ")
    println(a.contentDeepToString())
    print("By Using arrayof (joinToString) :  ")
    println(a.joinToString())
    print("By Using Array<> :  ")
    println (b.contentDeepToString())
    print("By using Lambda Function :  ")
    println(c.contentToString())
    print("By Using IntArray Function :  ")
    println(d.joinToString())
    print("By Using IntArrayOf Function :  ")
    println(e.joinToString())

    val f = arrayOf(
        arrayOf(1, 3),
        arrayOf(4, 5),
        arrayOf(6, 7)
    )
    println("2D Array : " + f.contentDeepToString())

    println("Enter the size of the array:")
    val size = readLine()!!.toInt()
    val array = IntArray(size)
    println("Enter the elements of the array:")
    for (i in 0 until size) {
        array[i] = readLine()!!.toInt()
    }
    println("The array is:")
    println(array.contentToString())
    println("*Sort With Built-in Function* ")
    val q=array.sorted()
    println(q.joinToString())
    println("Sort Without Built-in Function")
    val sortedNumbers = bubbleSort(array)
    println("Sorted: ${sortedNumbers.contentToString()}")

}
fun bubbleSort(array: IntArray): IntArray {
    val n = array.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (array[j] > array[j + 1]) {
                // Swap elements
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
    return array
}