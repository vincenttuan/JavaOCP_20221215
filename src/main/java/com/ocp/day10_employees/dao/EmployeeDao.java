package com.ocp.day10_employees.dao;

import com.ocp.day10_employees.entity.Employee;
import java.util.ArrayList;

// 員工資料 CRUD 的規格
public interface EmployeeDao {
    // 新增員工
    public void add(Employee employee);
    // 根據 id 查詢員工
    public Employee getById(int id);
    // 查詢所有員工
    public ArrayList<Employee> employees();
    // 根據員工 id 來修改薪資
    public void updateSalaryById(int id, Integer salary);
    // 根據員工 id 來刪除該名員工
    public void deleteById(int id);
}
