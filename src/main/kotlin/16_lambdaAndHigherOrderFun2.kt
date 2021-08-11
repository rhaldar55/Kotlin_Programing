fun main() {
    val program = Program1()

    val myLambda: (Int, Int) -> Int = { x: Int, y: Int -> x + y } //Lambda Expression [Function]
    program.addTwoNumbers(2, 7, myLambda)
    program.addTwoNumbers(2, 7, { x, y -> x + y })
    program.addTwoNumbers(2, 7) { x, y -> x + y }


    // "it" keyword in Lambda expression
    program.reverseAndDisplay("HELLO", {s -> s.reversed()})
    program.reverseAndDisplay("HELLO", {it.reversed()})

    //WITH and APPLY
    program.name = "Ramesh"
    program.age = 23

    println(program.name)
    println(program.age)


    with(program){
        name = "HALDAR"
        age = 25
    }

    println(program.name)
    println(program.age)

    program.apply {
        name = "RAMESH"
        age = 25
    }.startRun()
}

class Program1 {

    fun addTwoNumbers(a: Int, b: Int, action: (Int, Int) -> Int) { //High level function with lambda
        //val sum = a + b
        val result = action(a, b)  //x+y =a+b
        println(result)
    }


    fun reverseAndDisplay(str: String, myFun:(String)->String){

       var result = myFun(str)
        println(result)
    }


    var name : String = ""
    var age : Int = -1

    fun startRun(){
        println("Now i am running....")
    }
}




