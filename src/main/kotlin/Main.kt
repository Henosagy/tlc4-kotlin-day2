fun main() {
    val clrm = SortedClassroom(
        Student("Charlie", listOf(40.0, 80.0, 90.0, 55.0)),
        Student("Bob", listOf(40.0,10.0,20.0,25.0)),
        Student("Alice", listOf(20.0, 70.0, 60.0, 30.0))
    )

    for (s : Student in clrm) {
        println("Student ${s.name} with grade ${s.averageGrade()}")
    }

    println("============================================================")
    val clrm1 = SortedClassroom(
        Student("Dave", listOf(60.0, 60.0, 60.0, 60.0)),
        Student("Eve", listOf(80.0,80.0,80.0,85.0)),
        Student("Lucifer", listOf(20.0, 20.0, 20.0, 30.0))
    )


    for (s : Student in clrm1) {
        println("Student ${s.name} with grade ${s.averageGrade()}")
    }

    println("===============================================================")

    clrm.addBetter(clrm1)
    for (s : Student in clrm) {
        println("Student ${s.name} with grade ${s.averageGrade()}")
    }
}