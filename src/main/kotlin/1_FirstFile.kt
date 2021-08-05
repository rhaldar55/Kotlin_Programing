fun main(args: Array<String>){

    println("Hello World !")
    println("Hello Kotlin")
    println(10-9)
    println(true)

    //Variable and Data Type
    var myNumber = 10   //Int
    var myDecimal = 1.0 //Float
    var myString: String    //Mutable String

    myString = "Hello World"
    myString = "Another World"  //Value can be change

    val myAnotherStr = "My Constant String Value"   ////Immutable String
    //myAnotherStr = "Hello"  //Value can't be change


    //Functional Class and String Interpolation
    var name : String
    name = "Steve"
    //println(name)
    displayName(name)

    var personObject = Person()     //Create Object
    personObject.displayName(name)  //call function inside class
}

//Function
fun displayName(name:String){
    println(name)
}

//Class
class Person{
    fun displayName(name:String){
        println("Name of person is : "+name)
        println("Name of person is : $name")
    }
}

