package com.cprt.service.tax;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface SalaryUpgrade {
    
    BigDecimal value();
    LocalDate date();

}
