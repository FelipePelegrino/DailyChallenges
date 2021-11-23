package challenges

import utils.getIntPositive
import utils.isBiggerThanMaxInt
import kotlin.math.pow

/*
* Start Challenge Weird Algorithm
*/

fun challengeWeirdAlgorithm() {
    // https://cses.fi/problemset/task/1068

    var n = inputWeirdAlgorithm()
    print("$n ")
    if (n != 1) {
        do {
            n = calculateWeirdAlgorithm(n)
            print("$n ")
        } while (n != 1)
    }
}

fun inputWeirdAlgorithm(): Int {
    var inputSuccess: Boolean
    val base = 10.toDouble()
    val max = base.pow(6)
    var n: Int

    print("Insira um número positivo:")
    n = getIntPositive()

    inputSuccess = !isBiggerThanMaxInt(n, max.toInt())

    while (!inputSuccess) {
        println("Por favor, insira um número menor que 10^6")
        n = getIntPositive()
        inputSuccess = !isBiggerThanMaxInt(n, max.toInt())
    }

    return n
}

fun calculateWeirdAlgorithm(n: Int): Int {
    return if (n % 2 == 0) {
        n / 2
    } else {
        n * 3 + 1
    }
}

/*
* End Challenge Weird Algorithm
*/