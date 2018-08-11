package unchecked;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class UnCheckedExceptionTest {

    public static void main(String[] args) {
        m();
    }

    static void m(){
        throw new AnyException();
    }
}
class AnyException extends Exception{

}
