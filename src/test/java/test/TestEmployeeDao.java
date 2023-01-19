package test;

import com.ocp.day10_employees.dao.EmployeeDao;
import com.ocp.day10_employees.dao.EmployeeDaoImpl;
import org.junit.Test;

public class TestEmployeeDao {
    @Test
    public void test1() {
        EmployeeDao dao = new EmployeeDaoImpl();
        System.out.println(dao.queryAll());
    }
}
