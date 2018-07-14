package mx.com.hittechs.operators.unuary;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class UnuaryTest {

    public static void main(String[] args) {
        int a = 11;
        int b = 2;
        int c = 5;
        System.out.println(++a + b++ * c);
        a++;
        System.out.println(a++);
        System.out.println(a);
    }
}
