
public abstract class Employee {
	private String name;
	private float salary;
	private float variableComponent; // Pull-up field

	//removed as redundant after code-refactoring
//	public Employee(String name, float salary) {
//		this.name = name;
//		this.salary = salary;
//	}

	// added constructor due to Pull-up field
	public Employee(String name, float salary, float variableComponent) {
		this.name = name;
		this.salary = salary;
		this.variableComponent = variableComponent;
	}

	public float getBaseSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public float computeDeductions() {
		return salary * 0.2f;
	}

	//added as Feature Envy
	public float variableComponent() {
		return variableComponent;
	}

	// Pull-up method
	public float computeSalary() {
		return (getBaseSalary() - computeDeductions() + variableComponent());
	}

}
