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
public class Manager extends Employee{
    private double bonus;
    
    public Manager(String name, String surname, int birth_year, double salary, double bonus) {
        super(name, surname, birth_year, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
