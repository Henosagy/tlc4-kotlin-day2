class SortedClassroom (vararg sts : Student) : Classroom<Student>(*sts){

    init{
        students.sortWith(StudentSorter())
    }
    inner class StudentSorter(): Comparator<Student>{
        override fun compare(o1: Student, o2: Student): Int {
//            if(o1.averageGrade()>o2.averageGrade())
//                return 1
//            if (o2.averageGrade()>o1.averageGrade())
//                return -1
//
//            return 0

            return (o1.averageGrade() - o2.averageGrade()).toInt()
        }
    }
}