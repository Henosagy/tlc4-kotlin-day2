import java.util.*
import java.util.stream.Collectors

open class Classroom<T : Student>(vararg sts : T) : Iterable<T> {
    val students : MutableList<T> = mutableListOf()
    init {
        for (s in sts) students.add(s)
    }

    override fun iterator(): Iterator<T> {
        return students.iterator()
    }

    fun addBetter(cls : Classroom<out Student>){
        val averageScore = students.stream().map { it.averageGrade() }.collect(Collectors.toList()).maxOrNull()!!
        cls.students.filter{it.averageGrade()>averageScore}.forEach{i -> students.add(i as T)}
    }
}