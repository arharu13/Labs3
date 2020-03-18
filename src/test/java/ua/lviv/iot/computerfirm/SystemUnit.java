package ua.lviv.iot.computerfirm;

public class SystemUnit {

    protected  String brand;
    protected  int power;

    protected  String getBrand(){
        return brand;

    }

    protected int getPower(){
        return  power;
    }


    public SystemUnit(int power) {
        this.power = power;
    }

    public SystemUnit(String brand) {
        this.brand = brand;
    }
}
