/**
 * Class for student.
 */
public class Student {
    /**
     * Name of the student.
     */
    private String name;
    /**
     * Marks of the student.
     */
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
     * @param      num      The number
     * @param      mark     The mark
     */
    public Student(final String student, final double mark) {
        this.name = student;
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
    // /**
    //  * Gets the roll.
    //  *
    //  * @return     The roll.
    //  */
    // public Long getRoll() {
    //     return this.roll;
    // }
    /**
     * Gets the mark.
     *
     * @return     The mark.
     */
    public Double getMark() {
        return this.marks;
    }
}
