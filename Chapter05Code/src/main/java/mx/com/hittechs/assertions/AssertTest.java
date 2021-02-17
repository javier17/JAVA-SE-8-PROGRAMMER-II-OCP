package mx.com.hittechs.assertions;

/**
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class AssertTest {

    public static void main(String[] args) {
        int age = 14;
        assert !(age <= 18) : "Cannot Vote";
        System.out.println("The voter's age is " + age);
    }
}
