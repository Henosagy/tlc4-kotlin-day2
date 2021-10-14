open class Student(val name : String, val grades : List<Double>) {
    fun averageGrade() : Double {
        return grades.reduce { a, b -> a + b } /grades.size
    }
}