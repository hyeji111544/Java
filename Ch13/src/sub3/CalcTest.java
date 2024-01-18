package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class CalcTest {

	private JFrame frame;
	private JTextField txtResult;
	private JButton btn8;
	private JButton btn9;
	private JButton btnDiv;
	private JButton btn5;
	private JButton btn6;
	private JButton btnMulti;
	private JButton btn2;
	private JButton btn3;
	private JButton btnMinus;
	private JButton btn0;
	private JButton btnEq;
	private JButton btnPlus;
	private JButton btnCancel;
	private JButton btn1;
	private JButton btn4;
	private JButton btn7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcTest window = new CalcTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalcTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private int operator =0; //1:더하기, 2:빼기, 3:곱하기, 4:나누기 로 간주하자.
	private int num1 = 0;
	private int num2 = 0;
	
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(244, 255, 255));
		frame.setBounds(100, 100, 275, 365);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtResult = new JTextField();
		txtResult.setText("0");
		txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResult.setBackground(new Color(255, 255, 255));
		txtResult.setEditable(false);
		txtResult.setFont(new Font("굴림", Font.PLAIN, 24));
		txtResult.setBounds(12, 10, 235, 59);
		frame.getContentPane().add(txtResult);
		txtResult.setColumns(10);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn8.setBounds(74, 79, 50, 50);
		frame.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.setBounds(136, 79, 50, 50);
		frame.getContentPane().add(btn9);
		
		btnDiv = new JButton("/");
		btnDiv.setBounds(197, 79, 50, 50);
		frame.getContentPane().add(btnDiv);
		
		btn5 = new JButton("5");
		btn5.setBounds(74, 139, 50, 50);
		frame.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.setBounds(136, 139, 50, 50);
		frame.getContentPane().add(btn6);
		
		btnMulti = new JButton("*");
		btnMulti.setBounds(197, 139, 50, 50);
		frame.getContentPane().add(btnMulti);
		
		btn2 = new JButton("2");
		btn2.setBounds(74, 199, 50, 50);
		frame.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.setBounds(136, 199, 50, 50);
		frame.getContentPane().add(btn3);
		
		btnMinus = new JButton("-");
		btnMinus.setBounds(197, 199, 50, 50);
		frame.getContentPane().add(btnMinus);
		
		btn0 = new JButton("0");
		btn0.setBounds(74, 259, 50, 50);
		frame.getContentPane().add(btn0);
		
		btnEq = new JButton("=");
		btnEq.setBounds(136, 259, 50, 50);
		frame.getContentPane().add(btnEq);
		
		btnPlus = new JButton("+");
		btnPlus.setBounds(197, 259, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		btnCancel = new JButton("c");
		btnCancel.setBounds(12, 259, 50, 50);
		frame.getContentPane().add(btnCancel);
		
		btn1 = new JButton("1");
		btn1.setBounds(12, 199, 50, 50);
		frame.getContentPane().add(btn1);
		
		btn4 = new JButton("4");
		btn4.setBounds(12, 139, 50, 50);
		frame.getContentPane().add(btn4);
		
		btn7 = new JButton("7");
		btn7.setBounds(12, 79, 50, 50);
		frame.getContentPane().add(btn7);
		
		//버튼 리스너
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 1;
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 2;
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 3;
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 4;
			}
		});
		
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 5;
			}
		});
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 6;
			}
		});
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 7;
			}
		});
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 8;
			}
		});
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 9;
			}
		});
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 0;
			}
		});
		
		//연산 버튼
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 1;
				num1 = Integer.parseInt(txtResult.getText());
                txtResult.setText("");
			}
		});
		
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 2;
				num1 = Integer.parseInt(txtResult.getText());
                txtResult.setText("");
			}
		});
		
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 3;
				num1 = Integer.parseInt(txtResult.getText());
                txtResult.setText("");
			}
		});
		
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 4;
				num1 = Integer.parseInt(txtResult.getText());
                txtResult.setText("");
			}
		});
		
		
		//Eq 눌렀을 때 계산
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = 0;
				
				if(operator == 1) {
					result = num1 + num2;
				}else if(operator == 2) {
					result = num1 - num2;
				}else if(operator == 3) {
					result = num1 * num2;
				}else if(operator == 4) {
					result = num1 / num2;
				}
				
				txtResult.setText(String.valueOf(result));
				
			}
		});
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("1");
				num1 = 1;
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("2");
				num2 = 2;
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("3");
				num1 = 3;
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("4");
				num1 = 4;
			}
		});
		
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("5");
				num1 = 5;
			}
		});
		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("6");
				num1 = 6;
			}
		});
		
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("7");
				num1 = 7;
			}
		});
		
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("8");
				num1 = 8;
			}
		});
		
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("9");
				num1 = 9;
			}
		});
		
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("0");
				num1 = 0;
			}
		});
		
		
		
	}

}
