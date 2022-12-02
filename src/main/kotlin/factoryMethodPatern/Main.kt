package factoryMethodPatern

import factoryMethodPatern.idcard.IDCardFactory

fun main(args: Array<String>) {
    val factory = IDCardFactory()
    val card1 = factory.create("Hoge")
    val card2 = factory.create("Fuga")
    val card3 = factory.create("GONZABURO")

    card1.use()
    card2.use()
    card3.use()
}