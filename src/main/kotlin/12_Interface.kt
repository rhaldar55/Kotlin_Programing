fun main() {
    var myBtn = Button()
    myBtn.onClick()
    myBtn.onTouch()
}

interface MyInterfaceListener {     //Can not create instance of interface
    //abstract open var name : String
    var name : String //Properties in interface are abstract by default
    abstract fun onTouch()
    fun onClick(){
        println("Button was clicked on : Interface Code")
    }
}


class Button : MyInterfaceListener {
    override var name: String = "Dummy Name"

    override fun onTouch() {
       //Define our own code
        println("Button was touched")
    }

    override fun onClick() {   //optional to override
        super.onClick()
        println("Button was clicked")
    }

}

