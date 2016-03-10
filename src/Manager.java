
public class Manager extends Employee {
	//private float variableComponent; //pull-up to Employee

	public Manager(String name, float salary, float variableComponent) {
		super(name, salary, variableComponent);
		//this.variableComponent = variableComponent;
	}

	//Pull-up method as duplicate code
//	public float variableComponent() {
//		return variableComponent;
//	}

	//Duplicate code
//	public float computeSalary() {
//		return (getBaseSalary() - computeDeductions() + variableComponent());
//	}
}
