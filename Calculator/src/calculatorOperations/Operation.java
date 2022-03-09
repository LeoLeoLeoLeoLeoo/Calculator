package calculatorOperations;

public abstract class Operation {

	protected double a,b;
	
	public abstract String getName();
	
	public abstract String getOperator();
	
	public abstract double calc();
	
	public void setNumbers(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public static Operation parseOperator(String o) {
		Operation[] ops = new Operation[] {new Addition(), new Multiplication(), new Subtraction()};
		for (Operation op : ops) {
			if (o.equals(op.getOperator())) {
				return op;
			}
		}
		return null;
	}
}
