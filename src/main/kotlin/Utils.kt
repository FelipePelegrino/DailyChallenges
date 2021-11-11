fun getInt(): Int {
    var input: Int = getIntProcess()

    while(input == Constants.GET_INT_FAIL) {
        println("Por favor, insira um número inteiro:")
        input = getIntProcess()
    }

    return input
}

private fun getIntProcess(): Int {
    var input = readLine()
    var int: Int
    try {
        int = Integer.parseInt(input)
    } catch (exception: NumberFormatException) {
        int = Constants.GET_INT_FAIL
        println("Error: Falha na conversão do input $input")
//        println("Message: ${exception.localizedMessage}")
//        println("StackTrace: ${exception.stackTraceToString()}")
    }
    println()

    return int
}

fun getIntPositive(): Int {
    var int = getInt()

    while(int < 1) {
        println("Por favor, insira um número positivo:")
        int = getInt()
    }

    return int
}

fun isBiggerThanMaxInt(int: Int, max: Int): Boolean {
    return int > max
}