package mx.com.hittechs.strings;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class APIStringTest {

    public static void main(String[] args) {
        String one = "Hello World";
        System.out.println(one);
        System.out.println("01234567890");
        System.out.println("charAt(4): " + one.charAt(4));
        System.out.println("one.contains(\"llo\"): " + one.contains("llo"));
        System.out.println("startsWith(\"Hello\"): " + one.startsWith("Hello"));
        System.out.println("endsWith(\"World\"): " + one.endsWith("World"));
        System.out.println("indexOf(\" \"): " + one.indexOf(" "));
        System.out.println("length(): " + one.length());
        System.out.println("replace('W', 'w'): " + one.replace('W', 'w'));
        System.out.println("replace(\"Hello\", \"Hola\"): " + one.replace("Hello", "Hola"));
        System.out.println("substring(6): " + one.substring(6));
        System.out.println("substring(6, 8): " + one.substring(6, 8));
        System.out.println("toLowerCase(): " + one.toLowerCase());
        System.out.println("one.toUpperCase(): " + one.toUpperCase());
        one = " Hello World ";
        System.out.println("trim(): " + one.trim());
    }
}
