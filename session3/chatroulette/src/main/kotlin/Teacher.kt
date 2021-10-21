class Teacher(override val name: String):Person(name) {

    override  fun talk(){
        funFact()
    }
    fun funFact(){
        println("The average human has less than 2 eyes.")
    }
}