package mx.com.hittechs.strings;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class EqualTest {

    public static void main(String[] args) {

        String He = "He";
        String llo = "llo";
        String helloOne = He + llo;
        String helloTwo = "He" + "llo";
        String helloThree = "Hello";

        if (helloOne == helloTwo) {
            System.out.print("1");
        } else {
            System.out.print("2");
        }

        if (helloTwo == helloThree) {
            System.out.print("3");
        } else {
            System.out.print("4");
        }
    }
}
