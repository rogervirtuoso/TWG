package com.twg.service;

import com.twg.domain.department.Department;
import com.twg.repository.DepartmentHoursRepository;
import com.twg.repository.DepartmentRepository;
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
