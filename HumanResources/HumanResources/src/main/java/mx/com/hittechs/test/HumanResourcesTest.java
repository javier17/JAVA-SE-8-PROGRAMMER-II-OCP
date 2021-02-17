package mx.com.hittechs.test;

import java.time.LocalDate;
import java.time.Month;
import mx.com.hittechs.model.Department;
import mx.com.hittechs.model.Employee;
import mx.com.hittechs.model.Job;

/**
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class HumanResourcesTest {

    public static void main(String[] args) {
        Job job = new Job();
        job.id = 1;
        job.title = "Java Programmer";
        job.minSalary = 10_000;
        job.maxSalary = 20_000;

        Department department = new Department();
        department.id = 1;
        department.location = "Ecuador";
        department.title = "Technology Information";

        Employee employee = new Employee();
        employee.id = 1;
        employee.firstName = "Edgar";
        employee.lastName = "Gomez";
        employee.age = -1;
        employee.email = "egomez@hittechs.com.mx";
        employee.phoneNumber = "123.456.7890";
        employee.salary = 4_500.25;
        employee.hireDate = LocalDate.of(2017, Month.FEBRUARY, 11);
        employee.department = department;
        employee.job = job;

        employee.getDetails();
    }
}
