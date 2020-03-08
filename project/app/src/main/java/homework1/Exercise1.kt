package homework1

//A
open class Account(val ownerName: String, var balance: Int = 0) {

    open fun withdraw(amount: Int) {
        balance -= amount;
    }

    fun deposit(amount: Int) {
        balance += amount
    }
}

//B
class SavingAccount(val ownerName1: String, var balance1: Int = 0) : Account(ownerName1, balance1) {

    override fun withdraw(amount: Int) {
        if (balance1 - amount >= 0) {
            balance1 += amount
        } else {
            println("Sorry, your account doesn't have that much money!")
        }
    }
}

fun main(){
    val account1 = Account("Bogdan")
    val account2 = SavingAccount("Julia")

    account1.deposit(400)
    account1.withdraw(600)

    println(account1.balance)

    account2.deposit(300)
    account2.withdraw(500)

    println(account2.balance)
}