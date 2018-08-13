/*
 * Example of Constructors and objects
 */
public class Ice {
	String shape;
	String color;
	String flavor;
	String fill;
		//constructor default
	Ice(){
		this.shape = "cube";
		this.color = "white";
		this.fill = "water";
	}
		//first constructor
	Ice(String shape,String color, String flavor, String fill){
		this.shape = shape;
		this.color = color;
		this.flavor = flavor;
		this.fill = fill;
	}
		//second constructor
	Ice(String shape){
		this.shape= shape;
	}
		//third constructor 
	Ice(String color, String flavor, String fill){
		this.color = color;
		this.flavor = flavor;
		this.fill = fill;
	}
		//creating overriding a method 
		//toString will originally give you the address of what you are looking for
	public String toString() {
		return ("color:" + this.color + "\n" + "shape:" + this.shape + "\n" + "flavor:" + this.flavor + "\n" + "fill:" + this.fill);
	} 		//returning these values 
			
	public static void main(String args[]) {
			//new objects 
		Ice first = new Ice();
		Ice second = new Ice("star", "Red", "Sweet", "Strawberry water");
		Ice third = new Ice("Diamond");
		Ice forth = new Ice("black", "cola", "cola");
		Ice fifth = new Ice("black", "cola", "cola");
		System.out.println(fifth.toString());
	}
}
