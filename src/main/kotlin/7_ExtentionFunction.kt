fun main() {

    var student = Student()
    println("Passed status : "+ student.hasPassed(79))
    println("Scolar status : "+ student.isScolar(95))

    val str1:String = "Hello"
    val str2:String = "World"
    var str3:String = "Hey"

    //str3 = str3 + str2 + str1
    str3.add(str1,str2)

    val x:Int = 6
    val y:Int = 10
    val greterVal2 =  x greaterValue2 y


}

//Extention Function
fun Student.isScolar(marks: Int):Boolean{
    return marks>90
}
class Student{
    fun hasPassed(marks:Int): Boolean{
        return  marks>40
    }
}


//Extention Function for String
fun String.add(s1:String, s2:String):String{
    return  this+s1+s2
}

//Extention Function for Int
fun Int.greaterValue(other:Int) : Int{
    if (this>other)
        return this
    else
        return other
}


//*****************Infix Function************
//Infix Function can be a Member Function or Extention Function
//They have SINGLE Parameter
//They have prefix of "infix"

infix fun Int.greaterValue2(other:Int) : Int{
    if (this>other)
        return this
    else
        return other
}

/*
* 1. All Infix function are extension function
*       BUT all extention function are not infix
*
* 2. INFIX finctions jst have ONE Parameter
* */

