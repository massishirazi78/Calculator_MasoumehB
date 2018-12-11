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

	
	@Test
	public void testaddition() {

		for (i = 0; i < 10; i++) {
			FirstNumber = random.nextDouble()*10;
			SecondNumber = random.nextDouble()*10;

			oracle =Math.round(FirstNumber + SecondNumber);
           
			LOG.info("Testning method addition whit FirstNumber" + FirstNumber + " SecondNumber" + SecondNumber);
			assertEquals(cb.addition(FirstNumber, SecondNumber),oracle,0);

		}

	}

	@Test
	public void testsubtraction() {

		for (i = 0; i < 10; i++) {
			FirstNumber = random.nextDouble() * 10;
			SecondNumber = random.nextDouble() * 10;

			oracle = Math.round(FirstNumber - SecondNumber);

			LOG.info("Testning method subtraction whit FirstNumber" + FirstNumber + " SecondNumber" + SecondNumber);
			assertEquals(cb.subtraction(FirstNumber, SecondNumber), oracle, 0);

		}

	}

	@Test
	public void testmultiplikation() {

		for (i = 0; i < 10; i++) {
			FirstNumber = random.nextDouble() * 10;
			SecondNumber = random.nextDouble() * 10;

			oracle = Math.round(FirstNumber * SecondNumber);

			LOG.info("Testning method multiplikation whit FirstNumber" + FirstNumber + " SecondNumber" + SecondNumber);
			assertEquals(cb.multiplikation(FirstNumber, SecondNumber), oracle, 0);

		}

	}

	@Test
	public void testdividera() {

		for (i = 0; i < 10; i++) {
			FirstNumber = random.nextDouble() * 10;
			SecondNumber = random.nextDouble() * 10;

			oracle = Math.round(FirstNumber / SecondNumber);

			LOG.info("Testning method dividera whit FirstNumber" + FirstNumber + " SecondNumber" + SecondNumber);
			assertEquals(cb.dividera(FirstNumber, SecondNumber), oracle, 0);

		}

	}

}
