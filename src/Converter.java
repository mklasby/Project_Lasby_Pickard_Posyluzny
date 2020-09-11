
public class Converter {

	/* @Authors:
	 * Student 1
	 * Joshua Posyluzny
	 * Patrick Pickard
	 * 
	 */
	
	// Third student to implement this method (Patrick Pickard)
	private double celsiusToFahrenheit(double C)
	{
		double fahrenheit;
		fahrenheit = (C * (1.8)) + 32.0;
		return fahrenheit;
	}
	
	private double fahrenheitToCelsius(double F)
	{
		double celsius = 0;
		double fahrenheit = F;
		celsius = ((fahrenheit - 32.0)*(5.0/9.0));
		return celsius;
	}
	
	public static void main(String[] args) {
		
		Converter conv = new Converter();
		
		double fahr = 250;
		double cels = 180;
		double fToC = conv.fahrenheitToCelsius(fahr);
		double cToF = conv.celsiusToFahrenheit(cels);
		System.out.println(fToC);
		System.out.println(cToF);
	}

}
