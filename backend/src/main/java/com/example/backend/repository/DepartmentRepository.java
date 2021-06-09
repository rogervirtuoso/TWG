package com.example.backend.repository;

import com.example.backend.domain.department.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {

    @Override
    Iterable<Department> findAll();
}
