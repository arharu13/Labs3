package model;

public class Monitor extends AbstractComputerComponent {
    public String brand;
    public int screeExtensions;


    public Monitor(int price) {
        super(price);
    }

    public int screeExtensions() {
        return screeExtensions;
    }

    public void screeExtensions(int screeExtensions) {
        this.screeExtensions = screeExtensions;
    }

    public String brand() {
        return brand;
    }

    public void brand(String brand) {
        this.brand = brand;


    }
}