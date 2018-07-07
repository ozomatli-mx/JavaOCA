package mx.com.hittechs.operators.conditional;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @main contacto@hittechs.com.mx
 */
public class ConditionalTest {

    public static void main(String[] args) {
        ConditionalTest ct = new ConditionalTest();
        System.out.println(ct.isItSmall(2) && ct.isItSmall(5));
    }

    public boolean isItSmall(int i) {
        System.out.println("isItSmall");
        return i < 5;
    }
}
