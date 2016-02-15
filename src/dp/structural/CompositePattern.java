package dp.structural;

import java.util.ArrayList;
import java.util.List;

/*
 * Composite pattern is one of the Structural design pattern and is used when we have to represent a part-whole hierarchy. When we need to create a structure in a way that the objects in the structure has to be treated the same way, we can apply composite design pattern.
 * Base Component – Base component is the interface for all objects in the composition, client program uses base component to work with the objects in the composition. It can be an interface or an abstract class with some methods common to all the objects.
*Leaf – Defines the behaviour for the elements in the composition. It is the building block for the composition and implements base component. It doesn’t have references to other Components.
*Composite – It consists of leaf elements and implements the operations in base component.
 */

interface Shape10 {
    
    public void draw(String fillColor);
}

class Triangle10 implements Shape10 {
	 
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color "+fillColor);
    }
 
}

class Circle10 implements Shape10 {
	 
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Circle with color "+fillColor);
    }
 
}

class Drawing implements Shape10{
	 
    //collection of Shapes
    private List<Shape10> shapes = new ArrayList<Shape10>();
     
    @Override
    public void draw(String fillColor) {
        for(Shape10 sh : shapes)
        {
            sh.draw(fillColor);
        }
    }
     
    //adding shape to drawing
    public void add(Shape10 s){
        this.shapes.add(s);
    }
     
    //removing shape from drawing
    public void remove(Shape10 s){
        shapes.remove(s);
    }
     
    //removing all the shapes
    public void clear(){
        System.out.println("Clearing all the shapes from drawing");
        this.shapes.clear();
    }
}

public class CompositePattern {

	public static void main(String[] args) {
		 Shape10 tri = new Triangle10();
	        Shape10 tri1 = new Triangle10();
	        Shape10 cir = new Circle10();
	         
	        Drawing drawing = new Drawing();
	        drawing.add(tri1);
	        drawing.add(tri1);
	        drawing.add(cir);
	         
	        drawing.draw("Red");
	         
	        drawing.clear();
	         
	        drawing.add(tri);
	        drawing.add(cir);
	        drawing.draw("Green");

	}

}
