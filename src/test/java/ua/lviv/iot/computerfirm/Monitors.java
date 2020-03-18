package ua.lviv.iot.computerfirm;

public class Monitors extends AbstractComputer {

	protected String brand;
	protected int screenExtaction;

	protected String getBrand() {
		return brand;
	}

	protected int getScreenExtaction() {
		return screenExtaction;
	}

	public Monitors(int price, String brand, int screenExtaction) {
		super(price);
		this.brand = brand;
		this.screenExtaction = screenExtaction;
	}

	public Monitors(int price) {
		super(price);

	}
}
	

