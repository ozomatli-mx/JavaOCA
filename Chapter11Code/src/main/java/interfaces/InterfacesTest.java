package interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class InterfacesTest {

    static void flyInAction(Flyer flyer) {
        flyer.takeOff();
        flyer.fly();
        flyer.land();
    }

    public static void main(String[] args) {
        Flyer flyerOne = new AirPlane();
        Flyer flyerTwo = new Bird();

//        List<Flyer> flyers = new ArrayList<>();
//        flyers.add(new AirPlane());
//        flyers.add(new Bird());
//        for (Flyer flyer : flyers) {
//            flyer.takeOff();
//            flyer.fly();
//            flyer.land();
//        }
    }
}
