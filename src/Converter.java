
public class Converter {

	/*
	 * @Authors: Mike Lasby, Joshua Posyluzny, Patrick Pickard
	 */
	
	// COMMENT - Patrick Pickard: This is the development branch
	
	private double celsiusToFahrenheit(double C)
	{
		double fahrenheit;
		fahrenheit = (C * (1.8)) + 32.0;
		return fahrenheit;
	}

	private double fahrenheitToCelsius(double F) {
		double celsius = 0;
		double fahrenheit = F;
		celsius = ((fahrenheit - 32.0)*(5.0/9.0));
		return celsius;
	}

	public static void main(String[] args) {

		Converter conv = new Converter();

		double fahr = 250;
		double fToC = conv.fahrenheitToCelsius(fahr);
		System.out.printf("%.2f degrees F is %.2f degrees C\n", fahr, fToC);
		double cels = 180;
		double cToF = conv.celsiusToFahrenheit(cels);
		System.out.printf("%.2f degrees C is %.2f degrees F\n", cels, cToF);
	}

}
