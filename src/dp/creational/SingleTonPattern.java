package dp.creational;
/*
 * Singleton Pattern says that just"define a class that has only one instance and provides a global point of access to it".
 * ADV: Saves memory because object is not created at each request. Only single instance is reused again and again.
 * Usage: Singleton pattern is mostly used in multi-threaded and database applications. It is used in logging, caching, thread pools, configuration settings etc.
 */
class SingleObject {

	   //create an object of SingleObject
	   private static SingleObject instance = new SingleObject();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private SingleObject(){}

	   //Get the only object available
	   public static SingleObject getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Hello World!");
	   }
	}

public class SingleTonPattern {

	public static void main(String[] args) {
		   //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	     //SingleObject object = new SingleObject();

	      //Get the only object available
	      SingleObject object = SingleObject.getInstance();

	      //show the message
	      object.showMessage();
	      
	}
}
