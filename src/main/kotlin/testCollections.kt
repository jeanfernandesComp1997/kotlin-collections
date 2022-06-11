fun testCollection() {
    val names = listOf(
        "Jean",
        "Carol",
        "Gabriel",
        "Geane"
    )

    println(names)

    val mutableNames = mutableListOf(
        "Jean",
        "Carol",
        "Gabriel",
        "Geane"
    )

    mutableNames.remove("Jean")

    println(mutableNames)
}