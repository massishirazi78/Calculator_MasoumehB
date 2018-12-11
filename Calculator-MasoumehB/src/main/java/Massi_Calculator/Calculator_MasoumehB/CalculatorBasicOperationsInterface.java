package Massi_Calculator.Calculator_MasoumehB;

/**
 * Det är ett interface klass som har 4 Basic Operations method.
 * plus,minus,multiply och division.
 * 
 * 
 */

public interface CalculatorBasicOperationsInterface {

	/**
	 * Det är interface addition method med 2 double parameter FirstNumber och
	 * SecondNmber .
	 * 
	 * @param FirstNumber
	 *            double
	 * @param SecondNmber
	 *            double
	 */

	public double addition(double FirstNumber, double SecondNmber);

	/**
	 * Det är interface subtraction method med 2 double parameter FirstNumber
	 * och SecondNmber .
	 * 
	 * @param FirstNumber
	 *            double
	 * @param SecondNmber
	 *            double
	 */
	public double subtraction(double FirstNumber, double SecondNmber);

	/**
	 * Det är interface multiplikation method med 2 double parameter FirstNumber
	 * och SecondNmber .
	 * 
	 * @param FirstNumber
	 *            double
	 * @param SecondNmber
	 *            double
	 */
	public double multiplikation(double FirstNumber, double SecondNmber);

	/**
	 * Det är interface dividera method med 2 double parameter FirstNumber och
	 * SecondNmber .
	 * 
	 * @param FirstNumber
	 *            double
	 * @param SecondNmber
	 *            double
	 */
	public double dividera(double FirstNumber, double SecondNmber);

}
/**
 * slut av CalculatorBasicOperationsInterface class
 * 
 */
