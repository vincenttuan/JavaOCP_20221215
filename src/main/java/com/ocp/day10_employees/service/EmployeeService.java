package com.ocp.day10_employees.service;

import com.ocp.day10_employees.dao.EmployeeDao;
import com.ocp.day10_employees.dao.EmployeeDaoImpl;
import com.ocp.day10_employees.entity.Employee;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeService {
    private EmployeeDao dao = new EmployeeDaoImpl();
    
    public void addEmployee(String name, String birth, Integer salary) {
        try {
            // 將 birth 字串轉成 date 格式
            SimpleDateFormat format = new SimpleDateFormat();
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
    
}
