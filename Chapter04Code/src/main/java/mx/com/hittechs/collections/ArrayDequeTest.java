package mx.com.hittechs.collections;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class ArrayDequeTest {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(10);
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(50);
        System.out.println(deque);

        deque.clear();
        deque.addFirst(70);
        deque.addFirst(60);
        deque.addLast(80);
        deque.addLast(90);

        System.out.println(deque);
        System.out.println("element: " + deque.element());
        System.out.println("getFirst: " + deque.getFirst());
        System.out.println("peek: " + deque.peek());
        System.out.println(deque);
        System.out.println("poll: " + deque.poll());
        System.out.println(deque);

        deque.push(60);
        deque.push(50);
        deque.push(40);
        System.out.println(deque);
        deque.remove();
        System.out.println(deque);
        deque.pop();
        System.out.println(deque);
    }
}
