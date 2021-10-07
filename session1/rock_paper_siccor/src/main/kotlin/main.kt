
val list = arrayOf("Rock", "Paper", "Scissors")
var computer = list.random()

var userChoice = getUserChoice2()

fun getUserChoice2() : String? {
    print("your choice: ")

val enteredString = readLine()
    return enteredString
}

fun main() {
    if (computer == userChoice) {
        println("Tie")
    }

    if (computer == "Rock") {
        if (userChoice == "Paper") {
            println("You win")
        } else {
            println("You lose")
        }
    }

    if (computer == "Paper") {
        if (userChoice == "Scissors") {
            println("You win")
        } else {
            println("You lose")
        }
    }
    if (computer == "Scissors") {
    if (userChoice == "Rock") {
        println("You win")
    } else {
        println("You lose")
    }
}

}
