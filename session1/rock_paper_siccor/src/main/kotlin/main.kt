
val list = arrayOf("Rock", "Paper", "Scissors")
var random = list.random()
var userChoice = "Rock"

fun main(){
    if (random == "Rock" && userChoice == "Rock") {
        println("Tie")
    }
    if (random == "Paper" && userChoice == "Paper") {
        println("Tie")
    }
    if (random == "Scissors" && userChoice == "Scissors") {
        println("Tie")
    }
    if (random == "Rock" && userChoice == "Paper") {
        println("You win!")
    }
    if (random == "Rock" && userChoice == "Scissors") {
        println("You lose!")
    }
    if (random == "Paper" && userChoice == "Rock") {
        println("You lose!")
    }
    if (random == "Paper" && userChoice == "Scissors") {
        println("You win!")
    }
    if (random == "Scissors" && userChoice == "Paper") {
        println("You lose!")
    }
    if (random == "Scissors" && userChoice == "Rock") {
        println("You win!")
    }
}

