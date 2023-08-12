package com.cprt.model;

import java.math.BigDecimal;

public class PersonalData {
    private String name;
    private String cpf;
    private JobRole jobRole;
    private BigDecimal monthlySalary;

    public PersonalData(String name, String cpf, JobRole jobRole, BigDecimal monthlySalary) {
        this.name = name;
        this.cpf = cpf;
        this.jobRole = jobRole;
        this.monthlySalary = monthlySalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public JobRole getJobRole() {
        return jobRole;
    }

    public void setJobRole(JobRole jobRole) {
        this.jobRole = jobRole;
    }

    public BigDecimal getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(BigDecimal monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "PersonalData [name=" + name + ", cpf=" + cpf + ", jobRole=" + jobRole + ", monthlySalary="
                + monthlySalary + "]";
    }

}
