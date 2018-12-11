package Massi_Calculator.Calculator_MasoumehB;

/**
 * Date 2018-12-08
 * Det är en Claculator med 14 Opretion.
 * @author Massi
 *@version 1.0
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Color;
import java.awt.Component;
import java.awt.SystemColor;

/**
 * 
 * 
 * det är class CalculatorJFrame som arv från JFrame .
 *
 */

public class CalculatorJFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final String Red = null;

	/**
	 * Den är en textfield för att vissa function.
	 */
	protected JTextField txtDisplay1;

	/**
	 * Den är en textfield för att vissa resultat av function.
	 */
	protected JTextField txtDisplay2;

	/**
	 * det är integer operation som vissar att vilken Basic Opreation påverkar .
	 * Operation 1 är +, Operation 2 är -, Operation 3 är *, Operation 4 är /,
	 * 
	 */

	public int Operation;
	/**
	* AdvOperation 1 är exp, AdvOperation 2 är sin,
	 * AdvOperation 3 är cos, AdvOperation 4 är tan, AdvOperation 5 är x^2,
	 * AdvOperation 6 är log, AdvOperation 7 är sqrt, AdvOperation 8 är pi,
	 * AdvOperation 9 är e,
	 */
	
	public int ad;
	public int AdvOperation;

	/**
	 * Det är String för txtDisplay.
	 */
	private String st;

	/**
	 * ett publice double value för första nummer.
	 */
	public double FirstNumber = 0;

	/**
	 * ett publice double value för andra nummer.
	 */
	public double SecondNumber = 0;

	/**
	 * en boolean variable.
	 */
	private boolean b = false;
	


	/**
	 * Skapar frame.
	 * 
	 * 
	 */
	public CalculatorJFrame() {

		setResizable(false);
		setTitle("CALCULATOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 473);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		/**
		 * Skapar Button 0.
		 */

		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn0.setBounds(196, 350, 60, 45);
		btn0.addActionListener(new ActionListener() {
			/**
			 * Den metod anropa metod skanntal från Class
			 * CalculatorActionListener.
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent e) {
				skrivtal(0);
			}
		});

		/**
		 * Skapar Button 1.
		 */
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn1.setBounds(196, 286, 60, 45);
		btn1.addActionListener(new ActionListener() {
			/**
			 * Den metod anropa metod skanntal från Class
			 * CalculatorActionListener.
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent e) {
				skrivtal(1);
			}
		});

		/**
		 * Skapar Button 2.
		 */
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn2.setBounds(273, 286, 60, 45);
		btn2.addActionListener(new ActionListener() {
			/**
			 * Den metod anropa metod skanntal från Class
			 * CalculatorActionListener.
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent e) {
				skrivtal(2);

			}
		});

		/**
		 * Skapar Button 3.
		 */
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn3.setBounds(347, 285, 60, 45);
		btn3.addActionListener(new ActionListener() {
			/**
			 * Den metod anropa metod skanntal från Class
			 * CalculatorActionListener.
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent e) {
				skrivtal(3);

			}
		});

		/**
		 * Skapar Button 4.
		 */
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn4.setBounds(196, 225, 60, 45);
		btn4.addActionListener(new ActionListener() {
			/**
			 * Den metod anropa metod skanntal från Class
			 * CalculatorActionListener.
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent e) {

				skrivtal(4);
			}

		});

		/**
		 * Skapar Button 5.
		 */
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn5.setBounds(273, 225, 60, 45);
		btn5.addActionListener(new ActionListener() {
			/**
			 * Den metod anropa metod skanntal från Class
			 * CalculatorActionListener.
			 * 
			 */
			public void actionPerformed(ActionEvent e) {

				skrivtal(5);
			}
		});

		/**
		 * Skapar Button 6.
		 */
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn6.setBounds(347, 224, 60, 45);
		btn6.addActionListener(new ActionListener() {
			/**
			 * Den metod anropa metod skanntal från Class
			 * CalculatorActionListener.
			 * 
			 */
			public void actionPerformed(ActionEvent e) {
				skrivtal(6);
			}

		});

		/**
		 * Skapar Button 7.
		 */
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn7.setBounds(196, 168, 60, 45);
		btn7.addActionListener(new ActionListener() {
			/**
			 * Den metod anropa metod skanntal från Class
			 * CalculatorActionListener.
			 * 
			 */
			public void actionPerformed(ActionEvent e) {
				skrivtal(7);
			}
		});

		/**
		 * Skapar Button 8.
		 */
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn8.setBounds(273, 168, 60, 45);
		btn8.addActionListener(new ActionListener() {
			/**
			 * Den metod anropa metod skanntal från Class
			 * CalculatorActionListener.
			 * 
			 * 
			 */

			public void actionPerformed(ActionEvent e) {
				skrivtal(8);
			}

		});

		/**
		 * Skapar Button 9.
		 */
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn9.setBounds(347, 168, 60, 45);
		btn9.addActionListener(new ActionListener() {
			/**
			 * Den metod anropa metod skanntal från Class
			 * CalculatorActionListener.
			 * 
			 * 
			 */

			public void actionPerformed(ActionEvent e) {
				skrivtal(9);
			}
		});

		/**
		 * Skapar Button Equal =
		 */
		JButton btnEquals = new JButton("=");
		btnEquals.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEquals.setBounds(347, 349, 60, 45);
		btnEquals.addActionListener(new ActionListener() {
			/**
			 * Den method anropar method equal från class
			 * CalculatorActionListener.
			 */

			public void actionPerformed(ActionEvent e) {

			
				
				equal(ad);
			}

		});

		/**
		 * Skapar Button Plus +
		 */

		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(422, 167, 60, 45);
		btnPlus.addActionListener(new ActionListener() {
			/**
			 * 
			 * Den method skapar ett object och sedan anropar method
			 * BasicOperation från class CalculatorActionListener
			 * 
			 * 
			 * 
			 */

			public void actionPerformed(ActionEvent e) {

				BasicOperation('+');

			}

		});

		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 20));

		/**
		 * Skapar Button Minus -
		 */
		JButton btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMinus.setBounds(422, 224, 60, 45);
		btnMinus.addActionListener(new ActionListener() {
			/**
			 * 
			 * Den method anropar method BasicOperation från class
			 * CalculatorActionListener
			 * 
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent e) {

				BasicOperation('-');
			}

		});

		/**
		 * Skapar Button Multiply *
		 */

		JButton btnMultiply = new JButton("*");
		btnMultiply.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMultiply.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMultiply.setBounds(422, 283, 60, 45);
		btnMultiply.addActionListener(new ActionListener() {
			/**
			 * 
			 * Den method anropar method BasicOperation från class
			 * CalculatorActionListener
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent e) {

				BasicOperation('*');

			}
		});

		/**
		 * Skapar Button Division /
		 */
		JButton btnDivision = new JButton("\uF0B8");
		btnDivision.setBounds(422, 347, 60, 45);
		btnDivision.addActionListener(new ActionListener() {

			/**
			 * 
			 * 
			 * Den method anropar method BasicOperation från class
			 * CalculatorActionListener
			 * 
			 */
			public void actionPerformed(ActionEvent e) {

				BasicOperation('/');

			}
		});
		btnDivision.setFont(new Font("Symbol", Font.BOLD, 21));

		/**
		 * Skapar Button Cotan.
		 */
		JButton btnxx = new JButton("X^2");
		btnxx.setHorizontalTextPosition(SwingConstants.CENTER);
		btnxx.setBounds(107, 350, 76, 42);
		btnxx.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnxx.addActionListener(new ActionListener() {

			/**
			 * 
			 * Den method anropar method AdvancedOperation
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent arg0) {

				AdvancedOperation(5);

			}
		});

		/**
		 * Skapar Button Sin
		 */
		JButton btnSin = new JButton("sin");
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSin.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSin.setBounds(107, 168, 76, 42);
		btnSin.addActionListener(new ActionListener() {

			/**
			 * 
			 * Den method anropar method AdvancedOperation
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent e) {

				AdvancedOperation(2);

			}
		});

		/**
		 * Skapar Button exp
		 */
		JButton btnExp = new JButton("exp");
		btnExp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExp.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		btnExp.setBounds(107, 115, 76, 42);
		btnExp.addActionListener(new ActionListener() {
			/**
			 * Den method anropar method AdvancedOperation
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent arg0) {

				AdvancedOperation(1);

			}
		});

		/**
		 * Skapar Button Backspace
		 */
		JButton btnDel = new JButton("<");
		btnDel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDel.addActionListener(new ActionListener() {
			/*
			 * Den method anropar method Backspace från class
			 * calculatorActionListener.
			 * 
			 * 
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent arg0) {

				Backspace();
			}
		});
		btnDel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		btnDel.setBounds(273, 114, 60, 45);

		/**
		 * Skapar Button PI.
		 */

		JButton btnPi = new JButton("\u213C");
		btnPi.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPi.setHorizontalTextPosition(SwingConstants.CENTER);
		btnPi.setBounds(22, 286, 70, 42);
		btnPi.addActionListener(new ActionListener() {
			/**
			 * 
			 * Den method anropar method AdvancedOperation och skicka kode 8 som
			 * är advance operation PI
			 */

			public void actionPerformed(ActionEvent e) {
				AdvancedOperation(8);

			}

		});

		/**
		 * Skapar Button Sqrt
		 */
		JButton btnSqr = new JButton("\u221A");
		btnSqr.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSqr.setBounds(22, 225, 70, 42);
		btnSqr.addActionListener(new ActionListener() {
			/**
			 * 
			 * Den method anropar method AdvancedOperation och skicka kode 7 som
			 * är advance operation sqrt
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent e) {

				AdvancedOperation(7);

			}

		});

		btnSqr.setFont(new Font("Tahoma", Font.PLAIN, 20));

		/**
		 * Skapar Button Cos
		 */
		JButton btnCos = new JButton("cos");
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCos.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCos.setBounds(107, 225, 76, 42);
		btnCos.addActionListener(new ActionListener() {
			/**
			 * 
			 * Den method anropar method AdvancedOperation och skicka kode 3 som
			 * är advance operation cos
			 * 
			 */
			public void actionPerformed(ActionEvent e) {

				AdvancedOperation(3);

			}

		});

		/**
		 * Skapar Button Modulus %
		 */
		JButton btnModulus = new JButton("%");
		btnModulus.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		btnModulus.setBounds(22, 115, 70, 42);
		btnModulus.addActionListener(new ActionListener() {

			/**
			 * 
			 * Den method anropar method BasicOperation från class
			 * CalculatorActionListener
			 * 
			 */
			public void actionPerformed(ActionEvent e) {

				BasicOperation('%');

			}
		});
		btnModulus.setFont(new Font("Tahoma", Font.PLAIN, 20));

		/**
		 * Skapar Button e
		 */

		JButton btnE = new JButton("e");
		btnE.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnE.setHorizontalTextPosition(SwingConstants.CENTER);
		btnE.setBounds(22, 350, 70, 42);
		btnE.addActionListener(new ActionListener() {
			/**
			 * Den method anropar method AdvancedOperation och skicka kode 9 som
			 * är advance operation e.
			 * 
			 */

			public void actionPerformed(ActionEvent e) {
				AdvancedOperation(9);

			}
		});

		/**
		 * Skapar Button point
		 */
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDot.addActionListener(new ActionListener() {

			/**
			 * 
			 * Den method anropar method point från class
			 * calculatorActionListener.
			 * 
			 */

			public void actionPerformed(ActionEvent e) {

				point();

			}
		});
		btnDot.setBounds(198, 114, 60, 45);

		/**
		 * Skapar Button tan
		 */

		JButton btnTan = new JButton("tan");
		btnTan.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTan.setBounds(107, 286, 76, 42);
		btnTan.addActionListener(new ActionListener() {

			/**
			 * Den method anropar method AdvancedOperation och skicka kode 4 som
			 * är advance operation tan.
			 * 
			 */
			public void actionPerformed(ActionEvent e) {

				AdvancedOperation(4);

			}
		});
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 20));

		/**
		 * Skapar Button logaritmer
		 */

		JButton btn26 = new JButton("log");
		btn26.setBounds(220, 176, 0, 29);
		JButton btnLog = new JButton("log");
		btnLog.setHorizontalTextPosition(SwingConstants.CENTER);
		btnLog.setBounds(22, 168, 70, 42);
		btnLog.addActionListener(new ActionListener() {
			/**
			 * 
			 * Den method anropar method AdvancedOperation och skickar kode 6
			 * som är advanceoperation log.
			 * 
			 */

			public void actionPerformed(ActionEvent e) {
				AdvancedOperation(6);

			}
		});
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 20));

		/**
		 * Skapar Button Clean.
		 */
		JButton btnClear = new JButton("AC");
		btnClear.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		btnClear.setBounds(348, 114, 134, 45);
		btnClear.addActionListener(new ActionListener() {
			/**
			 * 
			 * Den method anropar method clear från class
			 * calculatoraActionListener.
			 * 
			 */

			public void actionPerformed(ActionEvent e) {

				clear();
			}
		});

		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		/**
		 * Skapar txtDisplay 1
		 * 
		 */

		txtDisplay1 = new JTextField();
		txtDisplay1.setBounds(22, 16, 460, 42);
		txtDisplay1.setEditable(false);
		txtDisplay1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay1.setBackground(SystemColor.control);
		txtDisplay1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDisplay1.setColumns(15);
		txtDisplay1.setForeground(Color.RED);
		/**
		 * Skapar txtDisplay 2
		 * 
		 */

		txtDisplay2 = new JTextField();
		txtDisplay2.setBounds(22, 57, 460, 42);
		txtDisplay2.setEditable(false);
		txtDisplay2.setBackground(Color.WHITE);
		txtDisplay2.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtDisplay2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay2.setColumns(15);

		/**
		 * Skapar Layout
		 * 
		 */
		contentPane.setLayout(null);
		/**
		 * lägga till Buttons
		 * 
		 */

		contentPane.add(btnSin);
		contentPane.add(btnTan);
		contentPane.add(btnCos);
		contentPane.add(btnxx);

		contentPane.add(btnE);
		contentPane.add(btnPi);
		contentPane.add(btnLog);
		contentPane.add(btnSqr);
		contentPane.add(btnExp);

		contentPane.add(btn0);
		contentPane.add(btn1);
		contentPane.add(btn2);
		contentPane.add(btn3);
		contentPane.add(btn4);
		contentPane.add(btn5);
		contentPane.add(btn6);
		contentPane.add(btn7);
		contentPane.add(btn8);
		contentPane.add(btn9);

		contentPane.add(btnEquals);
		contentPane.add(btnPlus);
		contentPane.add(btnDivision);
		contentPane.add(btnMultiply);
		contentPane.add(btnMinus);
		contentPane.add(btnModulus);

		contentPane.add(btnClear);
		contentPane.add(btnDel);
		contentPane.add(btnDot);
		/**
		 * lägga till txtDisplay1 och txtDisplay2
		 * 
		 */

		contentPane.add(txtDisplay2);
		contentPane.add(txtDisplay1);

		/**
		 * den method skriver + eller - till nummer. efter varje klick byta
		 * värde av boolean b om bvar true skriver + annars skriver - i
		 * txtDisplay2.
		 * 
		 */

		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				plusMinus();

			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnPlusMinus.setBounds(271, 350, 60, 45);
		contentPane.add(btnPlusMinus);
	}

	/**
	 * Den method tar en integer parameter och skriver nummer i txtdisplay2.
	 * 
	 * 
	 */
	public void skrivtal(int number) {

		st = txtDisplay2.getText();

		switch (number) {
		case (1):

			if (st.length() == 0) {

				txtDisplay2.setText(txtDisplay2.getText() + "1");
			} else {
				txtDisplay2.setText(txtDisplay2.getText() + "1");

			}
			break;
		case (2):

			if (st.length() == 0) {

				txtDisplay2.setText(txtDisplay2.getText() + "2");
			} else {
				txtDisplay2.setText(txtDisplay2.getText() + "2");

			}
			break;
		case (3):

			if (st.length() == 0) {

				txtDisplay2.setText(txtDisplay2.getText() + "3");
			} else {
				txtDisplay2.setText(txtDisplay2.getText() + "3");

			}
			break;
		case (4):

			if (st.length() == 0) {

				txtDisplay2.setText(txtDisplay2.getText() + "4");
			} else {
				txtDisplay2.setText(txtDisplay2.getText() + "4");

			}
			break;
		case (5):

			if (st.length() == 0) {

				txtDisplay2.setText(txtDisplay2.getText() + "5");
			} else {
				txtDisplay2.setText(txtDisplay2.getText() + "5");

			}
			break;
		case (6):

			if (st.length() == 0) {

				txtDisplay2.setText(txtDisplay2.getText() + "6");
			} else {
				txtDisplay2.setText(txtDisplay2.getText() + "6");

			}
			break;
		case (7):

			if (st.length() == 0) {

				txtDisplay2.setText(txtDisplay2.getText() + "7");
			} else {
				txtDisplay2.setText(txtDisplay2.getText() + "7");
			}
			break;
		case (8):

			if (st.length() == 0) {

				txtDisplay2.setText(txtDisplay2.getText() + "8");
			} else {
				txtDisplay2.setText(txtDisplay2.getText() + "8");

			}
			break;
		case (9):

			if (st.length() == 0) {

				txtDisplay2.setText(txtDisplay2.getText() + "9");
			} else {
				txtDisplay2.setText(txtDisplay2.getText() + "9");

			}
			break;
		case (0):

			if (st.length() == 0) {

				txtDisplay2.setText("0");
			} else {
				txtDisplay2.setText(txtDisplay2.getText() + "0");

			}
			break;
		default:
			txtDisplay1.setText("");
			txtDisplay2.setText("");

		}

	}

	/**
	 * 
	 * Den method tar char op och använda ett switch case föratt välja rätt
	 * BasicOperation sedan i varje statment , den tar value av double
	 * FirstNumber från txtDisplay2 och lägga till operation sedan det skriver i
	 * txtDisplay1.
	 *
	 * @param op
	 *            character
	 * 
	 * @param Operation
	 *            Integer value.
	 * 
	 * @param FirstNumber
	 *            : First Number value double.
	 * 
	 * 
	 * 
	 */

	public void BasicOperation(char op) {

		if (txtDisplay1.getText().length()==0&& txtDisplay2.getText().length()==0) {
			
			txtDisplay1.setText("");
			txtDisplay2.setText("");
		}else if (txtDisplay1.getText().length()==0&& txtDisplay2.getText().length()>0){
			st = txtDisplay2.getText();
			txtDisplay1.setText(st);
			FirstNumber = Double.parseDouble(st);
		
		

		switch (op) {
		case '+':
			txtDisplay1.setText(FirstNumber + " + ");
			Operation = 1; // plus
			txtDisplay2.setText("");

			break;
		case '-':

			txtDisplay1.setText(FirstNumber + " - ");
			Operation = 2; // minus
			txtDisplay2.setText("");

			break;
		case '*':
			txtDisplay1.setText(FirstNumber + " * ");
			Operation = 3; // Multiply
			txtDisplay2.setText("");

			break;
		case '/':
			txtDisplay1.setText(FirstNumber + " / ");
			Operation = 4; // Division
			txtDisplay2.setText("");

			break;
		case '%':
			txtDisplay1.setText(FirstNumber + " % ");
			Operation = 5; // Modulus opretion
			txtDisplay2.setText("");

			break;
		default:
			txtDisplay2.setText("");

		}
		}
	}

	/**
	 * Den method anropar 4 metoder från class CalculatorBasicOperations och ett
	 * method från class CalculatorAdvancedOperations. Den kontrolerar vilken
	 * opreation påverkas . Operation 1 är plus , Operation 2 är minus,
	 * Operation 3 är multiply, Operation 4 är division , Operation 5 är
	 * Modulus. sedan det räknar resultaten och skriver i txtDisplay2.
	 * 
	 * @param FirstNumber
	 *            Double
	 * 
	 * @param SecondNumber
	 *            Double
	 * 
	 * @param ad
	 *            integer
	 * 
	 * 
	 */

	public void equal(int ad) {
	  if (ad>0){
		  AdvancedOperation(ad);
	  }else if (Operation>0){
			st = txtDisplay2.getText();
			CalculatorBasicOperations cb = new CalculatorBasicOperations();
			CalculatorAdvancedOperations ca = new CalculatorAdvancedOperations();
	
			SecondNumber = Double.parseDouble(st);
			String s = txtDisplay1.getText();
	
			if (s.length() == 0) {
				txtDisplay1.setText("");
			} else {
				txtDisplay1.setText(txtDisplay1.getText() + st);
			}
	
			/**
			 * Operation =1 plus ,Operation =2 minus, Operation =3 multiply,
			 * Operation =4 division , Operation=5 Modulus
			 * 
			 */
	
			switch (Operation) {
			case 1:
				txtDisplay1.setText(FirstNumber + " + " + SecondNumber);
				txtDisplay2.setText("" + cb.addition(FirstNumber, SecondNumber));
				break;
			case 2:
				txtDisplay1.setText(FirstNumber + " - " + SecondNumber);
				txtDisplay2.setText("" + cb.subtraction(FirstNumber, SecondNumber));
	
				break;
			case 3:
				txtDisplay1.setText(FirstNumber + " * " + SecondNumber);
				txtDisplay2.setText("" + cb.multiplikation(FirstNumber, SecondNumber));
	
				break;
			case 4:
				if (SecondNumber == 0) {
					JOptionPane.showMessageDialog(null, " You can not perform a division by zero");
					txtDisplay1.setText("");
					txtDisplay2.setText("");
	
				} else {
					txtDisplay1.setText(FirstNumber + " / " + SecondNumber);
					txtDisplay2.setText("" + cb.dividera(FirstNumber, SecondNumber));
				}
				break;
			case 5:
				if (SecondNumber == 0) {
					JOptionPane.showMessageDialog(null, " You can not perform a division by zero");
					txtDisplay1.setText("");
					txtDisplay2.setText("");
				} else {
					txtDisplay1.setText(FirstNumber + " % " + SecondNumber);
					txtDisplay2.setText("" + ca.modulus(FirstNumber, SecondNumber));
				}
				break;
				
			default:
				txtDisplay1.setText("");
				txtDisplay2.setText("");
	
	
			}
	
			FirstNumber = 0;
			SecondNumber = 0;
			Operation=0;
			
			}
	 
	}

	/**
	 * 
	 * 
	 * Den method tar integer koder från AdvOperation och använda ett switch
	 * case föratt välja rätt AdvancedOperation sedan i varje statment tar value
	 * av double FirstNumber från txtDisplay2 och anroppar methoden från class
	 * AdvancedOprations. 
	 * AdvOperation 1 är exp, AdvOperation 2 är sin,
	 * AdvOperation 3 är cos, AdvOperation 4 är tan, AdvOperation 5 är x^2,
	 * AdvOperation 6 är log, AdvOperation 7 är sqrt, AdvOperation 8 är pi,
	 * AdvOperation 9 är e,
	 * 
	 *
	 * @param AdvOperation
	 *            integar
	 * 
	 * 
	 * 
	 */

	public void AdvancedOperation(int AdvOperation) {

		CalculatorAdvancedOperations cao = new CalculatorAdvancedOperations();
		st = txtDisplay2.getText();
	   	ad=AdvOperation;
			switch (AdvOperation) {
			case (1):
				if (st.length() == 0) {
					txtDisplay1.setText("exp(" );
					txtDisplay2.setText("");
					ad=AdvOperation;
					
				} else {

					FirstNumber = Double.parseDouble(st);


				txtDisplay2.setText("" + cao.EXP(FirstNumber));
				txtDisplay1.setText("exp(" + FirstNumber + ")");
				FirstNumber = 0;
				}
				break;
			case (2):
				if (st.length() == 0) {
					txtDisplay1.setText("sin (");
					txtDisplay2.setText("");
					
				} else {

					FirstNumber = Double.parseDouble(st);


				txtDisplay2.setText("" + cao.sin(FirstNumber));
				txtDisplay1.setText("sin (" + FirstNumber + ")");
				FirstNumber = 0;
				}

				break;
			case (3):
				
				if (st.length() == 0) {
					txtDisplay1.setText("cos (");
					txtDisplay2.setText("");
					
				} else {

					FirstNumber = Double.parseDouble(st);

				txtDisplay2.setText("" + cao.cos(FirstNumber));
				txtDisplay1.setText("cos ( " + FirstNumber + " )");
				FirstNumber = 0;
				}

				break;
			case (4):
				if (st.length() == 0) {
					txtDisplay1.setText("tan (");
					txtDisplay2.setText("");
				
				} else {

					FirstNumber = Double.parseDouble(st);


				txtDisplay2.setText("" + cao.tan(FirstNumber));
				txtDisplay1.setText("tan (" + FirstNumber + ")");
				FirstNumber = 0;
				}

				break;
			case (5):
				if (st.length() == 0) {
					txtDisplay1.setText("X^2");
					txtDisplay2.setText("");
				
				} else {

					FirstNumber = Double.parseDouble(st);

				txtDisplay2.setText("" + cao.xx(FirstNumber));
				txtDisplay1.setText("" + FirstNumber + " ^2");
				FirstNumber = 0;
				}

				break;
			case (6):
				if (st.length() == 0) {
					txtDisplay1.setText("log (");
					txtDisplay2.setText("");
					
				} else {

					 FirstNumber = Double.parseDouble(st);

				
				     if (FirstNumber>0){
				        txtDisplay2.setText("" + cao.LOG(FirstNumber));
				        txtDisplay1.setText("log (" + FirstNumber + ")");
				        
			         }else {
                  
                 	         txtDisplay1.setText("log ( " + FirstNumber + " )");
  			    	         txtDisplay2.setText("");
  			                 JOptionPane.showMessageDialog(null, " Result undefined");
  			                			     
  			                 txtDisplay1.setText("");
  			                 }
  			                 FirstNumber = 0;
				}
				break;
			case (7):
				
				if (st.length() == 0) {
					txtDisplay1.setText("sqrt(");
					txtDisplay2.setText("");
					
				} else {

						FirstNumber = Double.parseDouble(st);
	
		                if (FirstNumber>0 || FirstNumber==0 ){
						    txtDisplay2.setText("" + cao.sqr(FirstNumber));
						    txtDisplay1.setText("sqr ( " + FirstNumber + " )");
		                }else {
		                	
		                	txtDisplay1.setText("sqr ( " + FirstNumber + " )");
		    				txtDisplay2.setText("");
		    				JOptionPane.showMessageDialog(null, " Result undefined");
		    				txtDisplay1.setText("");
		                      }
		                FirstNumber = 0;
			      }
				break;
			case (8):
				if (st.length() == 0) {
					txtDisplay1.setText("PI *");
					txtDisplay2.setText("");
				
				} else {

					FirstNumber = Double.parseDouble(st);

	
					txtDisplay2.setText("" + cao.PI(FirstNumber));
					txtDisplay1.setText("PI * " + FirstNumber);
					 FirstNumber = 0;
				}
				break;
			case (9):
				if (st.length() == 0) {
					txtDisplay1.setText("e *");
					txtDisplay2.setText("");
					
				} else {

					FirstNumber = Double.parseDouble(st);


					txtDisplay2.setText("" + cao.E(FirstNumber));
					txtDisplay1.setText("e * " + FirstNumber);
					 FirstNumber = 0;
				}

				break;
			default:
				txtDisplay1.setText("");
				txtDisplay2.setText("");

			}
	//	}
	//	FirstNumber = 0;

	}

	/**
	 * 
	 * Den method rensa txtDisplay1 och txtDisplay2 . txtDisplay1=""
	 * txtDisplay2="" FirstNumber och SecondNumber blir zero.
	 * 
	 */

	public void clear() {
		txtDisplay1.setText(null);
		txtDisplay2.setText(null);
		FirstNumber = 0;
		SecondNumber = 0;

	}

	/**
	 * 
	 * Den method skriver en point i txtDisplay2. Först tar String st från
	 * txtDisplay2. Räkna length av st om length var 0 skriver(0.) i txtDisplay2
	 * . Men om length var mer än 0 , söker eftre (.)i String st. När det hittar
	 * inte point i st sedan den skriver en point i txtDisplay2.
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public void point() {

		st = txtDisplay2.getText();

		if (st.length() == 0) {
			st = st + "0.";
			txtDisplay2.setText(st);

		} else if (!st.contains(".")) {
			txtDisplay2.setText(txtDisplay2.getText() + ".");

		}
	}

	/**
	 * Den method tar length av string txtDisplay2.Om lenght var mer än 0 sedan
	 * skappar ett objekt av StringBuilder och tabort sista character av
	 * txtDisplay2. Det funkar som Backspace.
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public void Backspace() {
		String store;
		int Length = txtDisplay2.getText().length();

		if (Length > 0) {
			StringBuilder back = new StringBuilder(txtDisplay2.getText());
			back.deleteCharAt(Length - 1);
			store = back.toString();
			txtDisplay2.setText(store);
		}

	}

	/**
	 * den method skriver + eller - till nummer. efter varje klick byta värde av
	 * boolean b om bvar true skriver + annars skriver - i txtDisplay2.
	 * 
	 */

	public void plusMinus() {

		String s2 = txtDisplay2.getText();

		if (b == true) {
			if (s2.length() == 0) {
				txtDisplay2.setText(s2 );
				b = false;
			} else {

				txtDisplay2.setText("");
				b = false;
			}

		} else {
			if (s2.length() == 0) {
				txtDisplay2.setText(s2 + " -");
				b = true;
			} else {

				txtDisplay2.setText(" -");
				b = true;
			}
		}
	}
}

/**
 * Slut av CalculatorJF class
 * 
 */
