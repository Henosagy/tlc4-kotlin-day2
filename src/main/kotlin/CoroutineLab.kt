//import kotlinx.coroutines.*

// Question 1
//suspend fun main()= coroutineScope{
//    for (i in 1..5){
//        launch {
//            delay(1000)
//            println("Tick")
//        }
//        launch {
//            delay(1000)
//            println("Tock")
//        }
//    }
//}

//suspend fun addFive(n: Int): Int{
//    delay(1000)
//    return n + 5
//}
//suspend fun main() = coroutineScope {
//    val result = (1..10).map { i : Int -> async { addFive(i) } }
//    var total = (1..10).map{it -> result}.fold(0, {it ,total -> it + total.await()})
//        println(total)
//}

////Question 3
//
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlin.random.Random as kotlinRandom

suspend fun main()= coroutineScope{
    val primeNumberList = sieveOfEratosthenes(100)
    println("List of prime numbers less than 101")
    println(primeNumberList)
    val mq = Channel<Int>()
    launch {
        while (true){
            for (m in mq){
                if(primeNumberList.contains(m))
                    println("$m is prime")
                else
                    println("$m is not prime")
            }
        }
    }
    for (i in 1..10){
        var random = kotlinRandom.nextInt(2,100)
        mq.send(random)
        delay(2000)
    }
    mq.close()
    println("All done")

}

fun sieveOfEratosthenes(number: Int): List<Int>{
    var prepend = mutableListOf(2,3,5)
    var list = mutableListOf<Int>()
    for (i in 6..number)
        list.add(i)

    var newList = list.stream().filter{it % 2 != 0 && it % 3 != 0 && it % 5 != 0}.toList()

    val primeList = prepend + newList

    return primeList
}

