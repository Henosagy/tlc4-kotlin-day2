import kotlin.random.Random as kotlinRandom
import java.util.Random as javaRandom

fun main(){
    for(i in 0..1000){
        println("Iteration $i")
        println("Random number from kotlin: " + kotlinRandom.nextInt())
        println("Random number from java: " + javaRandom().nextInt())
        println("===================================================")
    }

}