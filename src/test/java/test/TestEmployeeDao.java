package test;

import com.ocp.day10_employees.dao.EmployeeDao;
import com.ocp.day10_employees.dao.EmployeeDaoImpl;
import org.junit.Assert;
import org.junit.Test;

public class TestEmployeeDao {
    @Test
    public void test1() {
        EmployeeDao dao = new EmployeeDaoImpl();
        // 查詢所有員工
        System.out.println(dao.queryAll());
        // 查詢 id=0 員工資料
        System.out.println(dao.getById(0));
        // 變更 id=0 員工的薪資 $80000
        dao.updateSalaryById(0, 80000);
        // 查詢 id=0 員工資料
        System.out.println(dao.getById(0));
        // 薪資是否是 80000 的確認
        int expected = 80000; // 期望是 80000
        int actual = dao.getById(0).getSalary(); // 實際薪資
        Assert.assertEquals(expected, actual);
    }
}
