fun main() {
    val orders = mutableMapOf(
        Pair(3, 15.0),
        1 to 20.0,
        2 to 34.0
    )

//    val orderValue = orders.getValue(5)
//    println(orderValue)

    val message = orders.getOrElse(5) {
        "Order not found!"
    }
    println(message)

    val message2 = orders.getOrDefault(5, -1.0)
    println(message2)

    println(orders.keys)
    println(orders.values)

    for (number in orders.keys) {
        println("Order $number")
    }

    for (value in orders.values) {
        println("Order $value")
    }

    val filteredOrders = orders.filter { (number, value) ->
        number % 2 == 0 && value > 15
    }

    println("Filtered orders: $filteredOrders")
}

fun testMap() {
    //    mapOf(
//        Pair(1, 20.0),
//        Pair(2, 34.0)
//    )

    // Tem perda de performance, se precisar de performance use o Pair
    val orders = mutableMapOf(
        Pair(3, 15.0),
        1 to 20.0,
        2 to 34.0
    )

    println(orders)

    val order = orders[1]
    order?.let {
        println("Order: $it")
    }

    for (orderLoop in orders) {
        println("Order number ${orderLoop.key}")
        println("Order value ${orderLoop.value}")
    }

    orders[4] = 74.0
    println(orders)

    orders.put(5, 80.0)
    println(orders)

    orders.put(1, 100.0)
    println(orders)

    orders.putIfAbsent(6, 200.0)
    println(orders)

    orders.putIfAbsent(6, 100.0)
    println(orders)

    orders.remove(6)
    println(orders)

    orders.remove(3, 16.0)
    println(orders)
}

