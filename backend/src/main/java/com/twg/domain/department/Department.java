package com.twg.domain.department;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Department name is required")
    private String name;

    @OneToMany(mappedBy ="department",cascade= CascadeType.ALL,fetch=FetchType.LAZY)
    private Collection<DepartmentHours> departmentHours;

    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<DepartmentHours> getDepartmentHours() {
        return departmentHours;
    }

    public void setDepartmentHours(Collection<DepartmentHours> departmentHours) {
        this.departmentHours = departmentHours;
    }
}
