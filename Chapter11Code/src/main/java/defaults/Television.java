package defaults;
/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public interface Television {

    int getChannel();

    void setChannel(int channel);

    public default void uppChannel() {
        setChannel(getChannel() + 1);
    }

    default void downChannel() {
        setChannel(getChannel() - 1);
    }
    static void m(){
        System.out.println("static method");
    }
}

class Sony implements Television {

    int channel;

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.setChannel(channel);
    }

}

class Philiphs implements Television {

    int channel;

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.setChannel(channel);
    }

    @Override
    public void downChannel() {
    }
    
    
}
