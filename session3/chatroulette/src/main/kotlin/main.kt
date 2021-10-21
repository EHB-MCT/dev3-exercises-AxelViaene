

fun main() {
     val people = arrayOf(Student("Axel"), Teacher("Jeroen"), Comedian("Gauthier"), Chatbot())

     val randomPerson = people.random()
     randomPerson.introduce()
randomPerson.talk()
}


