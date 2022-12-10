fun main() {
    val somethingCase = Case<Long>(1000000)
    println(somethingCase.get())
    somethingCase.replace(1000)
    println(somethingCase.get())
}