class Student(override val name: String):Person(name) {
override fun talk() {
    gossip()
}
    fun gossip() {
        println("Hurr durr gossip hurr durr")
    }
}