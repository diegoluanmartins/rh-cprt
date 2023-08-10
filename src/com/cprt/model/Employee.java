package com.cprt.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee{

    private String name;
    private String cpf;
    private JobRole jobRole;
    private BigDecimal monthlySalary;
    private LocalDate lastSalaryUpdate;

    public Employee(final String name, final String cpf, final JobRole jobRole, final BigDecimal monthlySalary) {
        this.name = name;
        this.cpf = cpf;
        this.jobRole = jobRole;
        this.monthlySalary = monthlySalary;
    }

    public void updateSalary(final BigDecimal newSalary){
        this.monthlySalary = newSalary;
        this.lastSalaryUpdate = LocalDate.now();
    }

    public String getName() {
        return name;
    }
    public void setName(final String name) {
        this.name = name;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(final String cpf) {
        this.cpf = cpf;
    }
    public JobRole getJobRole() {
        return jobRole;
    }
    public void setJobRole(final JobRole jobRole) {
        this.jobRole = jobRole;
    }
    public BigDecimal getMonthlySalary() {
        return monthlySalary;
    }
    public LocalDate getLastSalaryUpdate() {
        return lastSalaryUpdate;
    }
   
    @Override
    public String toString() {
        return "Employee [name=" + name + ", cpf=" + cpf + ", jobRole=" + jobRole + ", monthlySalary=" + monthlySalary
                + ", lastSalaryUpdate=" + lastSalaryUpdate + "]";
    }

}