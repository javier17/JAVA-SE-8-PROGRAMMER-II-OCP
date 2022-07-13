package mx.com.hittechs.model;

/**
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class Department {

    private int id;
    private String title;
    private String location;

    public Department() {
    }

    public Department(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void getDetails() {
        System.out.println("Id: " + id);
        System.out.println("Title: " + title);
        System.out.println("Location: " + location);
    }
}
