fun main() {
    val dog = Dogs("",0)
    dog.eat()
    dog.sound()

}

abstract class Animal(val name: String , val animalRollId: Int){


    abstract fun eat()

    fun sound(){
        println("animal have thier own sound")
    }

}

class Dogs(name: String, animalRollId: Int) :Animal(name, animalRollId){
    override fun eat(){
        println("dogs like bone")
    }

}
