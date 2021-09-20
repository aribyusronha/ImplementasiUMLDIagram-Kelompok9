/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasimplementasiuml;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee [] emp = new Employee [2];
        emp [0] = new SalariedEmployee("Exelo","123456789",100);
        emp [1] = new HourlyEmployee("Wardo","987654321",7,10);
        
        for (int i = 0; i< emp.length;i++) {
            System.out.println("\nEmployee Name \t= " + emp[i].getName());
            System.out.println("Employee AFM \t= " + emp[i].getAfm());
            System.out.println("Employee Salary\t= US$ " + emp[i].payment());
        }
        
    }
    
}
