package mx.com.hittechs.threads.problems;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class StarvationTest implements Runnable {

    @Override
    public void run() {
        execute();
    }

    public synchronized void execute() {
        String thread = Thread.currentThread().getName();
        String fileName = thread.concat(".txt");
        Path path = Paths.get("src/main/resources/".concat(fileName));
        String msg = thread.concat(" write a message.");
        try {
            Files.deleteIfExists(path);
            Files.createFile(path);
            Files.write(path, msg.getBytes());
        } catch (IOException ex) {
            Logger.getLogger(StarvationTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (true) {
            try {
                System.out.println(thread.concat(" is working"));
                wait(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(StarvationTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args)
            throws InterruptedException {
        StarvationTest starvation = new StarvationTest();
        Thread thread1 = new Thread(starvation);
        Thread thread2 = new Thread(starvation);
        Thread thread3 = new Thread(starvation);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
