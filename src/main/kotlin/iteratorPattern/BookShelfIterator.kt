package iteratorPattern

class BookShelfIterator(private val bookShelf: BookShelf) : Iterator<Book> {
    private var index = 0

    /**
     * 配列に次の要素が存在するか確認する
     * @return true/false
     */
    override fun hasNext(): Boolean {
        return index < bookShelf.getLength()
    }

    /**
     * 現在注目しているBookインスタンスを返す
     * @return 注目しているBookインスタンス
     */
    override fun next(): Book {
        require(hasNext()){NoSuchElementException()}
        val book = bookShelf.getBookAt(index)
        index++
        return book!!
    }

}