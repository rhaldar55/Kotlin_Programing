
//val pi : Float = 3.14f      //Waste of memory if not use
val pi : Float by lazy {
    3.14f
}

fun main() {

    println("Some initial code ...")

    println("Some more code ...")

    val area = pi * 4*8
    val area2 = pi * 7*9
}



//variable will not initialized unless you use it in your code

//variable can be var or val
//variable can be nullable or non-nullable