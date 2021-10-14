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
        challengeThree()
    }
    else {
    println("Game Over")
    }
}

fun challengeThree(){
    println("You face a Balrog from the deep, choose your weapon: bow, staff or sword.")
    val answers = setOf("sword", "bow", "staff")
    var userAnswer = readLine()
    if (userAnswer == "sword"){
        println("game over")
    }
    if (userAnswer == "bow"){
        println("You are driven back but manage to retreat.")
        challengeTwo()
    }
    if (userAnswer == "staff"){
        println("You shall not pass! Balrog defeated")
       
    }
}
