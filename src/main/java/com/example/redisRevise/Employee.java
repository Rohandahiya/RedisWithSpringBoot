package com.example.redisRevise;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Employee implements Serializable {

    private Integer empId;

    private String name;

    private Integer age;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
