fun main() {
    var dog = Dog1()
    dog.eat()

    var cat = Cat1()
    cat.eat()

    var animal1 = Animal1()
    animal1.eat()

    var dog2 = Dog2("Black","Pug")

}

open class Animal1 {
    open var color: String = "White"

    open fun eat() {
        println("Animal Eating...")
    }
}

class Dog1 : Animal1() {

    var bread: String = ""
    override var color: String = "Black"

    fun bark() {
        println("Bark")
    }

    override fun eat() {
        super<Animal1>.eat()
        println("Dog is Eating...")
    }
}

class Cat1 : Animal1() {
    var age: String = ""

    fun meow() {
        println("Meow")
    }

    override fun eat() {
        println("Cat is Eating...")
    }
}

//Inheritance with Primary Constructors
open class Animal2(var color : String) {
    init {
        println("From Animal Init $color")
    }
}

class Dog2(color: String, var bread : String ) : Animal2(color) {
    init {
        println("From Dog Init $color and $bread")
    }

}
//Inheritance with Secondary Constructors
open class Animal3 {
    var color : String = ""

    constructor(color: String){
        this.color = color
        println("From Animal Init $color")
    }
}

class Dog3 : Animal3 {

    var bread :String = ""

   constructor(color: String, bread: String) : super(color) {
       this.bread = bread
       println("From Dog Init $color and $bread")
   }
}