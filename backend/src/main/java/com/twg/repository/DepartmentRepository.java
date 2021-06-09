package com.twg.repository;

import com.twg.domain.department.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {

    @Override
    Iterable<Department> findAll();
}
