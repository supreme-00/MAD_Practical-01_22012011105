class Matrix(val rows: Int, val cols: Int) {
    val data = Array(rows) { IntArray(cols) }

    operator fun plus(other: Matrix): Matrix {
        val result = Matrix(rows, cols)
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result.data[i][j] = this.data[i][j] + other.data[i][j]
            }
        }
        return result
    }

    operator fun minus(other: Matrix): Matrix {
        val result = Matrix(rows, cols)
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result.data[i][j] = this.data[i][j] - other.data[i][j]
            }
        }
        return result
    }

    operator fun times(other: Matrix): Matrix {
        val result = Matrix(rows, cols)
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result.data[i][j] = this.data[i][j] * other.data[i][j]
            }
        }
        return result
    }

    fun printMatrix() {
        println("($rows x $cols Matrix):")
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                print("${data[i][j]}\t")  // Print with tab for alignment
            }
            println()  // New line after each row
        }
    }
}

fun main (){
val matrix1 = Matrix(2, 2)
matrix1.data[0] = intArrayOf(1, 2)
matrix1.data[1] = intArrayOf(3, 4)

val matrix2 = Matrix(2, 2)
matrix2.data[0] = intArrayOf(5, 6)
matrix2.data[1] = intArrayOf(7, 8)

val matrixSum = matrix1 + matrix2
val matrixDiff = matrix1 - matrix2
val matrixProduct = matrix1 * matrix2

    println("Matrix 1: ")
    matrix1.printMatrix()

    println("Matrix 2: ")
    matrix2.printMatrix()

    println("Matrix Sum: ")
    matrixSum.printMatrix()

    println("Matrix Difference: ")
    matrixDiff.printMatrix()

    println("Matrix Product (Element-wise): ")
    matrixProduct.printMatrix()
}