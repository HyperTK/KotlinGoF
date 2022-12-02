package adapterPattern

open class Banner(private val string: String) {
    fun showWithParen(): Unit {
        println("($string)")
    }

    fun showWithAster() {
        println("*$string*")
    }
}