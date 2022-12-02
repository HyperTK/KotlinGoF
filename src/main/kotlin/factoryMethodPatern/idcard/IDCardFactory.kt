package factoryMethodPatern.idcard

import factoryMethodPatern.framework.Factory
import factoryMethodPatern.framework.Product

class IDCardFactory : Factory() {
    override fun createProduct(owner: String): Product {
        return IDCard(owner)
    }

    override fun registerProduct(product: Product) {
        println("${product}を登録しました。")
    }

}