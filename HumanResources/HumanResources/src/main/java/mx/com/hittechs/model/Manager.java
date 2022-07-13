/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.hittechs.model;

/**
 *
 * @author Usuario
 */
public class Manager extends Employee {

    private Employee secretary;

    public Manager() {
    }

    public Manager(String firstName, String lastName) {
        super(firstName, lastName);
    }
    
    public Employee getSecretary() {
        return secretary;
    }

    public void setSecretary(Employee secretary) {
        this.secretary = secretary;
    }

}
