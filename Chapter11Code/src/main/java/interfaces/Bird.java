package interfaces;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class Bird extends Animal implements Flyer {

    @Override
    public void takeOff() {
        System.out.println("Bird.takeOff");
    }

    @Override
    public void fly() {
        System.out.println("Bird.fly");
    }

    @Override
    public void land() {
        System.out.println("Bird.land");
    }

    @Override
    void eat() {
        System.out.println("Bird.eat");
    }

}
