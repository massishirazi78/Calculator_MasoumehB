package Massi_Calculator.Calculator_MasoumehB;

/**
 * I den klass ,det finns 4 Basic Operations methoder plus,minus,multiply och
 * division.
 * och implementera interface class CalculatorBasicOperationsInterface.
 * 
 */

public class CalculatorBasicOperations implements CalculatorBasicOperationsInterface {

	/**
	 * Den method addition 2 double nummer och sedan return ett double värde .
	 * 
	 * @param FirstNumber
	 *            double
	 * @param SecondNmber
	 *            double
	 * @param return
	 *            double värde av FirstNumber + SecondNmber
	 */

	public double addition(double FirstNumber, double SecondNmber) {
		return Math.round(FirstNumber + SecondNmber);
	}

	/**
	 * Den method subtraction 2 double nummer och sedan return ett double värde.
	 * 
	 * 
	 * @param FirstNumber
	 *            double
	 * @param SecondNmber
	 *            double
	 * @param return
	 *            double värde av FirstNumber - SecondNmber
	 */
	public double subtraction(double FirstNumber, double SecondNmber) {
		return Math.round(FirstNumber - SecondNmber);
	}

	/**
	 * Den method multiplikation 2 double nummer och sedan return ett double
	 * värde .
	 * 
	 * @param FirstNumber
	 *            double
	 * @param SecondNmber
	 *            double
	 * @param return
	 *            double värde av FirstNumber * SecondNmber
	 */

	public double multiplikation(double FirstNumber, double SecondNmber) {
		return Math.round(FirstNumber * SecondNmber);
	}

	/**
	 * Den method dividera 2 double nummer och sedan return ett double värde .
	 * 
	 * @param FirstNumber
	 *            double
	 * @param SecondNmber
	 *            double
	 * @param return
	 *            double värde av FirstNumber / SecondNmber
	 */

	public double dividera(double FirstNumber, double SecondNmber) {
		return Math.round(FirstNumber / SecondNmber);
	}

}
/**
 * slut av CalculatorBasicOperations class
 * 
 */
