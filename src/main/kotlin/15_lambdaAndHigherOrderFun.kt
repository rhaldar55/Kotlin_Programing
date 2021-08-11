fun main() {
    val  program = Program()
    program.addTwoNumbers(5,8)

    program.addTwoNumbers(5,8, object : MyInterface{
        override fun execute(sum: Int) {
            println(sum)
        }

    })

    val test:String = "Hello"
    val myLambda : (Int) -> Unit = { s : Int ->  println(s) } //Lambda Expression [Function]
   // val myLambda1 : (Int) -> Int = { s : Int ->  23 }
   // val myLambda2 : (Int) -> String = { s : Int ->  "Hello" }

    program.addTwoNumbers(2,7,myLambda)
    program.addTwoNumbers(2,7,{ s : Int ->  println(s) })
}

class Program{

    fun addTwoNumbers(a: Int, b:Int, ){ //Simple way
        val sum = a+b
        println(sum)
    }

    fun addTwoNumbers(a: Int, b:Int, action : MyInterface){ //Using Interface
        val sum = a+b
        action.execute(sum)
       // println(sum)
    }



    fun addTwoNumbers(a: Int, b:Int, action: (Int) -> Unit){ //High level function with lambda
        val sum = a+b
        action(sum)     // println(s)
        //println(sum)
    }

}


interface MyInterface{
    fun execute(sum: Int)
}
