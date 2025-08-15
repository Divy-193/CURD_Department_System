package com.BufferDemo.Springboot.Tutorial.controller;


import com.BufferDemo.Springboot.Tutorial.entity.Department;
import com.BufferDemo.Springboot.Tutorial.errors.DepartmentNotFoundException;
import com.BufferDemo.Springboot.Tutorial.service.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDeparmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
        return departmentService.fetchDepartmentById(departmentId);
    }
    @GetMapping("/departments/name/{name}")
    public List<Department> fetchDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentByName(departmentName);
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department){
        return departmentService.updateDepartment(departmentId,department);
    }
    @DeleteMapping("/departments/{id}")
    public String deletDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deletDepartmentById(departmentId);
        return "Department Deleted Sucessfully!!";
    }
}
