package com.BufferDemo.Springboot.Tutorial.service;

import com.BufferDemo.Springboot.Tutorial.entity.Department;
import com.BufferDemo.Springboot.Tutorial.errors.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);

   public List<Department> fetchDeparmentList();

   public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public List<Department> fetchDepartmentByName(String departmentName);

    public void deletDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);
}