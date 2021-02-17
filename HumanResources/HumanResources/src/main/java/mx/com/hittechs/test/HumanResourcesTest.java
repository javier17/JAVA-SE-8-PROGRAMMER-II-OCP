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
        job.setId(1);
        job.setTitle("Java Programmer");
        job.setMinSalary(10_000);
        job.setMaxSalary(20_000);

        Department department = new Department();
        department.setId(1);
        department.setLocation("Ecuador");
        department.setTitle("Technology Information");

        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("Edgar");
        employee.setLastName("Gomez");
        employee.setAge(27);
        employee.setEmail("egomez@hittechs.com.mx");
        employee.setPhoneNumber("123.456.7890");
        employee.setSalary(4_500.25);
        employee.setHireDate(LocalDate.of(2017, Month.FEBRUARY, 11));
        employee.setDepartment(department);
        employee.setJob(job);

        employee.getDetails();
    }
}
