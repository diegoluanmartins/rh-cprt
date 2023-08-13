package com.cprt.service.tax;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promotion implements TaxableSalaryUpgrade {

    private BigDecimal value;
    private LocalDate date;

    public Promotion(BigDecimal value) {
        this.value = value;
        this.date = LocalDate.now();
    }

    @Override
    public BigDecimal value() {
        return this.value;
    }

    @Override
    public LocalDate date() {
        return this.date;
    }

    @Override
    public BigDecimal valueWithTax() {
        return this.value.multiply(new BigDecimal("0.1"));
    }

}
