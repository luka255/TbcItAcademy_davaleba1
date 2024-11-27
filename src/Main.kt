fun strToInt(num : String) : Long{
    var result = 0L
    var position = 1L

    if (num.none{it.isDigit()})
        return 0

    for(i in num.length-1 downTo 0){
        if (num[i].isDigit()){
            val n = num[i] - '0'
            result += n * position
            position*=10
        }
    }
    return result
}

fun main() {
    var flag = true

    while (flag) {
        var answer = ""
        println("Enter X value:")
        var x  = readLine().toString()
        println("Enter Y value:")
        var y = readLine().toString()

        var z: Any = if(strToInt(y).toInt() != 0) strToInt(x) / strToInt(y) else println("cannot be devided by zero")

        println("Answer: $z")

        print("if you wish to continue press: <y/n>")
        answer = readLine().toString()

        if (answer == "n")
            flag = false
    }

}
