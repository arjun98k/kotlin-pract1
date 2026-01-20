fun main() {
    val dog = Dogs()
    dog.walk()
    dog.makeSound()
}

open class Animal {
    fun walk(){
        println("animal can walk ")
    }
    open fun makeSound(){
        println("animal make sound")
    }

}

class  Dogs:Animal() {
    override fun makeSound(){
        println("dogs make barking sound")
    }
}