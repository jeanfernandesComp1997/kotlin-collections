fun main() {
    val watchedMicroservicesCourse = listOf("Jean", "Felipe", "Leo")
    val watchedKotlinCourse = listOf("Jean", "Felipe", "Carlos")

    val watchedBoth = watchedKotlinCourse + watchedMicroservicesCourse

    println(watchedBoth.distinct())
}


