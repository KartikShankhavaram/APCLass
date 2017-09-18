package com.kartik;

public class HourlyEmployees extends Employees {

    float numberOfHours, overtimeHours;

    public HourlyEmployees(float numberOfHours) {
        this.numberOfHours = numberOfHours;
        if(numberOfHours > 40) {
            overtimeHours = numberOfHours - 40;
        } else {
            overtimeHours = 0;
        }
    }

    public double getSalary() {
        return ((numberOfHours * hourlyRate) + (overtimeHours * overtimeHours));
    }
}
