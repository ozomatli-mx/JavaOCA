package interfaces;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class AirPlane implements Flyer {

    @Override
    public void takeOff() {
        System.out.println("AirPlane.takeOff");
    }

    @Override
    public void fly() {
        System.out.println("AirPlane.fly");
    }

    @Override
    public void land() {
        System.out.println("AirPlane.land");
    }
}
