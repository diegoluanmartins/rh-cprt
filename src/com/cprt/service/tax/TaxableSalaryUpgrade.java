package com.cprt.service.tax;

import java.math.BigDecimal;

public interface TaxableSalaryUpgrade extends SalaryUpgrade {
    
    BigDecimal valueWithTax();

}
