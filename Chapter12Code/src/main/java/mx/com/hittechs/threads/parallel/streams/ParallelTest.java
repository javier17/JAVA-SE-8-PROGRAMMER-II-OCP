package mx.com.hittechs.threads.parallel.streams;

import java.time.LocalTime;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class ParallelTest {

    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total += multiply(i);
        }
        System.out.println(total);
        System.out.println(LocalTime.now());
    }

    public static int multiply(int number) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ParallelTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return number * 2;
    }
}
