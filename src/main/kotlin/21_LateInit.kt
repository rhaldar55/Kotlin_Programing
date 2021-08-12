fun main() {

    var country = Country()
    //country.name =  "INDIA"
    //println(country.name)
    country.setup()
}

class Country{
    //var name : String = "dummy name"
    //var name : String? = null
    lateinit var name : String

    fun setup(){
        name = "INDIA"
        println("The name of country is $name")
    }

}



//lateinit used only with mutable data type [var]
//val is not allowed
//lateinit used only with non-nullable data type
//lateinit value must be initialised before you use it

