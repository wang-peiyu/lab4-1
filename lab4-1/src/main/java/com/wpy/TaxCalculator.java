package com.wpy;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface TaxCalculator {

    @WebMethod
    double calculateTaxForSalary(@WebParam(name = "salary") double salary);
}
