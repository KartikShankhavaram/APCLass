package com.kartik;

public class SalariedCommisionEmployees extends Employees {

    float salesMade;
    float increaseBaseSalary = 10;

    public SalariedCommisionEmployees(float salesMade) {
        this.salesMade = salesMade;
    }

    public double getSalary() {
        return (salesMade * (percentageSales/100) + baseSalary * ((100 + increaseBaseSalary)/100));
    }
}
