
public class Converter {

	/*
	 * @Authors: Mike Lasby Joshua Posyluzny Student 3
	 * 
	 */

	private double celsiusToFahrenheit(double C) {
		// TODO: THe third student will implement this method
		return 0;
	}

	private double fahrenheitToCelsius(double F) {
		double celsius = 0;
		double fahrenheit = F;
		celsius = ((fahrenheit - 32) * (5.0 / 9.0));
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
