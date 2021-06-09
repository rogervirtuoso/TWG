package com.example.backend.domain.department;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class DepartmentHours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private Department department;

    private String description;

    private Double Sunday;
    private Double Monday;
    private Double Tuesday;
    private Double Wednesday;
    private Double Thursday;
    private Double Friday;
    private Double Saturday;

    public DepartmentHours() {
    }

    public DepartmentHours(Department department, String description, Double sunday, Double monday, Double tuesday, Double wednesday, Double thursday, Double friday, Double saturday) {
        this.department = department;
        this.description = description;
        Sunday = sunday;
        Monday = monday;
        Tuesday = tuesday;
        Wednesday = wednesday;
        Thursday = thursday;
        Friday = friday;
        Saturday = saturday;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getSunday() {
        return Sunday;
    }

    public void setSunday(Double sunday) {
        Sunday = sunday;
    }

    public Double getMonday() {
        return Monday;
    }

    public void setMonday(Double monday) {
        Monday = monday;
    }

    public Double getTuesday() {
        return Tuesday;
    }

    public void setTuesday(Double tuesday) {
        Tuesday = tuesday;
    }

    public Double getWednesday() {
        return Wednesday;
    }

    public void setWednesday(Double wednesday) {
        Wednesday = wednesday;
    }

    public Double getThursday() {
        return Thursday;
    }

    public void setThursday(Double thursday) {
        Thursday = thursday;
    }

    public Double getFriday() {
        return Friday;
    }

    public void setFriday(Double friday) {
        Friday = friday;
    }

    public Double getSaturday() {
        return Saturday;
    }

    public void setSaturday(Double saturday) {
        Saturday = saturday;
    }

    public enum ItemDistributionCentre {
        SUNDAY("Sunday", 0D),
        MONDAY("Monday", 15073D),
        TUESDAY("Tuesday", 24555D),
        WEDNESDAY("Wednesday", 13000D),
        THURSDAY("Thursday", 18832D),
        FRIDAY("Friday", 10009D),
        SATURDAY("Saturday", 1556D);

        private String name;
        private Double value;

        ItemDistributionCentre(String name, Double value) {
            this.name = name;
            this.value = value;
        }

        public static ItemDistributionCentre valueOf(Double codigo) {
            if (codigo == null) {
                return null;
            }
            for (ItemDistributionCentre item : ItemDistributionCentre.values()) {
                if (item.name().equals(codigo)) return item;
            }
            return null;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getValue() {
            return value;
        }

        public void setValue(Double value) {
            this.value = value;
        }
    }
}
