package model;

public abstract class AbstractComputer {

    private int price;
    private String brand;
    private String color;
    private int dateOfManufacture;
    private int power;
    private int numberOfKeys;
    private String country;
    private int screenExtection;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(int dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getScreenExtection() {
        return screenExtection;
    }

    public void setScreenExtection(int screenExtection) {
        this.screenExtection = screenExtection;
    }

    public AbstractComputer(int price) {
        super();
        this.price = price;


    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
