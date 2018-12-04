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
            
    public Employee(String name, String surname, int birth_year, double salary) {
        super(name, surname, birth_year);
        this.salary = salary;
        
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
}
