fun main() {

}

private class Persons{

}

//internal can visible same Module/package
internal class Persons1{

}

open class Person3{
    private val a =1
    protected val b =2
    internal val c =3
    val d = 10
}

class Indian: Person3(){
    //a is not visible
    //b,c,d are visible

    fun test(){
        println(d)
        println(c)
        println(b)
       // println(a)
    }
}