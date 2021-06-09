package com.twg.backend.service;

import com.twg.backend.domain.department.Department;
import com.twg.backend.repository.DepartmentHoursRepository;
import com.twg.backend.repository.DepartmentRepository;
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
