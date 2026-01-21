fun main() {
    val payment = Gpay()
    val payment2 = PhonePe()
//    payment.paymentOnline()
//    payment2.paymentOnline()

    val paymentmode = PaymentMethod()
    paymentmode.payOffline()
    paymentmode.payOnline()
    paymentmode.pay()
}

interface Payment {
    fun paymentOnline()

}

class Gpay:Payment {
    override fun paymentOnline(){
        println("payment done through gpay")
    }
}

class  PhonePe:Payment {
    override fun paymentOnline() {
        println("payment done trhough Phonepe")
    }
}

interface OnlinePayment {
    fun payOnline()
    fun pay(){
        println("payment online accept")
    }
}

interface offlinePayement {
    fun payOffline()
    fun pay(){
        println("payment accept offline")
    }
}

class PaymentMethod: OnlinePayment,offlinePayement {
    override fun payOffline() {
        println("payment done onlin mode")
    }

    override fun payOnline() {
        println("payment done by cash offline mode")
    }

    override fun pay() {
      super<offlinePayement>.pay()
        super<OnlinePayment>.pay()
    }
}
