package adapterPattern

class PrintBunner(string: String) : Banner(string), IPrint {
    /**
     * カッコで弱めに強調する
     */
    override fun printWeak() {
        showWithParen()
    }

    /**
     * アスタリスクで強調する
     */
    override fun printStrong() {
        showWithAster()
    }
}