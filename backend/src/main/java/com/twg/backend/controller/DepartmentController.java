package com.twg.backend.controller;

import com.twg.backend.domain.department.Department;
import com.twg.backend.service.DepartmentService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/department")
@CrossOrigin
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/all")
    public Iterable<Department> getAllDepartments() {
        return departmentService.findAllDepartments();
    }
}
