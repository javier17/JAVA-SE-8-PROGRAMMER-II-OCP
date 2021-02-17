package mx.com.hittechs.functions.method.references;

/**
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class HelloWorldImpl implements HelloWorld {

    private String helloMessage = "Hello World!";

    public HelloWorldImpl() {
        System.out.println("Constructor...");
    }

    public void createHello(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    @Override
    public void sayHello() {
        System.out.println(this.helloMessage);
    }
}
