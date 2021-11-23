package challenges

import utils.getInt

fun missingNumberAlgorithm() {
    //https://cses.fi/problemset/task/1083

    val inputN = getInt()
    val list = inputMissingNumberString(inputN)
    val auxList = fillAuxList(inputN)

    for (i in 0 until list.size) {
        for (k in 0 until list.size) {
            if (list[i] == auxList[k]) {
                auxList.remove(list[i])
                break
            }
        }
    }

    print(auxList[0])
}

fun inputMissingNumberString(n: Int) = run {
    val line = readLine()
    val inputs = line?.split(" ")
    val list = mutableListOf<Int>()

    inputs?.let {
        for(input in inputs) {
            try {
                list.add(input.toInt())
            } catch (e: NumberFormatException) {
                println("Erro na conversão do input: $input")
            }
        }
    }
    list
}

fun fillAuxList(n: Int) = run {
    val list = mutableListOf<Int>()
    for (i in 1..n) {
        list.add(i)
    }
    list
}
