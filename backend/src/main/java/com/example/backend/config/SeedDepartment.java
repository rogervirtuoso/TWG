package com.example.backend.config;

import com.example.backend.domain.department.Department;
import com.example.backend.domain.department.DepartmentHours;
import com.example.backend.repository.DepartmentHoursRepository;
import com.example.backend.repository.DepartmentRepository;

public class SeedDepartment {

    private DepartmentRepository departmentRepository;
    private DepartmentHoursRepository departmentHoursRepository;

    public SeedDepartment(DepartmentRepository departmentRepository, DepartmentHoursRepository departmentHoursRepository) {
        this.departmentRepository = departmentRepository;
        this.departmentHoursRepository = departmentHoursRepository;
        seed();
    }

    private void seed() {
        Department entertainment_department = departmentRepository.save(new Department("Entertainment Department"));
        DepartmentHours set_up_display_tVs = populateDepartmentHours(entertainment_department, "Set up display TVs", 0.5D, 0.5D, 0.5D, 0.5D, 0.5D, 0.5D, 0.5D);
        departmentHoursRepository.save(set_up_display_tVs);
        DepartmentHours running_demonstration_sessions = populateDepartmentHours(entertainment_department, "Running demonstration sessions", 2D, 0D, 0D, 0D, 0D, 0D, 2D);
        departmentHoursRepository.save(running_demonstration_sessions);

        Department gardening_department = departmentRepository.save(new Department("Gardening Department"));
        DepartmentHours watering = populateDepartmentHours(gardening_department, "Watering", 1D, 1D, 1D, 1D, 1D, 1D, 1D);
        departmentHoursRepository.save(watering);
        DepartmentHours tidying_up = populateDepartmentHours(gardening_department, "Tidying up", 2D, 1.5D, 1.5D, 1.5D, 1.5D, 1.5D, 2D);
        departmentHoursRepository.save(tidying_up);

        Department stockroom_department = departmentRepository.save(new Department("Stockroom Department"));
        DepartmentHours meetings = populateDepartmentHours(stockroom_department, "Meetings", 0.6D, 0.6D, 0.6D, 0.6D, 0.6D, 0.6D, 0.6D);
        departmentHoursRepository.save(meetings);
        DepartmentHours scanning = populateDepartmentHours(stockroom_department, "Scanning",
            0.05D * DepartmentHours.ItemDistributionCentre.SUNDAY.getValue(),
            0.05D * DepartmentHours.ItemDistributionCentre.MONDAY.getValue(),
            0.05D * DepartmentHours.ItemDistributionCentre.TUESDAY.getValue(),
            0.05D * DepartmentHours.ItemDistributionCentre.WEDNESDAY.getValue(),
            0.05D * DepartmentHours.ItemDistributionCentre.THURSDAY.getValue(),
            0.05D * DepartmentHours.ItemDistributionCentre.FRIDAY.getValue(),
            0.05D * DepartmentHours.ItemDistributionCentre.SATURDAY.getValue());
        departmentHoursRepository.save(scanning);
    }

    private DepartmentHours populateDepartmentHours(
        Department department, String description, Double sunday, Double monday, Double tuesday,
        Double wednesday, Double thursday, Double friday, Double saturday) {
        return new DepartmentHours(department, description, sunday, monday, tuesday,
            wednesday, thursday, friday, saturday);
    }

}
