fun main() {
    println("You are on a dangerous mission to destroy the One Ring.")
    challengeOne()
}

fun challengeOne() {
    println("Give a name of a city in Middle Earth.")
    val answers = setOf("Edoras", "Minas Tirith", "Lothlien", "Bree")
    var userAnswer = readLine()
    if (answers.contains(userAnswer)) {
        println("You may succeed")
    }
else{
    println("Try again")
    }
}



