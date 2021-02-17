package mx.com.hittechs.collections;

import java.util.ArrayList;

/**
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Abraham");
        myList.add(0, "Luis");
        myList.add("Carlos");
        myList.add("Pepe");
        myList.add("Maria");
        System.out.println(myList);
        System.out.println("get(1): " + myList.get(1));
        System.out.println("size(): " + myList.size());
        System.out.println("indexOf(\"Maria\"): " + myList.indexOf("Maria"));
        myList.remove("Maria");
        System.out.println(myList);
        myList.remove(0);
        System.out.println(myList);
    }
}
