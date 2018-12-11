package Massi_Calculator.Calculator_MasoumehB;

/**
 * I den class, det fins 10 Advanced Operations methods . sin,cos,tan,modulu,log
 * ,sqrt,Pi,e,exp ,x^2.
 * 
 * och implementera interface class CalculatorAdvancedOperationsInterface.
 * 
 * 
 */

public class CalculatorAdvancedOperations implements CalculatorAdvancedOperationsInterface {

	/**
	 * Den method ta ett double parameter och räknar sine av parameter och
	 * return ett double värde .
	 * 
	 * @param FirstNumber
	 *            double
	 * 
	 *            return double värde av resultat from sin(FirstNumber)
	 */

	public double sin(double FirstNumber) {

		return Math.sin(FirstNumber);
	}

	/**
	 * Den method ta ett double parameter och räknar cosine av parameter och
	 * return ett double värde .
	 * 
	 * 
	 * @param FirstNumber
	 *            double
	 * 
	 *            return double värde av resultat from cos(FirstNumber)
	 */

	public double cos(double FirstNumber) {

		return Math.cos(FirstNumber);
	}

	/**
	 * Den method ta ett double parameter och räknar tangent av parameter och
	 * return ett double värde .
	 * 
	 * @param FirstNumber
	 *            double
	 * 
	 *            return double värde av resultat from tan(FirstNumber)
	 */

	public double tan(double FirstNumber) {

		return Math.tan(FirstNumber);
	}

	/**
	 * Den method ta ett double parameter och räknar x^2 och return ett double
	 * värde .
	 * 
	 * @param FirstNumber
	 *            double
	 * 
	 *            return double värde av resultat from (FirstNumber*FirstNumber) eller pow(FirstNumber,2).
	 */

	public double xx(double FirstNumber) {

		return Math.round(Math.pow(FirstNumber, 2));
	}

	/**
	 * Den method ta ett double parameter och räknar sqrt av parameter och
	 * return ett double värde .
	 * 
	 * @param FirstNumber
	 *            double
	 * 
	 *            return double värde av resultat from sqrt(FirstNumber)
	 */

	public double sqr(double FirstNumber) {

		return Math.sqrt(FirstNumber);
	}

	/**
	 * Den method ta ett double parameter och räknar PI gånger av parameter och
	 * return ett double värde .
	 * 
	 * @param FirstNumber
	 *            double
	 * 
	 * @param return
	 *            double värde av resultat from 3.14444*FirstNumber.
	 */

	public double PI(double FirstNumber) {

		return Math.round((Math.PI) * FirstNumber);
	}

	/**
	 * Den method ta ett double parameter och räknar e gånger parameter och
	 * return ett double värde .
	 * 
	 * @param FirstNumber
	 *            double
	 * 
	 *            return double värde av resultat from e*FirstNumber
	 */

	public double E(double FirstNumber) {

		return Math.round(Math.E * FirstNumber);
	}

	/**
	 * Den method ta ett double parameter och räknar exp av parameter och return
	 * ett double värde .
	 * 
	 * @param FirstNumber
	 *            double
	 * 
	 * @param return
	 *            double värde av resultat from exp(FirstNumber)
	 */

	public double EXP(double FirstNumber) {
		return Math.exp(FirstNumber);

	}

	/**
	 * Den method ta ett double parameter och räknar logarithm av parameter och
	 * return ett double värde .
	 * 
	 * @param FirstNumber
	 *            double.
	 * 
	 *            return double värde av resultat from log(FirstNumber)
	 */

	public double LOG(double FirstNumber) {

		return Math.log(FirstNumber);
	}

	/**
	 * Den method ta 2 double parameter och räknar modulus av 2 parameter och
	 * sedan return ett double värde . result double värde av FirstNumber %
	 * SecondNumber.
	 * 
	 * @param FirstNumber
	 *            double
	 * 
	 * @param SecondNumber
	 *            double
	 * 
	 *            return double värde av resultat from FirstNumber %
	 *            SecondNumber.
	 */

	public double modulus(double FirstNumber, double SecondNumber) {

		return FirstNumber % SecondNumber;
	}

}
/**
 * slut av CalculatorAdvancedOperations class
 */
