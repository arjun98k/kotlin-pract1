 fun  main() {
     val obj1=Oops1("arjun")
     val obj = Oops1("akash",12)
  
   
     print("${obj.name} and ${obj.age}")
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

//fun main() {
//    val obj1 = Person("Arjun")
//    val obj2 = Person("Akash", 12)
//
//    println("${obj1.name} and ${obj1.age}")
//    println("${obj2.name} and ${obj2.age}")
//}
//
//class Person(
//    val name: String,
//    val age: Int = 0
//)
