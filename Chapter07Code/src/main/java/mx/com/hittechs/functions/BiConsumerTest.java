package mx.com.hittechs.functions;

import java.util.function.BiConsumer;

/**
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class BiConsumerTest {

    public static void main(String[] args) {        
    }

    static <T> void addTwo(T a1, T a2, BiConsumer<T, T> c) {
        c.accept(a1, a2);
    }
}
