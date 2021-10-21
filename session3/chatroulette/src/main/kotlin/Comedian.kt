open class Comedian(override val name: String):Person(name){
    override  fun talk(){
        tellJoke()
    }

    fun tellJoke(){
        println("What's brown and sticky? A stick!")
    }
}