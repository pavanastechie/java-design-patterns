package dp.creational;
/*
 * Prototype Pattern says that cloning of an existing object instead of creating new one and can also be customized as per the requirement.
 * This pattern should be followed, if the cost of creating a new object is expensive and resource intensive.
 * ADV: It hides complexities of creating objects.
 * Usage: When the cost of creating an object is expensive or complicated. classes are instantiated at runtime.
 */

interface Prototype {  
	  
    public Prototype getClone();  
     
}

class EmployeeRecord implements Prototype{  
    
	   private int id;  
	   private String name, designation;  
	   private double salary;  
	   private String address;  
	      
	   public EmployeeRecord(){  
	            System.out.println("   Employee Records of Oracle Corporation ");  
	            System.out.println("---------------------------------------------");  
	            System.out.println("Eid"+"\t"+"Ename"+"\t"+"Edesignation"+"\t"+"Esalary"+"\t\t"+"Eaddress");  
	      
	}  
	  
	 public  EmployeeRecord(int id, String name, String designation, double salary, String address) {  
	          
	        this();  
	        this.id = id;  
	        this.name = name;  
	        this.designation = designation;  
	        this.salary = salary;  
	        this.address = address;  
	    }  
	      
	  public void showRecord(){  
	          
	        System.out.println(id+"\t"+name+"\t"+designation+"\t"+salary+"\t"+address);  
	   }  
	  
	    @Override  
	    public Prototype getClone() {  
	          
	        return new EmployeeRecord(id,name,designation,salary,address);  
	    }  
	}



public class ProtoypePattern {

	public static void main(String[] args) {
		 EmployeeRecord e1=new EmployeeRecord(1,"Pavan","SE",20000,"MAIN ROAD, PullamPEt");  
         
	        e1.showRecord();  
	        System.out.println("\n");  
	        EmployeeRecord e2=(EmployeeRecord) e1.getClone();  
	        e2.showRecord();  

	}

}
