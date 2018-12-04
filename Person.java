/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercisepem;

import java.time.Year;

/**
 *
 * @author marka
 */
public class Person {
    private String name;
    private String surname;
    private int birth_year;

    public Person(String name, String surname, double birth_year) {
        this.name = name;
        this.surname = surname;
        this.birth_year = birth_year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getAge() {
        return age;
    }

    public double getBrith_year() {
        return birth_year;
    }
    
    public int Age(int birth_year){
        int year = Year.now().getValue();  // In order to take the year number correctly every time you want to use that method.
        return age = year - birth_year;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirth_year(double birth_year) {
        this.birth_year = birth_year;
    }
}
