package dp.structural;
/*
 * says that just "attach a flexible additional responsibilities to an object dynamically".
 * Adding the element at runtime
 */

interface Car {
	 
    public void assemble();
}

class BasicCar implements Car {
	 
    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }
 
}

class CarDecorator implements Car {
	 
    protected Car car;
     
    public CarDecorator(Car c){
        this.car=c;
    }
     
    @Override
    public void assemble() {
        this.car.assemble();
    }
 
}

class SportsCar extends CarDecorator {
	 
    public SportsCar(Car c) {
        super(c);
    }
 
    @Override
    public void assemble(){
        car.assemble();
        System.out.print(" Adding features of Sports Car.");
    }
}

class LuxuryCar extends CarDecorator {
	 
    public LuxuryCar(Car c) {
        super(c);
    }
     
    @Override
    public void assemble(){
        car.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}

public class DecoratorPattern {

	public static void main(String[] args) {
		
		 Car sportsCar = new SportsCar(new BasicCar());
	        sportsCar.assemble();
	        System.out.println("\n*****");
	         
	        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
	        sportsLuxuryCar.assemble();
	}

}
