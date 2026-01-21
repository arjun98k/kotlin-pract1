fun main() {
    val dog = Dogs()
    dog.eat()

}

abstract class Animal{
    abstract fun eat()

    fun sound(){
        println("animal have thier own sound")
    }

}

class Dogs:Animal(){
    override fun eat(){
        println("dogs like bone")
    }

}
