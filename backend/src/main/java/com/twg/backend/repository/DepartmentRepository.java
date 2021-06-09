package com.twg.backend.repository;

import com.twg.backend.domain.department.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {

    @Override
    Iterable<Department> findAll();
}
