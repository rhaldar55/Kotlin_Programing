fun main() {

    val a = 2;
    val b = 5;
    var maxValue :Int

    //IF
    if (a>b)
        maxValue = a
    else
        maxValue = b

    println(maxValue)

    //IF as Expression
    var maxValue1 :Int = if (a>b) a else b
    println(maxValue1)

    //WHEN
    val x = 20
    when(x){
        1-> println("x is 1")
        2-> println("x is 2")
        3,4-> println("x is 3 or 4")
        in 1..20-> println("x lies in 1 to 20")
        else-> println("x is unknown")
    }

    //WHEN as Expression
    var str : String =  when(x){
        1-> "x is 1"
        2-> "x is 2"
        else-> "x is unknown"
    }

    println(str)

}