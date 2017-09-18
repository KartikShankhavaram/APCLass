package com.kartik;

public class CommisionEmployees extends Employees {

    double salesMade;

    public CommisionEmployees(double salesMade) {
        this.salesMade = salesMade;
    }

    public double getSalary() {
        return (salesMade * (percentageSales / 100));
    }
}
