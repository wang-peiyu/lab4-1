package com.wpy;

import javax.xml.ws.Endpoint;
import java.util.Scanner;

public class WebServicePublisher {

    public static void main(String[] args) {
        String url = "http://localhost:8080/taxCalculator";
        Endpoint.publish(url, new TaxCalculatorImpl());
        System.out.println("Web service is published at: " + url);
        /*TaxCalculator a=new TaxCalculatorImpl();
        Scanner scanner=new Scanner(System.in);

            System.out.println("请输入个人收入：");
            double salary = scanner.nextDouble();
            double tax = a.calculateTaxForSalary(salary);
            System.out.println("个人收入为:" + salary + "    所得税为：" + tax);*/

    }
}
