package com.wpy;

import javax.jws.WebService;

@WebService(endpointInterface = "com.wpy.TaxCalculator")
public class TaxCalculatorImpl implements TaxCalculator {

    @Override
    public double calculateTaxForSalary(double salary) {
        double sum=0;

        if(salary>=5000&&salary<10000)
        {    sum=salary*0.05;
        }
        if (salary>=10000&&salary<20000) {
            sum=salary*0.1;
        }
        if (salary>=20000) {
            sum=salary*0.15;
        }

        return sum;
    }
}
