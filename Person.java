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
public class Person {
    private String name;
    private String surname;
    private double birth_day;
    private double birth_month;
    private double birth_year;
    private double age;

    public Person(String name, String surname, double birth_day, double birth_month, double birth_year, double age) {
        this.name = name;
        this.surname = surname;
        this.birth_day = birth_day;
        this.birth_month = birth_month;
        this.birth_year = birth_year;
        this.age = age;
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

    public double getBrith_day() {
        return birth_day;
    }

    public double getBrith_month() {
        return birth_month;
    }
    
    public double getBrith_year() {
        return birth_year;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setBirth_day(double birth_day) {
        this.birth_day = birth_day;
    }
    
    public void setBirth_month(double birth_month) {
        this.birth_month = birth_month;
    }
    
    public void setBirth_year(double birth_year) {
        this.birth_year = birth_year;
    }
    
    
    public double Age(double birth_year){
        double ageNow;
        return ageNow = 2018 - birth_year;
    }
      
}