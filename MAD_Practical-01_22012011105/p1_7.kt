
fun factorial(n: Int): Int {
    return if (n == 1) n else n * factorial(n - 1)
}
fun main(){
    println("Factorial of 5: ${factorial(5)}")
    println("Factorial of 6: ${factorial(6)}")
}








