package ua.lviv.iot.computerfirm;

public class AbstractComputer {

	private int price;

	protected String name;

	protected int priceInDollar;

	protected String country;

	protected String brand;

	protected int dateOfManufacture;

	protected int screenExtection;

	protected int power;

	protected int numberOfKeys;

	protected  String color;

	public AbstractComputer(String name, int priceInDollar, String country, String brand, int dateOfManufacture, int screenExtection, int power, int numberOfKeys, String color) {
		this.name = name;
		this.priceInDollar = priceInDollar;
		this.country = country;
		this.brand = brand;
		this.dateOfManufacture = dateOfManufacture;
		this.screenExtection = screenExtection;
		this.power = power;
		this.numberOfKeys = numberOfKeys;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPriceInDollar() {
		return priceInDollar;
	}

	public void setPriceInDollar(int priceInDollar) {
		this.priceInDollar = priceInDollar;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getDateOfManufacture() {
		return dateOfManufacture;
	}

	public void setDateOfManufacture(int dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}

	public int getScreenExtection() {
		return screenExtection;
	}

	public void setScreenExtection(int screenExtection) {
		this.screenExtection = screenExtection;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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
