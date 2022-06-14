fun main() {
//    mapOf(
//        Pair(1, 20.0),
//        Pair(2, 34.0)
//    )

    // Tem perda de performance, se precisar de performance use o Pair
    val orders = mapOf(
        1 to 20.0,
        2 to 34.0
    )

    println(orders)

    val order = orders[1]
    order?.let {
        println("Order: $it")
    }

    for (order in orders) {
        println("Order number ${order.key}")
        println("Order value ${order.value}")

    }
}

