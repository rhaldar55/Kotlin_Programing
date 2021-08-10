fun main() {
    //var person4 = Person4()   //Can not instantiate

}

abstract open class Person4 {

    open var name: String = "Dummy Name"
    abstract var name1: String

    abstract fun eat()  //abstract properties are "open" by default
    open fun getHeight() {}  //A "open" function ready to be overridden
    fun goToSchool() {}  //A Normal Function public and final by default
}

class Indian1 : Person4() {

    override var name : String = "Dumy indian Name"
    override var name1: String = "Dumy indian Name"

    override fun eat() {

    }

    override fun getHeight() {

    }
}

