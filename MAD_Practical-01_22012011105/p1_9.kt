fun main()
{
    val arr = arrayListOf(5, 12, 23, 8, 35)
    var x = arr[0]
    for (i in 0 until arr.size){
        if(x > arr[i])
        {
            x = x
        }
        else
        {
            x = arr[i]
        }
    }
    println("maximunm = $x")
}