package Massi_Calculator.Calculator_MasoumehB;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class calculatorBasicOperationTest {

	CalculatorBasicOperations cb = new CalculatorBasicOperations();
	Random random = new Random();
	public static final Logger LOG = Logger.getLogger(CalculatorBasicOperations.class.getName());

	double FirstNumber = 0;
	double SecondNumber = 0;
	double oracle = 0;
	int i = 0;
/**
 * 	 test by negative number
 * 
 */
	 
	
	@Test
	public void testadditionPosetiv() {

		for (i = 0; i < 10; i++) {
			FirstNumber = random.nextDouble()*10;
			SecondNumber = random.nextDouble()*10;

			oracle =Math.round(FirstNumber + SecondNumber);
           
			LOG.info("Testning method addition whit FirstNumber" + FirstNumber + " SecondNumber" + SecondNumber);
			assertEquals(cb.addition(FirstNumber, SecondNumber),oracle,0);

		}

	}
	/**
	 * test by negative number
	 */
	
	@Test
	public void testadditionNegativ() {

		for (i = 0; i < 10; i++) {
			FirstNumber = random.nextDouble()*-10;
			SecondNumber = random.nextDouble()*-10;

			oracle =Math.round(FirstNumber + SecondNumber);
           
			LOG.info("Testning method addition whit FirstNumber" + FirstNumber + " SecondNumber" + SecondNumber);
			assertEquals(cb.addition(FirstNumber, SecondNumber),oracle,0);

		}

	}
	
	/**
	 * test by zero
	 * 
	 */
	@Test
	public void testadditionzero() {

		
			FirstNumber = 0;
			SecondNumber = 0;

			oracle =Math.round(FirstNumber + SecondNumber);
           
			LOG.info("Testning method addition whit FirstNumber" + FirstNumber + " SecondNumber" + SecondNumber);
			assertEquals(cb.addition(FirstNumber, SecondNumber),oracle,0);

		

	}
	
	/**
	 * 
	 * test by positive number
	 * 
	 */

	@Test
	public void testsubtractionPos() {

		for (i = 0; i < 10; i++) {
			FirstNumber = random.nextDouble() * 10;
			SecondNumber = random.nextDouble() * 10;

			oracle = Math.round(FirstNumber - SecondNumber);

			LOG.info("Testning method subtraction whit FirstNumber" + FirstNumber + " SecondNumber" + SecondNumber);
			assertEquals(cb.subtraction(FirstNumber, SecondNumber), oracle, 0);

		}

	}
	
/**
 * test by negative number
 * 
 */
	@Test
	public void testsubtractionNeg() {

		for (i = 0; i < 10; i++) {
			FirstNumber = random.nextDouble() * -10;
			SecondNumber = random.nextDouble() * -10;

			oracle = Math.round(FirstNumber - SecondNumber);

			LOG.info("Testning method subtraction whit FirstNumber" + FirstNumber + " SecondNumber" + SecondNumber);
			assertEquals(cb.subtraction(FirstNumber, SecondNumber), oracle, 0);

		}

	}
	/**
	 * test by zero
	 * 
	 */
	
	@Test
	public void testsubtraction() {

		for (i = 0; i < 10; i++) {
			FirstNumber = 0;
			SecondNumber = 0;

			oracle = Math.round(FirstNumber - SecondNumber);

			LOG.info("Testning method subtraction whit FirstNumber" + FirstNumber + " SecondNumber" + SecondNumber);
			assertEquals(cb.subtraction(FirstNumber, SecondNumber), oracle, 0);

		}

	}
	
	/**
	 * test by positive number
	 * 
	 */

	@Test
	public void testmultiplikationPos() {

		for (i = 0; i < 10; i++) {
			FirstNumber = random.nextDouble() * 10;
			SecondNumber = random.nextDouble() * 10;

			oracle = Math.round(FirstNumber * SecondNumber);

			LOG.info("Testning method multiplikation whit FirstNumber" + FirstNumber + " SecondNumber" + SecondNumber);
			assertEquals(cb.multiplikation(FirstNumber, SecondNumber), oracle, 0);

		}

	}
	
	
	/**
	 * test by negative number
	 * 
	 */
	@Test
	public void testmultiplikationNeg() {

		for (i = 0; i < 10; i++) {
			FirstNumber = random.nextDouble() * -10;
			SecondNumber = random.nextDouble() * -10;

			oracle = Math.round(FirstNumber * SecondNumber);

			LOG.info("Testning method multiplikation whit FirstNumber" + FirstNumber + " SecondNumber" + SecondNumber);
			assertEquals(cb.multiplikation(FirstNumber, SecondNumber), oracle, 0);

		}

	}
	/**
	 * test by zero
	 * 
	 */
	@Test
	public void testmultiplikation() {

		for (i = 0; i < 10; i++) {
			FirstNumber = 0;
			SecondNumber = random.nextDouble() * 10;

			oracle = Math.round(FirstNumber * SecondNumber);

			LOG.info("Testning method multiplikation whit FirstNumber" + FirstNumber + " SecondNumber" + SecondNumber);
			assertEquals(cb.multiplikation(FirstNumber, SecondNumber), oracle, 0);

		}

	}

	/**
	 * test by positive number
	 * 
	 * 
	 */
		

	@Test
	public void testdivideraPos() {

		for (i = 0; i < 10; i++) {
			FirstNumber = random.nextDouble() * 10;
			SecondNumber = random.nextDouble() * 10;

			oracle = Math.round(FirstNumber / SecondNumber);

			LOG.info("Testning method dividera whit FirstNumber" + FirstNumber + " SecondNumber" + SecondNumber);
			assertEquals(cb.dividera(FirstNumber, SecondNumber), oracle, 0);

		}
	}
		
		/**
		 *  test by negative number.
		 * 
		 * 
		 */

		@Test
		public void testdividera() {

			for (i = 0; i < 10; i++) {
				FirstNumber = random.nextDouble() * -10;
				SecondNumber = random.nextDouble() * -10;

				oracle = Math.round(FirstNumber / SecondNumber);

				LOG.info("Testning method dividera whit FirstNumber" + FirstNumber + " SecondNumber" + SecondNumber);
				assertEquals(cb.dividera(FirstNumber, SecondNumber), oracle, 0);

			}
			
		
	}
		/**
		 * test by zero
		 */
		

		@Test
		public void testdivideraZero() {

			
				FirstNumber = 0;
				SecondNumber = random.nextDouble() * 10;

				oracle = Math.round(FirstNumber / SecondNumber);

				LOG.info("Testning method dividera whit FirstNumber" + FirstNumber + " SecondNumber" + SecondNumber);
				assertEquals(cb.dividera(FirstNumber, SecondNumber), oracle, 0);

		}		

}
