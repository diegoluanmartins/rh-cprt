package com.cprt.model;

import java.math.BigDecimal;

public class ThirdPartEmployee  {

    private PersonalData personalData;
    private String company;
    
    public ThirdPartEmployee(final String name, final String cpf, final JobRole jobRole, final BigDecimal monthlySalary, final String company) {
        this.personalData = new PersonalData(name, cpf, jobRole, monthlySalary);
        this.company = company;
    }

    public ThirdPartEmployee(PersonalData personalData, String company) {
        this.personalData = personalData;
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }
     
}
