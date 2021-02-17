package mx.com.hittechs.threads.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class ExecutorsTest {

    public static void main(String[] args) {

    }

    private static void doLongWork(String msg) {
        System.out.println("Running " + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ExecutorsTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
