package mx.com.hittechs.string.builder;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class StringBuilderTest {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("append(\" \"): " + sb.append(" "));
        System.out.println("insert(6, \"World\"): " + sb.insert(6, "World"));
        System.out.println("charAt(6): " + sb.charAt(6));
        System.out.println("delete(0, 5): " + sb.delete(0, 5));
        System.out.println("length(): " + sb.length());
        System.out.println("replace(0, 1, \"Hello \"): " + sb.replace(0, 1, "Hello "));
        System.out.println("reverse(): " + sb.reverse());
    }
}
