package com.inventory_management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Department {

    @Id
    @GeneratedValue
    private Long deptId;
    private String name;
    private Long deptHeadId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getDeptHeadId() {
        return deptHeadId;
    }

    public void setDeptHeadId(Long deptHeadId) {
        this.deptHeadId = deptHeadId;
    }


}
