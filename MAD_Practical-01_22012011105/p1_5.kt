fun main()
{
    print("enter month number : ")
    var n= readLine()!!.toInt()
    println(
        when (n){
        1 -> {"JANUARY"}
        2 -> {"FEBRUARY"}
        3 -> {"MARCH"}
        4 -> {"APRIL"}
        5 -> {"MAY"}
        6 -> {"JUNE"}
        7 -> {"JULY"}
        8 -> {"AUGUST"}
        9 -> {"SEPTEMBER"}
        10 ->{"OCTOBER"}
        11 -> {"NOVEMBER"}
        12 -> {"DECEMBER"}
        else -> {"INVALID"}
    })
}