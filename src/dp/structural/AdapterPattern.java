package dp.structural;
/*
 * Adapter Pattern says that just "converts the interface of a class into another interface that a client wants".
 * In other words, to provide the interface according to client requirement while using the services of a class with a different interface.
 * ADV: It allows two or more previously incompatible objects to interact.
 * Usage: When an object needs to utilize an existing class with an incompatible interface.
 */

interface CreditCard {  
    public void giveBankDetails();  
    public String getCreditCard();  
}

class BankDetails{  
    private String bankName;  
    private String accHolderName;  
    private long accNumber;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public long getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}  
}

 class BankCustomer extends BankDetails implements CreditCard {

	@Override
	public void giveBankDetails() {
		 setAccHolderName("Pavan");  
		   setAccNumber(123232323);  
		   setBankName("SBI");  
		
	}

	@Override
	public String getCreditCard() {
		long accno=getAccNumber();  
		   String accholdername=getAccHolderName();  
		   String bname=getBankName();  
		          
		   return ("The Account number "+accno+" of "+accholdername+" in "+bname+ ""
		   		+ "bank is valid and authenticated for issuing the credit card. ");  
	}  
	

}

public class AdapterPattern {

	public static void main(String[] args) {
		
		 CreditCard targetInterface=new BankCustomer();  
		  targetInterface.giveBankDetails();  
		  System.out.print(targetInterface.getCreditCard());  

	}

}
