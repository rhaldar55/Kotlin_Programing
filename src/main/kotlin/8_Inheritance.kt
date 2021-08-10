fun main() {
    var dog = Dog()
    dog.bread = "labra"
    dog.color = "black"
    dog.bark()
    dog.eat()

    var cat = Cat()
    cat.age = "7"
    cat.color = "black"
    cat.meow()
    cat.eat()

    var animal = Animal()
    animal.color = "white"
    animal.eat()
}

open class Animal{
    var color: String =""
    fun eat(){
        println("Eat")
    }
}

class Dog: Animal(){

    var bread: String =""

    fun bark(){
        println("Bark")
    }
}

class Cat: Animal(){
    var age: String =""

    fun meow(){
        println("Meow")
    }
}

