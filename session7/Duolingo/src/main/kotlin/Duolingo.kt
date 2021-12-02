class Duolingo {

    val words = setOf<Word>(
    Word("ichi", "een", "Japanese"), Word("ni", "twee", "Japanese"),
    Word("san", "drie", "Japanese"),
    Word("yon", "vier", "Japanese"),
    Word("mizu", "water", "Japanese"),
    Word("migi", "links", "Japanese"),
    Word("juu", "tien", "Japanese"),
    Word("kane", "geld", "Japanese"),
    Word("tabun", "waarschijnlijk", "Japanese"),
    Word("kimi", "jouw", "Japanese")
    )


    fun play(){
   val selectedwords = words.shuffled().take(5).toMutableSet()

        while (selectedwords.count() > 0){
            val selectedword = selectedwords.random()
            println("translate the following word to Dutch: ${selectedword.original}")
            val userAnswer = readLine()

            if (selectedword.translated == userAnswer){
                selectedwords.remove(selectedword)
                println("Correct!")
            } else {
                println("The correct answer is ${selectedword.translated}")
            }
            println("You have ${selectedwords.count()} words left.")
        }
        println("You are finished!")
}

}