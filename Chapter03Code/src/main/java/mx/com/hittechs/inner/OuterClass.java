package mx.com.hittechs.inner;

/**
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class OuterClass {

    int x;
    static int s = 30;

    class InnerClass {

        int y;

        InnerClass() {
            y = 25;
        }
    }

    static class StaticInnerClass {

        int z = s;
    }

    public static void m() {
        int a = 5;
        class LocalInnerClass {

            void m() {
                System.out.println(a);
            }
        }
        new LocalInnerClass().m();
    }
}
