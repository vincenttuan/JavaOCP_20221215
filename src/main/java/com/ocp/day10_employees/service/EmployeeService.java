package com.ocp.day10_employees.service;

import com.ocp.day10_employees.dao.EmployeeDao;
import com.ocp.day10_employees.dao.EmployeeDaoImpl;
import com.ocp.day10_employees.entity.Employee;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class EmployeeService {
    private EmployeeDao dao = new EmployeeDaoImpl();
    
    public void addEmployee(String name, String birth, Integer salary) {
        try {
            // 將 birth 字串轉成 date 格式
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date birthday = format.parse(birth);
            // 建立 Employee 物件
            Employee employee = new Employee();
            employee.setName(name);
            employee.setBirth(birthday);
            employee.setSalary(salary);
            // 將 employee 傳給 dao.add() 去新增
            dao.add(employee);
            System.out.println("新增員工完畢");
        } catch (ParseException ex) {
            System.out.println("生日日期轉換錯誤");
        }
        
    }
    
    public Employee getEmployeeById(int id) {
        // id 是否合法(在有效範圍內) ?
        if(id < 0) {
            System.out.println("員工　id 不存在");
            return null;
        }
        Employee employee = dao.getById(id);
        return employee;
    }
    
    public ArrayList<Employee> findAll() {
        return dao.queryAll();
    }
    
    public void modifyEmployeeSalary(int id, Integer salary) {
        if(id < 0) {
            System.out.println("員工　id 不存在");
            return;
        }
        if(salary < 26400) {
            System.out.println("員工薪資不得低於 $26,400");
            return;
        }
        // 是否有該名員工 ?
        if(getEmployeeById(id) == null) {
            System.out.println("無此員工");
            return;
        }
        
        // 進入資料庫修改
        dao.updateSalaryById(id, salary);
    }
    
    public void removeEmployeeById(int id) {
        // id 是否合法(在有效範圍內) ?
        if(id < 0) {
            System.out.println("員工　id 不存在");
            return;
        }
        // 是否有該名員工 ?
        if(getEmployeeById(id) == null) {
            System.out.println("無此員工");
            return;
        }
        // 進行資料刪除作業
        dao.deleteById(id);
    }
}
