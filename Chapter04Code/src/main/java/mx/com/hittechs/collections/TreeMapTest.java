package mx.com.hittechs.collections;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class TreeMapTest {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "C");
        map.put(2, "B");
        map.put(1, "A");
        map.put(4, "E");
        map.put(4, "D");
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
