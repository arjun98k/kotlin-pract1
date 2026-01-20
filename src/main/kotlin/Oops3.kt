fun main() {
  val account = BankAccount()
  account.debugBalance()
    val account2 = BankAccount2()
    account2.applyIntrested()

}


open class BankAccount {
    private var balance = 0

    protected fun addIntrested(){
        balance+=10
    }
    fun deposit(amount:Int){
        balance +=amount
    }
    internal fun debugBalance(): Int {  // 📦 Same app/module only
        return balance
    }

}

class BankAccount2: BankAccount(){
    fun applyIntrested(){
        addIntrested() // we can access this function in child class
    }

}