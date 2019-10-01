package com.kug

import kotlin.random.Random

sealed class Permutation


data class Transposition(val x: Int, val y: Int) : Permutation()
data class Product(val left: Permutation, val right: Permutation) : Permutation()
val e: Permutation = Transposition(1, 1)

operator fun Permutation.times(that: Permutation): Permutation = Product(this, that)

​
operator fun Permutation.invoke(index: Int): Int = when (this) {
    is Transposition -> when (index) {
        x -> y
        y -> x
        else -> index
    }
    is Product -> right(left(index))
}

​
fun <T> List<T>.permuteBy(permutation: Permutation): Sequence<T> =
        this.indices.asSequence().map { this[permutation(it)] }
​
fun shuffle(length: Int): Permutation =
        (0 until length).asSequence().map{ Transposition(it, Random.nextInt()) }.fold(e) { t1, t2 -> t1 * t2 }
​
fun winner(attendees: List<String>) = attendees.permuteBy(shuffle(attendees.count())).first()
