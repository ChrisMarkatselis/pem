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
    
    public Manager(String name, String surname, double birth_day, double birth_month, double birth_year, double age, double salary, double bonus) {
        super(name, surname, birth_day, birth_month, birth_year, age, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
