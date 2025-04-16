package StudentServices;

public class Student {

    private String StudentName;
    private int StudentId;
    private int StudentAge;

    @Override
    public String toString() {
        return "Student{" +
                "StudentName='" + this.StudentName + '\'' +
                ", StudentId=" + StudentId +
                ", StudentAge=" + StudentAge +
                '}';
    }

    public Student() {
       this.StudentName = "Sara";
        this.StudentId = 2;
        this.StudentAge = 14;

    }

    public Student(String studentName, int studentId, int studentAge) {
        StudentName = studentName;
        StudentId = studentId;
        StudentAge = studentAge;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public int getStudentAge() {
        return StudentAge;
    }

    public void setStudentAge(int studentAge) {
        StudentAge = studentAge;
    }
}
