package Massi_Calculator.Calculator_MasoumehB;

/**
 * I den interface class, det fins 10 Advanced Operations methods .
 * sin,cos,tan,modulu,log ,sqrt,Pi,e,exp ,x^2.
 * 
 * 
 */

public interface CalculatorAdvancedOperationsInterface {

	/**
	 * Det är ett interface method sin som ta ett double parameter .
	 * föratt räknar sin (FirstNumber)
	 * 
	 * @param FirstNumber
	 *            double
	 * 
	 */

	public double sin(double FirstNumber);

	/**
	 * Det är ett double interface method cos som ta ett double parameter .
	 * för att räknar cos (FirstNumber)
	 * 
	 * @param FirstNumber
	 *            double
	 * 
	 */

	public double cos(double FirstNumber);

	/**
	 * Det är ett double interface method tan som ta ett double parameter .
	 * för att räknar tan(FirstNumber)
	 * 
	 * @param FirstNumber
	 *            double
	 * 
	 */

	public double tan(double FirstNumber);

	/**
	 * Det är ett double interface method x^2 som ta ett double parameter .
	 * för att räknar FirstNumber*FirstNumber
	 * 
	 * @param FirstNumber
	 *            double
	 * 
	 */

	public double xx(double FirstNumber);

	/**
	 * Det är ett double interface method sqrt som ta ett double parameter .
	 * för att räknar sqrt(FirstNumber)
	 * 
	 * @param FirstNumber
	 *            double
	 * 
	 */

	public double sqr(double FirstNumber);

	/**
	 * Det är ett double interface method PI som ta ett double parameter .
	 * för att räknar PI*FirstNumber
	 * 
	 * @param FirstNumber
	 *            double
	 * 
	 */

	public double PI(double FirstNumber);

	/**
	 * Det är ett double interface method e som ta ett double parameter .
	 * för att räknar e* FirstNumber
	 * 
	 * @param FirstNumber
	 *            double
	 * 
	 */

	public double E(double FirstNumber);

	/**
	 * Det är ett double interface method exp som ta ett double parameter .
	 * för att räknar exp(FirstNumber)
	 * 
	 * @param FirstNumber
	 *            double
	 * 
	 */

	public double EXP(double FirstNumber);

	/**
	 * Det är ett double interface method logaritm som ta ett double parameter .
	 * för att räknar log(FirstNumber)
	 * 
	 * @param FirstNumber
	 *            double
	 * 
	 */

	public double LOG(double FirstNumber);

	/**
	 * Det är ett double interface method modulus som ta 2 double parameter .
	 *
	 * för att räknar FirstNumber % SecondNumber
	 * 
	 * @param FirstNumber
	 *            double
	 * 
	 * @param SecondNumber
	 *            double
	 * 
	 * 
	 */

	public double modulus(double FirstNumber, double SecondNumber);
}
/**
 * slut av CalculatorAdvancedOperationsInterface class
 */
