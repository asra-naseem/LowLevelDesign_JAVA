package StudentServices;

public interface StudentDao {

    public void createStudentRecord(String client,Student studentObj)throws Exception;
    public void deleteStudentRecord(String client,int StudentId) throws Exception;
    public Student getStudentRecord(String client,int studentId) throws Exception;
}
