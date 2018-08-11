package exceptions;

import java.sql.SQLException;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class ExceptionTest {

    public static void main(String[] args) {
        one();
        //More code
    }

    static void one() {
        two();
        //More code
    }

    static void two() {
        three();
        //More code
    }

    static void three() {
        //Code
        throw new SQLException();
        //More code
    }
}
