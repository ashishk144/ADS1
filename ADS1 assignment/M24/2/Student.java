/**
 * Class for student.
 */
public class Student implements Comparable<Student> {
    /**
     * Name of the student.
     */
    private String name;
    /**
     * Roll no of the student.
     */
    private Integer roll;
    private Double marks;
    /**
     * Constructs the object.
     */
    public Student() {

    }
    /**
     * Constructs the object.
     *
     * @param      student  The student
     * @param      num      The roll number.
     */
    public Student(final String student, final Double mark, final Integer num) {
        this.name = student;
        this.roll = num;
        this.marks = mark;
    }
    /**
     * Gets the name.
     *
     * @return     The name.
     */
    public String getName() {
        return this.name;
    }
    /**
     * Gets the roll.
     *
     * @return     The roll.
     */
    public Integer getRoll() {
        return this.roll;
    }
    /**
     * CompareTo function.
     *
     * @param      other  The other
     *
     * @return     { description_of_the_return_value }
     */
    public int compareTo(Student other) {
        if (this.marks > other.marks) {
            return 1;
        } else if (this.marks < other.marks) {
            return -1;
        // } else if (this.name.compareTo(other.name) > 0) {
        //     return 1;
        // } else if (this.name.compareTo(other.name) < 0) {
        //     return -1;
        } else if (this.roll > other.roll) {
            return 1;
        } else if (this.roll < other.roll) {
            return -1;
        } else {
            return 0;
        }
    }
}
