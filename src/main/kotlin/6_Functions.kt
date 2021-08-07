fun main() {
    sum()   //Calling Function
    sum(5, 4)
    var sum = sumWithReturn(2,5)
    var largeValue =max(4,8)

    var result = findVolume(2,3)
    println(result)
    result = findVolume(2,3,5)
    println(result)

    result = findVolume2(height = 20, length = 20, breadth = 40)//Named param
    

}

//FUNCTION
fun sum() {
    var a = 2
    var b = 4
    println("Sum is ${a + b}")
}

//Function takes args
fun sum(a: Int, b: Int) {
    println("Sum is ${a + b}")
}

//Function takes args and return result
fun sumWithReturn(a: Int, b: Int) : Int{
    return a+b
}

//Function as Expression
fun max(a: Int, b:Int) : Int = if (a>b) a else b

//Default Argument in Function
fun findVolume(length: Int, breadth:Int, height:Int = 10): Int{
    return length*breadth*height
}

//Named Parameter
fun findVolume2(length: Int, breadth:Int, height:Int): Int{
    return length*breadth*height
}



