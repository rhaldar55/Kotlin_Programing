fun main() {
    sum()   //Calling Function
    sum(5, 4)
    var sum = sumWithReturn(2,5)
    var largeValue =max(4,8)

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


