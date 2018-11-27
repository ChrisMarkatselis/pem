/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercisepem;

/**
 *
 * @author marka
 */
public class Employee extends Person{
    private double salary;
            
    public Employee(String name, String surname, double birth_day, double birth_month, double birth_year, double age, double salary) {
        super(name, surname, birth_day, birth_month, birth_year, age);
        this.salary = salary;
        
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
}
