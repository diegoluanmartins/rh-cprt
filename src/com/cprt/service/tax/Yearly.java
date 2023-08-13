package com.cprt.service.tax;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Yearly implements SalaryUpgrade {

    private BigDecimal value;
    private LocalDate date;

    public Yearly(BigDecimal value) {
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

}
