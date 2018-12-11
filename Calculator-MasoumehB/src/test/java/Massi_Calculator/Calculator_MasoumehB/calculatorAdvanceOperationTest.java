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
	
	@Test
	public void testsin() {

		for (i = 0; i < 10; i++) {
			number = random.nextDouble() * 10;
			

			oracle = Math.sin(number);

			LOG.info("Testning method sin whit " + number );
			assertEquals(ca.sin(number), oracle, 0);

		}

	}
	
	@Test
	public void testcos() {

		for (i = 0; i < 10; i++) {
			number = random.nextDouble() * 10;
			

			oracle = Math.cos(number);

			LOG.info("Testning method cos whit " + number );
			assertEquals(ca.cos(number), oracle, 0);

		}

	}
	
	@Test
	public void testtan() {

		for (i = 0; i < 10; i++) {
			number = random.nextDouble() * 10;
			

			oracle = Math.tan(number);

			LOG.info("Testning method tan whit " + number );
			assertEquals(ca.tan(number), oracle, 0);

		}

	}
	@Test
	public void testlog() {

		for (i = 0; i < 10; i++) {
			number = random.nextDouble() * 10;
			

			oracle = Math.log(number);

			LOG.info("Testning method LOG whit " + number );
			assertEquals(ca.LOG(number), oracle, 0);

		}

	}
	
	@Test
	public void testExp() {

		for (i = 0; i < 10; i++) {
			number = random.nextDouble() * 10;
			

			oracle = Math.exp(number);

			LOG.info("Testning method exp whit " + number );
			assertEquals(ca.EXP(number), oracle, 0);

		}

	}
	
	@Test
	public void testsqrt() {

		for (i = 0; i < 10; i++) {
			number = random.nextDouble() * 10;
			

			oracle = Math.sqrt(number);

			LOG.info("Testning method sqrt whit " + number );
			assertEquals(ca.sqr(number), oracle, 0);

		}

	}
	
	@Test
	public void testE() {

		for (i = 0; i < 10; i++) {
			number = random.nextDouble() * 10;
			

			oracle =Math.round(2.71828183*number);

			LOG.info("Testning method E whit " + number );
			assertEquals(ca.E(number), oracle, 0);

		}

	}
	@Test
	public void testPI() {

		for (i = 0; i < 10; i++) {
			number = random.nextDouble() * 10;
			

			oracle = Math.round(3.14159265 *number);

			LOG.info("Testning method PI whit " + number );
			assertEquals(ca.PI(number), oracle, 0);

		}

	}
	@Test
	public void testxx() {

		for (i = 0; i < 10; i++) {
			number = random.nextDouble() * 10;
			

			oracle =Math.round(number*number);

			LOG.info("Testning method X^2 whit " + number );
			assertEquals(ca.xx(number), oracle, 0);

		}

	}
	
	@Test
	public void testmodulus() {
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
	
	
	

}
