package factoryMethodPatern.idcard

import factoryMethodPatern.framework.Product

class IDCard : Product {
    private var owner: String

    constructor(_owner: String){
        println("${_owner}のカードを作ります。")
        owner = _owner
    }
    override fun use() {
        println("${this}を使います。")
    }

    override fun toString(): String {
        return "[IDCard:$owner]"
    }
    fun getOwner(): String {
        return owner
    }
}