package mx.com.hittechs.generics.wilcards;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class WildcardTest {

    public static void iterate(List<Number> list) {
        for (Number v : list) {
            System.out.println(v);
        }
    }

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        numbers.add(1);
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        List<Double> doubles = new ArrayList<>();
        doubles.add(3.0);

    }
}
