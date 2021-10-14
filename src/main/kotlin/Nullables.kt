import java.util.stream.Collectors
import kotlin.streams.toList

class Nullables {
}
data class NameMapping(val ID : String, val name : String?)
data class Grade(val ID : String, val subject : String, val score : Double?)

fun main() {
    val gradebook : List<Grade> =
        listOf(Grade("A-132", "maths", null),
            Grade("E-543", "maths", 42.13),
            Grade("A-132", "cs", 55.0),
            Grade("I-999", "maths", 87.65),
            Grade("O-765", "maths", null),
            Grade("U-951", "cs", 44.23),
            Grade("O-765", "cs", 58.5))

    val names : List<NameMapping> = listOf(NameMapping("A-132", "Alice"),
        NameMapping("E-543", null),
        NameMapping("I-999", "Charlie"),
        NameMapping("O-765", null),
        NameMapping("U-951", "Eve"))

    gradesListNull(gradebook)
    gradesListStringNull(gradebook, "maths")
}

fun gradesListNull(gradeList: List<Grade>): Unit{
    val newList: List<Grade> =gradeList.stream().filter{it.score == null}.collect(Collectors.toList())
    for(grade in newList){
        println(grade)
    }
}

fun gradesListStringNull(gradeList: List<Grade>, subject: String): Unit{
    val averageGradeList: List<Grade> = gradeList.stream().filter{it.subject == subject}.filter{it.score != null}.toList()
    var averageGrade: Double = 0.0
    for(element in averageGradeList)
        averageGrade += element.score!!

    averageGrade = averageGrade/averageGradeList.size

    println("$subject has a non null average score of $averageGrade")
}

//fun gradesListNameableNull(gradeList: List<Grade>, namesList: List<NameMapping>){
//    var names = namesList.stream().filter{it.name==null}.toList()
//    for(i in gradeList){
//        if(names.)
//    }
//}