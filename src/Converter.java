
public class Converter {

	/* @Authors:
	 * Student 1
	 * Joshua Posyluzny
	 * Student 3
	 * 
	 */
	
	double celsius;
	
	private double celsiusToFahrenheit(double C)
	{
		// TODO: THe third student will implement this method
		return 0;
	}
	
	private double fahrenheitToCelsius(double F)
	{
		double fahrenheit = F;
		celsius = ((F - 32)*(5.0/9.0));
		return celsius;
	}
	
	public static void main(String[] args) {
		
		Converter conv = new Converter();
		
		double fahr = 180;
		double fToC = conv.fahrenheitToCelsius(fahr);
		System.out.println(fToC);
	}

}
