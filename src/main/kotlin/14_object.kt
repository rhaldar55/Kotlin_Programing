fun main() {

    // var customersData = CustomersData()
    //  customersData.count = 99
    // customersData.typeOfCustomers()

    CustomersData.count = 99
    CustomersData.typeOfCustomers()
    println(CustomersData.count)
    println(CustomersData.myMethod("Hello"))

}

open class MySuperClass{
    open fun myMethod(str:String){
        println("MySuperClass")
    }
}
object CustomersData :MySuperClass() {
    var count: Int = 1          //Behaves like STATIC variable

    fun typeOfCustomers(): String {     ////Behaves like STATIC method
        return "Indian"
    }

    override fun myMethod(str: String) {    //Currently begaving like STATIC method
        super.myMethod(str)
        println("CustomersData : "+ str)
    }

    init {

    }

}