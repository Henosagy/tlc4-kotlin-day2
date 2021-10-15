import kotlinx.coroutines.*
//import kotlinx.coroutines.channels.Channel
//
//suspend fun addFive(n: Int): Int{
//    delay(1000)
//    return n + 5
//}

suspend fun main()= coroutineScope {
//    launch {
//        delay(100L)
//        println("World")
//    }
//    println("Hello, ")

//    val job= launch { repeat(100){ delay(100); println("Hi") } }
//    delay(50)
//    job.cancel()
//    println("All done")

//    val onePlus:Deferred<Int> = async { addFive(1) }
//    for(i in 1..20) {
//        println("Iteration $i")
//        delay(1000)
//    }
//    println(onePlus.await())

//    val result = (1..5).map { i: Int -> async { addFive(i) } }
//    var total = 0
//    for (r in result)
//        total += r.await()
//    println(total)

//    val mq = Channel<String>()
//    launch {
//        while (true){
//            for (m in mq){
//                println(m)
//            }
//        }
//    }
//    mq.send("Hello, ")
//    delay(500)
//    mq.send("World")
//    mq.close()
//    println("All done")

//    val mq = Channel<Int>()
//    for(i in 1..100)
//        launch {
//            for(n in 1..12)
//                mq.send(n * i)
//        }


}

