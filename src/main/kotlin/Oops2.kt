fun main() {
//    val person = Person("")
//  person.setName("arjun")
//    println(person.getName())

    val person = Person2(0)
    person.age = 22
    println(person.age)

}

class Person(private var name:String) {
    fun getName(): String{
        return name
    }

    fun setName(n: String){
        name = n
    }

}

class Person2( age:Int){
    private var _age = age

    var age: Int
        get() = _age
        set(value) {
            if (value > 0){
                _age = value
            }
        }

}