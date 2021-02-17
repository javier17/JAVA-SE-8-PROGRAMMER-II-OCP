package mx.com.hittechs.collections;

import java.util.Arrays;

/**
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class ArraysTest {

    public static void main(String[] args) {
        int intArr[] = {10, 20, 15, 22, 35};
        Arrays.sort(intArr);
        for (int v : intArr) {
            System.out.println(v);
        }

        System.out.println("binarySearch: " + Arrays.binarySearch(intArr, 20));
    }
}
