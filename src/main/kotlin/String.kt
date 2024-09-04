fun main(args: Array<String>) {
    val myName: String = "Miza Hilmiya"
    for(chr in myName){
        print(chr)
    }
    print('\n')

    val s = "abc" + 1
    println(s+ "def")

    /*var  text = """
        for (c in "foo")
            print(c) 
    """
    println(text)*/

    var text= """
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Benjamin Frenklin)
    """.trimIndent()
    println(text)
}