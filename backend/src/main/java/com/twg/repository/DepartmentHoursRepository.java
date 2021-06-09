package com.twg.repository;

import com.twg.domain.department.DepartmentHours;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentHoursRepository extends CrudRepository<DepartmentHours, Long> {

    @Override
    Iterable<DepartmentHours> findAll();
}
