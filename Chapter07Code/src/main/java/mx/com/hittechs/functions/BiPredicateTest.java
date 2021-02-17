package mx.com.hittechs.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

/**
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class BiPredicateTest {

    public static void validate(BiPredicate<List<String>, String> biPredicate) {

    }

    public static void main(String[] args) {
        BiPredicate<List<String>, String> checkIfInList
                = (list, value) -> list.contains(value);

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Exist: " + checkIfInList.test(fruits, "Water Melon"));
        System.out.println("Exist: " + checkIfInList.test(fruits, "Grapes"));
        System.out.println("Exist: " + checkIfInList.test(fruits, "Apple"));

    }
}
