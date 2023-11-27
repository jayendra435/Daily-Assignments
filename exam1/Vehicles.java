package exam1;

public class Vehicles {

	public static void main(String[] args) {
		Truck truck = new Truck("make","51","great",1999);
		System.out.println(truck.distanceTravelled());
		System.out.println(truck.fuelEfficiency());
		System.out.println(truck.maximumSpeed());
	}
}

class Vehicle {
	protected String make, model, fuelType;
	protected int year;
	Vehicle(String make, String model, String fueltype, int year) {
		this.make = make;
		this.model = model;
		this.fuelType = fueltype;
		this.year = year;
	}
}

class Truck extends Vehicle {
	private int distanceTravelled = 60;
	private int maxSpeed = 200;

	Truck(String make, String model, String fueltype, int year) {
		super(make, model, fueltype, year);
	}

	public int fuelEfficiency() {
		if (fuelType.equals("great")) {
			return 100;
		} else {
			return 50;
		}
	}

	public int distanceTravelled() {
		return distanceTravelled;
	}

	public int maximumSpeed() {
		return maxSpeed;
	}
}

class Car extends Vehicle {
	private int distanceTravelled = 60;
	private int maxSpeed = 200;

	Car(String make, String model, String fueltype, int year) {
		super(make, model, fueltype, year);
	}

	public int fuelEfficiency() {
		if (fuelType.equals("great")) {
			return 100;
		} else {
			return 50;
		}
	}

	public int distanceTravelled() {
		return distanceTravelled;
	}

	public int maximumSpeed() {
		return maxSpeed;
	}
}

class MotorCycle extends Vehicle {
	private int distanceTravelled = 60;
	private int maxSpeed = 200;

	MotorCycle(String make, String model, String fueltype, int year) {
		super(make, model, fueltype, year);
	}

	public int fuelEfficiency() {
		if (fuelType.equals("great")) {
			return 100;
		} else {
			return 50;
		}
	}

	public int distanceTravelled() {
		return distanceTravelled;
	}

	public int maximumSpeed() {
		return maxSpeed;
	}
}