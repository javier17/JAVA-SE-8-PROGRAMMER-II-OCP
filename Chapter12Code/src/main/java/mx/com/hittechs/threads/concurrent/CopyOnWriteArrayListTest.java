package mx.com.hittechs.threads.concurrent;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class CopyOnWriteArrayListTest {

    public static void main(String[] args) {

        List<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        new WriteThread("Writer", list).start();
        new ReadThread("Reader", list).start();
    }
}

class WriteThread extends Thread {

    private final List<Integer> list;

    public WriteThread(String name, List<Integer> list) {
        this.list = list;
        super.setName(name);
    }

    @Override
    public void run() {
        int count = 6;

        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(WriteThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            list.add(count++);
            System.out.println(super.getName() + " done");
        }
    }
}

class ReadThread extends Thread {

    private final List<Integer> list;

    public ReadThread(String name, List<Integer> list) {
        this.list = list;
        super.setName(name);
    }

    public void run() {

        while (true) {
            String output = "\n" + super.getName() + ":";
            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()) {
                Integer next = iterator.next();
                output += " " + next;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ReadThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println(output);
        }
    }
}
