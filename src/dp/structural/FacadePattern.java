package dp.structural;
/*
 * A Facade Pattern says that just "just provide a unified and simplified interface to a set of interfaces in a subsystem, therefore it hides the complexities of the subsystem from the client".
 *  hides the complexities of the system and provides an interface to the client using which the client can access the system.
 */

interface MobileShop {  
    public void modelNo();  
    public void price();  
} 

class Iphone implements MobileShop {  
    @Override  
    public void modelNo() {  
        System.out.println(" Iphone 6 ");  
    }  
    @Override  
    public void price() {  
    System.out.println(" Rs 65000.00 ");  
    }  
}

class Samsung implements MobileShop {  
    @Override  
    public void modelNo() {  
    System.out.println(" Samsung galaxy tab 3 ");  
    }  
    @Override  
    public void price() {  
        System.out.println(" Rs 45000.00 ");  
    }  
}  

class ShopKeeper {  
    private MobileShop iphone;  
    private MobileShop samsung;  
    private MobileShop blackberry;  
      
    public ShopKeeper(){  
        iphone= new Iphone();  
        samsung=new Samsung();  
    }  
    public void iphoneSale(){  
        iphone.modelNo();  
        iphone.price();  
    }  
        public void samsungSale(){  
        samsung.modelNo();  
        samsung.price();  
    }   
} 

public class FacadePattern {

	public static void main(String[] args) {
	
		ShopKeeper sk=new ShopKeeper(); 
		sk.iphoneSale();
		sk.samsungSale();

	}

}
