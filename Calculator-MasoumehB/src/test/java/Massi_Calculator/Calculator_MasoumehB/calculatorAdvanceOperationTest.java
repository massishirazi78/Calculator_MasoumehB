package Massi_Calculator.Calculator_MasoumehB;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class calculatorAdvanceOperationTest {
  
	CalculatorAdvancedOperations ca=new CalculatorAdvancedOperations();
	Random random=new Random();
	public static final Logger LOG = Logger.getLogger(CalculatorBasicOperations.class.getName());

	double number=0;
	double oracle=0;
	int i=0;
	
	/**
	 * test by positive number
	 * 
	 */
	
	@Test
	public void testSinP() {

		for (i = 0; i < 10; i++) {
			number = random.nextDouble() * 10;
			

			oracle = Math.sin(number);

			LOG.info("Testning method sin whit " + number );
			assertEquals(ca.sin(number), oracle, 0);

		}

	}
	/**
	 * test by Negative  number
	 * 
	 */
	
	@Test
	public void testSinN() {

		for (i = 0; i < 10; i++) {
			number = random.nextDouble() * -10;
			

			oracle = Math.sin(number);

			LOG.info("Testning method sin whit " + number );
			assertEquals(ca.sin(number), oracle, 0);

		}

	}
	
	
	/**
	 * test by zero
	 * 
	 */
	
	@Test
	public void testSinZ() {

			number = 0;
			

			oracle = Math.sin(0);

			LOG.info("Testning method sin whit " + number );
			assertEquals(ca.sin(number), oracle, 0);

		

	}
	
	/**
	 * test by positive number
	 * 
	 */
	
	
	@Test
	public void testCosP() {

		for (i = 0; i < 10; i++) {
			number = random.nextDouble() * 10;
			

			oracle = Math.cos(number);

			LOG.info("Testning method cos whit " + number );
			assertEquals(ca.cos(number), oracle, 0);

		}

	}
	

	/**
	 * test by Negative number
	 * 
	 */
	
	
	@Test
	public void testCosN() {

		for (i = 0; i < 10; i++) {
			number = random.nextDouble() * -10;
			

			oracle = Math.cos(number);

			LOG.info("Testning method cos whit " + number );
			assertEquals(ca.cos(number), oracle, 0);

		}

	}
	

	/**
	 * test by Zero
	 * 
	 */
	
	
	@Test
	public void testCosZero() {

		for (i = 0; i < 10; i++) {
			number = 0;
			

			oracle = Math.cos(0);

			LOG.info("Testning method cos whit " + number );
			assertEquals(ca.cos(number), oracle, 0);

		}

	}
	
	
	/**
	 * by Positive number
	 * 
	 */
	
	
	
	@Test
	public void testTanP() {

		for (i = 0; i < 10; i++) {
			number = random.nextDouble() * 10;
			

			oracle = Math.tan(number);

			LOG.info("Testning method tan whit " + number );
			assertEquals(ca.tan(number), oracle, 0);

		}

	}
	

	/**
	 * by Negative number
	 * 
	 */
	
	
	
	@Test
	public void testTanN() {

		for (i = 0; i < 10; i++) {
			number = random.nextDouble() * -10;
			

			oracle = Math.tan(number);

			LOG.info("Testning method tan whit " + number );
			assertEquals(ca.tan(number), oracle, 0);

		}

	}

	/**
	 * by zero
	 * 
	 */
	
	
	
	@Test
	public void testTanZero() {

	
			number = 0;
			

			oracle = Math.tan(number);

			LOG.info("Testning method tan whit " + number );
			assertEquals(ca.tan(number), oracle, 0);

		

	}
	/**
	 * test by positive number
	 * jag testar inte med zero och negative number för att fins inte logaritmer för nummer mindre 1. jag har ett kontrol i programet för negativa number och zero.
	 * 
	 * 
	 */
	
	@Test
	public void testlogP() {

		for (i = 0; i < 10; i++) {
			number = random.nextDouble() * 10;
			

			oracle = Math.log(number);

			LOG.info("Testning method LOG whit " + number );
			assertEquals(ca.LOG(number), oracle, 0);

		}

	}
	/**
	 * test by positive number
	 */
	
	@Test
	public void testExpP() {

		for (i = 0; i < 10; i++) {
			number = random.nextDouble() * 10;
			

			oracle = Math.exp(number);

			LOG.info("Testning method exp whit " + number );
			assertEquals(ca.EXP(number), oracle, 0);

		}

	}
	
	/**
	 * test by negative number
	 */
	
	@Test
	public void testExpN() {

		for (i = 0; i < 10; i++) {
			number = random.nextDouble() * -10;
			

			oracle = Math.exp(number);

			LOG.info("Testning method exp whit " + number );
			assertEquals(ca.EXP(number), oracle, 0);

		}

	}
	/**
	 * test by Zero
	 */
	
	@Test
	public void testExpZero() {


			number = 0;
			

			oracle = Math.exp(number);

			LOG.info("Testning method exp whit " + number );
			assertEquals(ca.EXP(number), oracle, 0);

		

	}
	
	/**
	 * test by positive number
	 * jag testar inte med negative number för att fins inte sqrt för negative number jag har ett kontrol i programet för negativa number.
	 * 
	 */
	@Test
	public void testSqrtP() {

		for (i = 0; i < 10; i++) {
			number = random.nextDouble() * 10;
			

			oracle = Math.sqrt(number);

			LOG.info("Testning method sqrt whit " + number );
			assertEquals(ca.sqr(number), oracle, 0);

		}

	}
	/**
	 * test by zero
	 * 
	 */
	@Test
	public void testSqrtZero() {

		
			number = 0;
			

			oracle = Math.sqrt(number);

			LOG.info("Testning method sqrt whit " + number );
			assertEquals(ca.sqr(number), oracle, 0);

		

	}
	
	/**
	 * testa positive number
	 */
	
	@Test
	public void testEP() {

		for (i = 0; i < 10; i++) {
			number = random.nextDouble() * 10;
			

			oracle =Math.round(2.71828183*number);

			LOG.info("Testning method E whit " + number );
			assertEquals(ca.E(number), oracle, 0);

		}

	}

	/**
	 * testa Negative  number
	 */
	
	@Test
	public void testEN() {

		for (i = 0; i < 10; i++) {
			number = random.nextDouble() * -10;
			

			oracle =Math.round(2.71828183*number);

			LOG.info("Testning method E whit " + number );
			assertEquals(ca.E(number), oracle, 0);

		}

	}

	/**
	 * testa by zero
	 */
	
	@Test
	public void testEZero() {


			number = 0;
			

			oracle =Math.round(2.71828183*number);

			LOG.info("Testning method E whit " + number );
			assertEquals(ca.E(number), oracle, 0);

		}

	
	/**
	 * testa by positiva number
	 */
	
	@Test
	public void testPiP() {

		for (i = 0; i < 10; i++) {
			number = random.nextDouble() * 10;
			

			oracle = Math.round(3.14159265 *number);

			LOG.info("Testning method PI whit " + number );
			assertEquals(ca.PI(number), oracle, 0);

		}

	}
	

	/**
	 * testa by positiva number
	 */
	
	@Test
	public void testPiN() {

		for (i = 0; i < 10; i++) {
			number = random.nextDouble() * -10;
			

			oracle = Math.round(3.14159265 *number);

			LOG.info("Testning method PI whit " + number );
			assertEquals(ca.PI(number), oracle, 0);

		}

	}

	/**
	 * testa by Zero
	 */
	
	@Test
	public void testPIP() {

		
			number = 0;
			

			oracle = Math.round(3.14159265 *number);

			LOG.info("Testning method PI whit " + number );
			assertEquals(ca.PI(number), oracle, 0);

		}

	/**
	 * testa by positive number
	 * 
	 */
	
	
	@Test
	public void testxxP() {

		for (i = 0; i < 10; i++) {
			number = random.nextDouble() * 10;
			

			oracle =Math.round(number*number);

			LOG.info("Testning method X^2 whit " + number );
			assertEquals(ca.xx(number), oracle, 0);

		}

	}
	
	/**
	 * testa by Negative number
	 * 
	 */
	
	
	@Test
	public void testxxN() {

		for (i = 0; i < 10; i++) {
			number = random.nextDouble() * -10;
			

			oracle =Math.round(number*number);

			LOG.info("Testning method X^2 whit " + number );
			assertEquals(ca.xx(number), oracle, 0);

		}

	}
	/**
	 * testa by zero
	 * 
	 */
	
	
	@Test
	public void testxxZero() {

		
			number = 0;
			

			oracle =number*number;

			LOG.info("Testning method X^2 whit " + number );
			assertEquals(ca.xx(number), oracle, 0);

		}

	
	/**
	 * test by positive number
	 * 
	 */
	
	@Test
	public void testModulusP() {
		double	FirstNumber=0;
		double SecondNumber =0;
		
		for (i = 0; i < 10; i++) {
			FirstNumber = random.nextDouble()*10;
		    SecondNumber = random.nextDouble()*10;

			oracle = FirstNumber % SecondNumber;
           
			LOG.info("Testning method modulus whit FirstNumber" + FirstNumber + " SecondNumber" + SecondNumber);
			assertEquals(ca.modulus(FirstNumber, SecondNumber),oracle,0);

		}

	}
	
	/**
	 * test by Negative number
	 * 
	 */
	
	@Test
	public void testModulusN() {
		double	FirstNumber=0;
		double SecondNumber =0;
		
		for (i = 0; i < 10; i++) {
			FirstNumber = random.nextDouble()*-10;
		    SecondNumber = random.nextDouble()*-10;

			oracle = FirstNumber % SecondNumber;
          
			LOG.info("Testning method modulus whit FirstNumber" + FirstNumber + " SecondNumber" + SecondNumber);
			assertEquals(ca.modulus(FirstNumber, SecondNumber),oracle,0);

		}

	}
	
	/**
	 * test by zero
	 * 
	 * bra FirstNumber kav vara zero .jag har ett kontrol i programet som kan inte SecondNumber vara zero .
	 * 
	 * 
	 */
	
	@Test
	public void testModulusZeroo() {
		
		
		
		double	FirstNumber = 0;
		double    SecondNumber = random.nextDouble()*10;

			oracle = FirstNumber % SecondNumber;
          
			LOG.info("Testning method modulus whit FirstNumber" + FirstNumber + " SecondNumber" + SecondNumber);
			assertEquals(ca.modulus(FirstNumber, SecondNumber),oracle,0);

		

	}
	




}
	
	
	
	
	


