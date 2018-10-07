package mx.com.hittechs.array.list;

import java.util.ArrayList;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("John");
        myList.add(0, "Ming");
        myList.add("Mary");
        myList.add("Prashant");
        myList.add("Desmond");
        System.out.println(myList);
        System.out.println("get(1): " + myList.get(1));
        System.out.println("size(): " + myList.size());
        System.out.println("indexOf(\"Mary\"): " + myList.indexOf("Mary"));
        myList.remove("Mary");
        System.out.println(myList);
        myList.remove(0);
        System.out.println(myList);
    }
}
