
public class SalesEmployee extends Employee {
	//removed as Feature Envy
	//private float commissionRate;
	//private int salesMade;

	public SalesEmployee(String name, float salary, float commissionRate, int salesMade) {
		super(name, salary, salesMade * commissionRate);
		//this.commissionRate = commissionRate;
		//this.salesMade = salesMade;
	}

	//Feature Envy
//	private float variableComponent() {
//		return salesMade * commissionRate;
//	}

	//Duplicate code
//	public float computeSalary() {
//		return (getBaseSalary() - computeDeductions() + variableComponent());
//	}
}
