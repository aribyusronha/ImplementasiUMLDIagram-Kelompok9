/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasimplementasiuml;

public class HourlyEmployee extends Employee{
    private int hoursWorked;
    private int hourlyPayment;

    public HourlyEmployee( String name, String afm,int hoursWorked, int hourlyPayment) {
        super(name, afm);
        this.hoursWorked = hoursWorked;
        this.hourlyPayment = hourlyPayment;
    }    
    
    int getHoursWorked() {
        return hoursWorked;
    }

    void setHoursWorked(int hw) {
        this.hoursWorked = hw;
    }

    int getHourlyPayment() {
        return hourlyPayment;
    }

    void setHourlyPayment(int hp) {
        this.hourlyPayment = hp;
    } 

    @Override
    int payment() {
        return this.hourlyPayment * this.hoursWorked;
    }
}
