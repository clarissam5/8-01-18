
public class Vehicle {
	
	String brand;
	String type;
	int horsepower;

	Vehicle(String brand){
		this.brand = brand; //assignment orders don't matter 
	}
	Vehicle(String brand, int horsepower) {
		this.horsepower = horsepower; //this assigns attribute 
	}
	Vehicle(int horsepower, String brand) {
		this.brand = brand;
	}
	int getMileage(int horsePower){
		return horsePower/5;
	}
	public static void main(String args[]) {
		Vehicle civic = new Vehicle("subaru");
		
	}
	
}
