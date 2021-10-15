fun main() {
    val double = {i: Int -> i * 2}
    println(double(3))

    println("=================================================")
    for(i: Int in 0..9)
        println(fib(i))

    val capturedInt: Int = 11
    val addSomething = {i: Int -> i + capturedInt}
    println(addSomething(5))
    println("=================================================")
    println(lambdas(double,addSomething))
    println("=================================================")
    println(totalLength(listOf("Hello", "World", "How", "Are", "You")))
    println("=================================================")
    printContents((listOf("Hello", "World", "How", "Are", "You")))
    println("=================================================")
}

fun totalLength(strings : List<String>) : Int = strings.stream().mapToInt{it.length}.sum()
fun printContents(strings : List<String>) : Unit = strings.stream().forEach{ println(it)}

tailrec fun fib(n: Int): Int = if (n < 0) 0 else when (n){
    0, 1 -> 1
    else -> fib(n-1) + fib(n-2)
}

fun lambdas (x: (Int) -> Int, y: (Int) -> Int): Int {
    val composition = { i: Int -> x(y(i)) }
    return composition(3)
}