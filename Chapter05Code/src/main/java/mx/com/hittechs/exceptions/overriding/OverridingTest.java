package mx.com.hittechs.exceptions.overriding;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class OverridingTest {
    public static void main(String[] args) {
        
    }
}
class A{
    void m() throws SQLException{
    
    }
}
class B extends A{

}

