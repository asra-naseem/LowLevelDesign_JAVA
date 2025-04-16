package StudentServices;

public class StudentDaoProxyImpl implements StudentDao{
    private StudentDaoImp studentDaoImp;

    public StudentDaoProxyImpl() {

        this.studentDaoImp = new StudentDaoImp();
    }

    @Override
    public void createStudentRecord(String client, Student studentObj) throws Exception {
       if(client.equalsIgnoreCase("ADMIN")) {
           studentDaoImp.createStudentRecord(client, studentObj);
            return;
       }
     throw new Exception("USER : Access Denied");
    }

    @Override
    public void deleteStudentRecord(String client, int StudentId) throws Exception {
        if(client.equalsIgnoreCase("ADMIN")) {
            studentDaoImp.deleteStudentRecord(client, StudentId);
            return;
        }
        throw new Exception("USER : Access Denied");
    }

    @Override
    public Student getStudentRecord(String client, int studentId) throws Exception {
        if(client.equalsIgnoreCase("ADMIN") || client.equalsIgnoreCase("user")) {

            return  studentDaoImp.getStudentRecord(client, studentId);
        }
        throw new Exception("USER : Access Denied");
    }
}
