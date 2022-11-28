package iteratorPattern

class BookShelf(maxSize: Int) : Iterable<Book> {
    private var books: Array<Book?> = emptyArray()
    private var last: Int = 0

    init {
        require(maxSize > 0){"要素数は0より大きい数を指定してください"}
        books = arrayOfNulls(maxSize)
    }

    /**
     * 指定要素のBookインスタンスを取得する
     * @param index インデックス
     * @return 指定要素のBookインスタンス
     */
    fun getBookAt(index: Int): Book? = books[index]

    /**
     * Book配列に要素を追加する
     * @param book Bookインスタンス
     */
    fun appendBook(book: Book) {
        books[last] = book
        last++
    }

    /**
     * 配列の長さを返す
     * @return 配列の長さ
     */
    fun getLength(): Int = last

    override fun iterator(): Iterator<Book> = BookShelfIterator(this)
}