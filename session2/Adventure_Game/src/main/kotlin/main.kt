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
        challengeTwo()

    }
else{
    println("Try again")
    }
}

fun challengeTwo(){
    println("I roll a 6-sided die. Guess high or low.")
    val randomNumber = (1..6).random()
    val guessNumber = readLine()
var acceptedAnswers = setOf<Int>()

    if (guessNumber == "low"){
         acceptedAnswers = setOf<Int>(1, 2, 3)
    }

    if (guessNumber == "high"){
        acceptedAnswers = setOf<Int>(4, 5, 6)
    }


    if (acceptedAnswers.contains(randomNumber)) {
       println("Correct")
    }
    else {
    println("Game Over")
    }
}

