package mx.com.hittechs.boundles;

import java.util.Locale;

/**
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class ResourceBundleTest {

    enum Laguage {
        ES(Locale.getDefault()),
        EN(new Locale.Builder().setRegion("US").setLanguage("en").build()),
        FR(new Locale.Builder().setRegion("FR").setLanguage("fr").build());

        private final Locale locale;

        private Laguage(Locale locale) {
            this.locale = locale;
        }

        public Locale getLocale() {
            return locale;
        }
    }

    public static void main(String[] args) {

    }
}
