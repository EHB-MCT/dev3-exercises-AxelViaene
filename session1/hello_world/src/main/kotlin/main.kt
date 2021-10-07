fun main () {
   val friends = arrayOf("Freya", "Finn", "Benoit", "Ilyes")

    for (friend in friends) {
        greet(friend)
    }
    greet("Bob")
}

fun greet (name:String) {
    println("Hello $name")
}