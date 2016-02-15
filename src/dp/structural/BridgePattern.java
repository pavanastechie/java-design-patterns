package dp.structural;

/*
 * Decouple an abstraction from its implementation so that the two can vary independently
 * Notice the bridge between Shape and Color interfaces and use of composition in implementing the bridge pattern.
 * Here Color is composite in Shape
 */
 interface Color {
	 
     void applyColor();
}

 abstract class Shape {
	    //Composition - implementor
	    protected Color color;
	     
	    //constructor with implementor as input argument
	    public Shape(Color c){
	        this.color=c;
	    }
	     
	    abstract public void applyColor();
	}
 
 class Triangle extends Shape{
	 
	    public Triangle(Color c) {
	        super(c);
	    }
	 
	    @Override
	    public void applyColor() {
	        System.out.print("Triangle filled with color ");
	        color.applyColor();
	    } 
	 
	}
 
 class Pentagon extends Shape{
	 
	    public Pentagon(Color c) {
	        super(c);
	    }
	 
	    @Override
	    public void applyColor() {
	        System.out.print("Pentagon filled with color ");
	        color.applyColor();
	    } 
	 
	}
 
 class RedColor implements Color{
	 
	    public void applyColor(){
	        System.out.println("red.");
	    }
	}
 
 class GreenColor implements Color{
	 
	    public void applyColor(){
	        System.out.println("green.");
	    }
	}
 
public class BridgePattern {

	public static void main(String[] args) {
		 Shape tri = new Triangle(new RedColor());
	        tri.applyColor();
	         
	        Shape pent = new Pentagon(new GreenColor());
	        pent.applyColor();
	}

}
