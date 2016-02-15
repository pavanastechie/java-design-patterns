package dp.creational;
/*
 * says that just define an interface or abstract class for creating an object,
 *  but let the subclasses decide which class to instantiate.
 *  Advantage: Factory Method Pattern allows the sub-classes to choose the type of objects to create.
 *  Usage: When a class doesn't know what sub-classes will be required to create
 */

 abstract class Plan{
	 protected double rate;
	 abstract void getRate();
	 
	 public void calBill(int units) {
		 System.out.println(units * rate);
	 }
	 
 }
 class DomesticPlan extends Plan {
	 @Override
	 public void getRate() {
		 rate = 3.50;
	 }
 }

 class CommericalPlan extends Plan {
	 @Override
	 public void getRate() {
		 rate = 7.50;
	 }
 }
 
 class InstitutionPlan extends Plan {
	 @Override
	 public void getRate() {
		 rate = 5.50;
	 }
 }
 
 class GetPlanFactory {
	 
	 public Plan getPlan(String plan) {
		 if(plan == null) {
			 return null;
		 }
		 else if(plan.equalsIgnoreCase("DOMESTICPLAN")) {
			 return new DomesticPlan();
		 }
		 else if(plan.equalsIgnoreCase("COMMERICALPLAN")) {
			 return new CommericalPlan();
		 }
		 else if(plan.equalsIgnoreCase("INSISTUTIONPLAN")) {
			 return new InstitutionPlan();
		 }
		 
		 return null;
	 }
 }
public class FactoryPattern {

	public static void main(String[] args) {
		GetPlanFactory pf = new GetPlanFactory();
		Plan p = pf.getPlan("DOMESTICPLAN");
		p.getRate();
		p.calBill(400);
		Plan p1 = pf.getPlan("COMMERICALPLAN");
		p1.getRate();
		p1.calBill(300);
		Plan p2 = pf.getPlan("INSISTUTIONPLAN");
		p2.getRate();
		p2.calBill(300);

	}

}
