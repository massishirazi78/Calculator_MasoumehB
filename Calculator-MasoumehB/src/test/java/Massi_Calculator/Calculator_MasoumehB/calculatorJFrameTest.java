package Massi_Calculator.Calculator_MasoumehB;

import static org.junit.Assert.*;
import java.util.Random;
import java.util.logging.Logger;


import org.junit.Test;

public class calculatorJFrameTest {
	
	
	CalculatorJFrame CJF = new CalculatorJFrame();
	Random rnum=new Random();
	public static final Logger LOG = Logger.getLogger(CalculatorJFrame.class.getName());

	int number=0;
	String oracleSt;

	@Test
	public void testSkrivtal() {
	
		
		for (int i = 0; i <2; i++) {
			
					
			number= rnum.nextInt(10);
		    oracleSt= ""+number;
			CJF.skrivtal(number);
			//String S= CJF.txtDisplay2.getText();
			//double Nr = Double.parseDouble(S);
			
		
			LOG.info("Testning method Skrivtal whit Number  " + number);
        	assertEquals(CJF.txtDisplay2.getText(), oracleSt,number);

		}
	}

}
