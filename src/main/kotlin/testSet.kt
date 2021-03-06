fun testSet() {
    //    val watchedMicroservicesCourse = listOf("Jean", "Felipe", "Leo")
//    val watchedKotlinCourse = listOf("Jean", "Felipe", "Carlos")
//    val watchedBoth = watchedKotlinCourse + watchedMicroservicesCourse
//
//    println(watchedBoth.distinct())

    val watchedMicroservicesCourse = setOf("Jean", "Felipe", "Leo")
    val watchedKotlinCourse = setOf("Jean", "Felipe", "Carlos")
    val watchedBoth = watchedKotlinCourse + watchedMicroservicesCourse

    println(watchedBoth)

    println(watchedKotlinCourse union watchedMicroservicesCourse)
    println(watchedKotlinCourse - watchedMicroservicesCourse)
    println(watchedKotlinCourse subtract watchedMicroservicesCourse)

    println(watchedKotlinCourse intersect watchedMicroservicesCourse)

    val watchedList = watchedBoth.toMutableList()
    watchedList.add("Jean")
    println(watchedList)
    println(watchedList.toSet())
}