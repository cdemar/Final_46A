import java.util.*;

class Car {
	private int year;
	private String make;
	private String model;
	private int mileage;
	private int speed;

	public Car() {
		this.year = 0;
		this.make = "";
		this.model = "";
		this.mileage = 0;
		this.speed = 0;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int y) {
		this.year = y;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String ma) {
		this.make = ma;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String mo) {
		this.model = mo;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mi) {
		this.mileage = (int) (this.mileage + mi);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int p) {
		this.speed = p;
	}

	public void accelerate() {
		this.speed = this.speed + 1;
	}

	public void brake() {
		this.speed = this.speed - 1;
	}
}

public class Final {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the make: ");
		String make = kb.nextLine();

		System.out.print("Enter the model: ");
		String model = kb.nextLine();

		System.out.print("Enter the year: ");
		int year = kb.nextInt();

		System.out.print("Enter the mileage: ");
		double mileage = kb.nextInt();

		System.out.println();

		Car c = new Car();

		c.setYear(year);
		c.setMake(make);
		c.setModel(model);
		c.setMileage(mileage);

		for (int a = 0; a < 40; a++) {
			c.accelerate();
		}

		double d = c.getSpeed() * .75;
		c.setMileage(d);

		System.out.println(c.getYear() + " " + c.getMake() + " " + c.getModel()
				+ " is running at " + c.getSpeed() + " MPH.");

		for (int b = 0; b < 40; b++) {
			c.brake();
		}

		System.out.println("The car has stopped, " + c.getSpeed() + " MPH.");

		System.out.println("The current mileage is " + c.getMileage()
				+ " miles.");
	}
}