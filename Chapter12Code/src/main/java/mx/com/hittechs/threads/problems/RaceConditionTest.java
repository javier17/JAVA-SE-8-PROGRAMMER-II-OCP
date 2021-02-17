package mx.com.hittechs.threads.problems;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class RaceConditionTest {

    private int i = 0;

    public int incrementValue() {
        System.out.println("Current Thread " + Thread.currentThread().getName());
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this.i++;
    }

    public static void main(String[] args) {
        try {
            RaceConditionTest raceCondition = new RaceConditionTest();
            new Thread(() -> raceCondition.incrementValue()).start();
            new Thread(() -> raceCondition.incrementValue()).start();
            Thread.sleep(1000);
            System.out.println(raceCondition.i);
        } catch (InterruptedException ex) {
            Logger.getLogger(RaceConditionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
