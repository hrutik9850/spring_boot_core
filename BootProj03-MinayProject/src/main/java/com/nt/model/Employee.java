package com.nt.model;

import lombok.Data;
import java.util.Objects;
@Data
public class Employee {
    private Integer eno;
    private String ename;
    private String job;
    private Double salary;
    private Integer deptno;
    private Double grossSalary;
    private Double netSalary;

}