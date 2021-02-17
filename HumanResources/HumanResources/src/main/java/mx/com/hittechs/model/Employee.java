package mx.com.hittechs.model;

import java.time.LocalDate;

/**
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class Employee {

    public int id;
    public String firstName;
    public String lastName;
    public int age;
    public String email;
    public String phoneNumber;
    public double salary;
    public LocalDate hireDate;
    public Department department;
    public Job job;

    public void getDetails() {
        System.out.println("Id: " + id);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Salary: " + salary);
        System.out.println("Hire Date: " + hireDate);
        if (department != null) {
            System.out.println("Department: " + department.title);
        }
        if (job != null) {
            System.out.println("Job: " + job.title);
        }
    }
}
