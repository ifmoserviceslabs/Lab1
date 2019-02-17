
import java.util.List;
import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.sql.DataSource;

@WebService(serviceName = "EmployeeService", targetNamespace = "http://serviceslab1maven.ifmo.com/")
public class EmployeeWebService {
    @Resource(lookup = "jdbc/ifmo-ws")
    private DataSource dataSource;
    
    @WebMethod(operationName = "getEmployees")
    public List<Employee> getEmployees() {
        PostgreSQLDAO dao = new PostgreSQLDAO(dataSource);
        List<Employee> employees = dao.getEmployees();
        return employees;
    }
    
    @WebMethod(operationName = "FilterEmployees")
    public List<Employee> filterEmployees(@WebParam(name = "name") String name, @WebParam(name = "surname") String surname, @WebParam(name = "age") int age, @WebParam(name = "city") String city, @WebParam(name = "department") int department) {
        PostgreSQLDAO dao = new PostgreSQLDAO(dataSource);
        List<Employee> employees = dao.filterEmployees(name, surname, age, city, department);
        return employees;
    }
}