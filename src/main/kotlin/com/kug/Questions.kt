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

fun main() {
    questionKugNumber2()
}