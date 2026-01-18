fun  main() {
    val obj = Oops1("akash",0)
    val obj2 = Oops1("arjun",12)
    print(obj.name)
}

class Oops1 {
    val name:String
    val age:Int

    constructor(name:String){
      this.name= name
      this.age = 0
    }

    constructor(name:String , age:Int){
        this.name = name
        this.age = age

    }
}