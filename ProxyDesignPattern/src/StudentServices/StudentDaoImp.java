package StudentServices;

public class StudentDaoImp implements StudentDao{
    @Override
    public void createStudentRecord(String client, Student studentObj) throws Exception {
      System.out.println("\nCreate Student record Successfully\n");
    }

    @Override
    public void deleteStudentRecord(String client, int StudentId) throws Exception {
     System.out.println("Deleted Student record ");
    }

    @Override
    public Student getStudentRecord(String client, int studentId) throws Exception {
        System.out.println("Fetching Student Record");
        Student stu= new Student();
        stu.toString();
        return stu;
    }
}
