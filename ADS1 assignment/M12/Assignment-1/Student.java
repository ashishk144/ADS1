
/**
 * Class for student.
 */
public class Student {
    String name;
    String dob;
    Integer sub1;
    Integer sub2;
    Integer sub3;
    Integer total;
    String cat;
    boolean allocation;
    Integer day;
    Integer month;
    Integer year;
    /**
     * Constructs the object.
     */
    public Student() {

    }
    /**
     * Constructs the object.
     *
     * @param      stu    The student
     * @param      dob    The dob
     * @param      s1     The subject 1 marks
     * @param      s2     The subject 2 marks
     * @param      s3     The subject 3 marks
     * @param      total  The total
     * @param      cat    The category
     */
    public Student(final String stu, final String dob, final Integer s1,
            final Integer s2, final Integer s3, final Integer total, final String cat) {
        this.name = stu;
        this.dob = dob;
        this.sub1 = s1;
        this.sub2 = s2;
        this.sub3 = s3;
        this.total = total;
        this.cat = cat;
        this.allocation = false;
        String[] birth = dob.split("-");
        this.day = Integer.parseInt(birth[0]);
        this.month = Integer.parseInt(birth[1]);
        this.year = Integer.parseInt(birth[2]);
    }
    /**
     * Returns a string representation of the object.
     * Complexity O(1)
     * @return     String representation of the object.
     */
    public String toString() {
        String str = "";
        str += this.name + "," + this.total + "," + this.cat;
        return str;

    }
    /**
     * Compares the function based on the parameters like marks, category etc.
     * Complexity O(1)
     * @param      other  The other
     *
     * @return     { description_of_the_return_value }
     */
    public int compareTo(final Student other) {
        if (this.total > other.total) {
            return 1;
        } else if (this.total < other.total) {
            return -1;
        } else if (this.sub3 > other.sub3) {
            return 1;
        } else if (this.sub3 < other.sub3) {
            return -1;
        } else if (this.sub2 > other.sub2) {
            return 1;
        } else if (this.sub2 < other.sub2) {
            return -1;
        } else if (this.sub1 > other.sub1) {
            return 1;
        } else if (this.sub1 < other.sub1) {
            return -1;
        } else if (this.year > other.year) {
            return 1;
        } else if (this.year < other.year) {
            return -1;
        } else if (this.month > other.month) {
            return 1;
        } else if (this.month < other.month) {
            return -1;
        } else if (this.day > other.day) {
            return 1;
        } else if (this.day < other.day) {
            return -1;
        } else {
            return 0;
        }
    }
}
