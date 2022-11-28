package iteratorPattern

fun main(args: Array<String>) {
    val bookShelf = BookShelf(4).apply {
        appendBook(Book("Teppei1"))
        appendBook(Book("Teppei2"))
        appendBook(Book("Teppei3"))
        appendBook(Book("Teppei4"))
    }

    val ite = bookShelf.iterator()
    while (ite.hasNext()) {
        var book = ite.next()
        println(book.getName())
    }
    println()
    for (i in bookShelf) {
        println(i.getName())
    }


}