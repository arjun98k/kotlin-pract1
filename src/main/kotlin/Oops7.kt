fun main() {
val car = Car(Engine())
    car.startengine()
val car2 = Car2(PetrolEngine())
    car2.start()

}

class Engine {
    fun start(){
        println("engine start")
    }
}

class Car(val engine: Engine){
    fun startengine(){
        engine.start()
    }
}

interface Engine2{
    fun start()
}

class PetrolEngine:Engine2 {
    override fun start() {
        println("engine start from petrol engine")
    }
}

class Car2(engine: Engine2): Engine2 by engine