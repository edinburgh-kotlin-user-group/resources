package com.kug

/**
 * Q: Anyone know why val requires to be declared
 *    const yet 'lateinit val T = 9' indicates
 *    that val is immutable?
 *
 * NOTE: Seems this is no longer the case!
 */
fun questionKugNumber1(){
    const val MY_CONSTANT = 9
}

/**
 * ## Kotlin User Group Meeting 2
 *
 * ### What does the code do?
 *
 * Using IntelliJ to [convert](https://youtrack.jetbrains.com/issue/KT-21231) this Java:
 *
 * ```
 * int lastIndex = 5;
 * for (int i = 0; i < lastIndex; i++) {
 *   lastIndex--;
 *   System.out.println(lastIndex);
 * }
 * ```
 *
 * which outputs
 *
 * ```
 * 4
 * 3
 * 2
 * ```
 *
 * What is the output of this code?
 */
fun questionKugNumber2(){
    println("And the output of the question is...")
    var lastIndex = 5
    for (i in 0 until lastIndex) {
        lastIndex--
        println(lastIndex)
    }
}


/**
 * # Kotlin User Group Meeting 3
 *
 * This piece of code creates something different, depending on the
 * operating system it's run on.
 *
 * Should be pretty easy to guess which OS is the exception but can
 * anyone tell us why?
 */
fun questionKugNumber3(){
    const val value my_Multi_Line_String = """
                Why is this code
                not mulitplatorm?
                """.trimMargin()
}

/**
 * 1. What does it print?
 * 2. How do you prevent the caller breaking the forEach loop?
 * Bonus: 3. What happens if puzzlePieces is private?
 */
typealias PuzzlePiece = String

class Puzzle {
    val puzzlePieces: List<PuzzlePiece> = listOf("foo", "bar", "qux")
    inline fun inspectPieces(inspect: (PuzzlePiece) -> Unit) =
        puzzlePieces.forEach(inspect)
}

fun questionKugNumber4(){
    val p = Puzzle()
    p.inspectPieces { pp ->
        if (pp == "bar")
            return
        else
            println(pp)
    }
}

fun main() {
    questionKugNumber4()
}
