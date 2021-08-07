fun main(args: Array<String>) {

    //Call Java class ()
    var area = JavaInteroperability.getArea(10,5)
    println("Area from Java file : "+ area)
}

fun add(a: Int, b:Int): Int{
    return a+b
}
