package mx.com.hittechs.threads.problems;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
class Criminal {

    private boolean hostageReleased = false;

    public void releaseHostage(Police police) {
        while (!police.isMoneySent()) {
            System.out.println("Criminal: waiting police to give ransom");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(LiveLockTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Criminal: released hostage");
        this.hostageReleased = true;
    }

    public boolean isHostageReleased() {
        return this.hostageReleased;
    }
}

class Police {

    private boolean moneySent = false;

    public void giveRansom(Criminal criminal) {
        while (!criminal.isHostageReleased()) {
            System.out.println("Police: waiting criminal to release hostage");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(LiveLockTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Police: sent money");
        this.moneySent = true;
    }

    public boolean isMoneySent() {
        return this.moneySent;
    }
}

public class LiveLockTest {

    static final Police police = new Police();
    static final Criminal criminal = new Criminal();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> police.giveRansom(criminal));
        t1.start();

        Thread t2 = new Thread(() -> criminal.releaseHostage(police));
        t2.start();
    }
}
