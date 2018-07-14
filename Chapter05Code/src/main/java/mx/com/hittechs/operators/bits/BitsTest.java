package mx.com.hittechs.operators.bits;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class BitsTest {

    public static void main(String[] args) {
        byte x = 12;
        byte y = 13;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));
        System.out.println("----");
        int result = x | y;
        System.out.println(Integer.toBinaryString(result));
    }
}
