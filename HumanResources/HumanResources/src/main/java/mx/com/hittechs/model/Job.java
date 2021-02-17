package mx.com.hittechs.model;

/**
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class Job {

    public int id;
    public String title;
    public double minSalary;
    public double maxSalary;

    public void getDetails() {
        System.out.println("Id: " + id);
        System.out.println("Title: " + title);
        System.out.println("Minimum Salary: $" + minSalary);
        System.out.println("Maximum Salary: $" + maxSalary);
    }
}
