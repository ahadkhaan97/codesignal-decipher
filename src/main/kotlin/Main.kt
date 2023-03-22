fun main() {
    print(solution("10197115121"))
}

fun solution(cipher: String): String {
    var tempChar = ""
    var tempString = ""
    for (i in cipher.indices) {
        tempChar += cipher[i]
        if (tempChar.toInt().toChar() in 'a'..'z') {
            tempString += tempChar.toInt().toChar()
            tempChar = ""
        }
    }
    return tempString
}
