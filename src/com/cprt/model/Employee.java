package com.cprt.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {

    private PersonalData personalData;
    private LocalDate lastSalaryUpdateDate;

    public Employee(final String name, final String cpf, final JobRole jobRole, final BigDecimal monthlySalary) {
        this.personalData = new PersonalData(name, cpf, jobRole, monthlySalary);
    }

    public Employee(PersonalData personalData) {
        this.personalData = personalData;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void updateSalary(final BigDecimal newSalary) {
        this.personalData.setMonthlySalary(newSalary);
        this.lastSalaryUpdateDate = LocalDate.now();
    }

    public LocalDate getLastSalaryUpdateDate() {
        return lastSalaryUpdateDate;
    }

    public void promote(JobRole newRole) {
        this.personalData.setJobRole(newRole);
    }

    @Override
    public String toString() {
        return "Employee [personalData=" + personalData + ", lastSalaryUpdateDate=" + lastSalaryUpdateDate + "]";
    }

}