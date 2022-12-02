package adapterPattern

fun main(args: Array<String>) {
    var p: IPrint = PrintBunner("Hello")
    p.printWeak()
    p.printStrong()
}