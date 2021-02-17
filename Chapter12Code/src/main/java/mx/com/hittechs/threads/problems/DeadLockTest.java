package mx.com.hittechs.threads.problems;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
class A {

    public synchronized void a(B b) {
        try {
            System.out.println("Entrando a A.a()");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " intentando llamar a B.b()");
            b.b(this);
        } catch (InterruptedException ex) {
            Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class B {

    public synchronized void b(A a) {
        try {
            System.out.println("Entrando a B.b()");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " intentando llamar a A.a()");
            a.a(this);
        } catch (InterruptedException ex) {
            Logger.getLogger(B.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

public class DeadLockTest implements Runnable {

    A a = new A();
    B b = new B();

    DeadLockTest() {
        Thread thread = new Thread(this);
        thread.start();
        b.b(a);
    }

    @Override
    public void run() {
        a.a(b);
    }

    public static void main(String[] args) {
        new DeadLockTest();
    }
}
