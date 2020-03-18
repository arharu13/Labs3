package ua.lviv.iot.computerfirm;

public class Keyboard {
    protected String brand;
    protected int numberOfKeys;

    protected String getBrand(){
        return  brand;

    }
    protected int getNumberOfKeys(){
        return  numberOfKeys;
    }

    public Keyboard(String brand) {
        this.brand = brand;
    }

    public Keyboard(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }
}
