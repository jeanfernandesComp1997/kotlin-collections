fun main() {
    val orders = listOf(
        Order(1, 20.0),
        Order(2, 30.0),
        Order(3, 15.0),
        Order(4, 10.0)
    )

    println(orders)

//    val mappedOrders = orders.associate { order: Order ->
//        Pair(order.number, order)
//    }

    val mappedOrders = orders.associateBy { order -> order.number }
    println(mappedOrders)

    val ordersFreeShipping = orders.associateWith { order ->
        order.value > 20.0
    }
    println(ordersFreeShipping)


    val ordersFreeShippingGroup = orders.groupBy { order ->
        order.value > 20.0
    }
    println(ordersFreeShippingGroup)

    val names = listOf("Jean", "Carol", "Gabriel", "Geane")

    val agenda: Map<Char, List<String>> = names.groupBy { name ->
        name.first()
    }
    println(agenda)
}

data class Order(
    val number: Int,
    val value: Double
)

