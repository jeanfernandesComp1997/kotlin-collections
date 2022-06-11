fun main() {
    val database = NamesDataBase()

    val savedNames = database.names
    println(savedNames)

    database.save("Jean")

    println(database.names)
    println(NamesDataBase().names)
}

class NamesDataBase {
    // private val _names = mutableListOf<String>()
    val names: Collection<String> get() = data.toList()

    companion object {
        private val data = mutableListOf<String>()
    }

    fun save(name: String) {
        data.add(name)
    }
}
