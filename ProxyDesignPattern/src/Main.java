import StudentServices.Student;
import StudentServices.StudentDao;
import StudentServices.StudentDaoProxyImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         try{
             StudentDao studentDao = new StudentDaoProxyImpl();
             studentDao.createStudentRecord("admin",new Student());
             studentDao.getStudentRecord("user",2);
         } catch (Exception e) {
             throw new RuntimeException(e);
         }
    }
    }
