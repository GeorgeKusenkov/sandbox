fun main() {

    val greetingFunction = { playerName: String, numBuildings:Int ->
        val currentYear =2021
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }

    println(greetingFunction("Ega", 12))
}
