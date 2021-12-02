class Duolingo() {


    val words = setOf<Word>(
    Word("mizu", "water", "Japanese"),
    Word("migi", "links", "Japanese"),
    Word("kane", "geld", "Japanese"),
    Word("tabun", "waarschijnlijk", "Japanese"),
    Word("kimi", "jouw", "Japanese"),
    Word("tea", "thee", "English"),
    Word("biscuit", "koekje", "English"),
    Word("beans", "bonen", "English"),
    Word("rain", "regen", "English"),
    Word("mate", "maat", "English")
    )


    fun play(){

        println("How many rounds?")
        val wordAmount = readLine()!!.toInt()
        val selectedLanguage = "Japanese"
        val selectedwords = words.shuffled().filter { it.language == "Japanese" }.take(wordAmount).toMutableSet()

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