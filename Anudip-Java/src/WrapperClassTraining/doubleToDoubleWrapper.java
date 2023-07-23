package WrapperClassTraining;

public class doubleToDoubleWrapper {

	public static void main(String[] args) {
		double x=10.50;
		Double y = new Double(x); // Double Wrapper constructor
		Double z = Double.valueOf(x); // Double Wrapper method
		System.out.println(y);
		System.out.println(z);

	}

}
