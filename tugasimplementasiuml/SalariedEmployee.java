/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasimplementasiuml;

public class SalariedEmployee extends Employee {

    private int salary;

    public SalariedEmployee(String name, String afm,int salary) {
        super(name, afm);
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
        
    @Override
    int payment() {
        return this.salary;
    }
    
}
