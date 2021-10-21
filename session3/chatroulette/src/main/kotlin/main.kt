

fun main() {
     val people = arrayOf(Student("Axel"), Teacher("Jeroen"), Comedian("Gauthier"), Person("Mitch"))

     val randomPerson = people.random()
     randomPerson.introduce()
randomPerson.talk()
}


