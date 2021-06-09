package com.example.backend.service;

import com.example.backend.domain.department.Department;
import com.example.backend.domain.department.DepartmentHours;
import com.example.backend.repository.DepartmentHoursRepository;
import com.example.backend.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;
    private DepartmentHoursRepository departmentHoursRepository;

    public DepartmentService(DepartmentRepository departmentRepository, DepartmentHoursRepository departmentHoursRepository) {
        this.departmentRepository = departmentRepository;
        this.departmentHoursRepository = departmentHoursRepository;
    }

    public Iterable<Department> findAllDepartments() {
        return departmentRepository.findAll();
    }
}
