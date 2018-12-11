package Massi_Calculator.Calculator_MasoumehB;

import java.awt.EventQueue;

public class CalculatorMain {
	
/**
 * The main method of this Calculator application
 * 
 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					CalculatorJFrame frame = new CalculatorJFrame();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}

