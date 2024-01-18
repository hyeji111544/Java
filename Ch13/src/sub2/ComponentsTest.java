package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class ComponentsTest {

	private JFrame frame;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtNum4;
	private JTextField txtNum3;
	private JTextField txtNum6;
	private JTextField txtNum5;
	private JTextField txtNum8;
	private JTextField txtNum7;
	private JButton btnMiuns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest window = new ComponentsTest();
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
	public ComponentsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습");
		lblNewLabel.setBounds(10, 10, 116, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("버튼 실습");
		lblNewLabel_1.setBounds(20, 35, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btn1 = new JButton("확인1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭했을 때 실행되는 리스너(핸들러)
				System.out.println("확인 1 클릭!!!");
			}
		});
		btn1.setBounds(30, 60, 70, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "버튼 2 클릭!!!");
			}
		});
		btn2.setBounds(111, 60, 70, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int answer = JOptionPane.showConfirmDialog(null, "버튼 3 클릭!!!","확인 대화 상자",JOptionPane.YES_NO_OPTION);
				
				if(answer == 0 ) {
					System.out.println("Yes 클릭...");
				}else {
					System.out.println("No클릭 ...");
				}
				
			}
		});
		btn3.setBounds(194, 60, 70, 23);
		frame.getContentPane().add(btn3);
		
		JLabel lblNewLabel_2 = new JLabel("텍스트 필드 실습");
		lblNewLabel_2.setBounds(10, 93, 116, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnUId = new JButton("확인");
		btnUId.setBounds(188, 109, 76, 23);
		frame.getContentPane().add(btnUId);
		
		JLabel txtUId_1 = new JLabel("아이디");
		txtUId_1.setBounds(20, 113, 57, 15);
		frame.getContentPane().add(txtUId_1);
		
		txtUid = new JTextField();
		txtUid.setBounds(65, 110, 116, 21);
		frame.getContentPane().add(txtUid);
		txtUid.setColumns(10);
		
		JLabel lbResultUid = new JLabel("결과 :");
		lbResultUid.setBounds(279, 113, 103, 15);
		frame.getContentPane().add(lbResultUid);
		
		JLabel txtName_1 = new JLabel("이름");
		txtName_1.setBounds(20, 146, 57, 15);
		frame.getContentPane().add(txtName_1);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(65, 143, 116, 21);
		frame.getContentPane().add(txtName);
		
		JButton btnName = new JButton("확인");
		btnName.setBounds(188, 142, 76, 23);
		frame.getContentPane().add(btnName);
		
		JLabel lbResultName = new JLabel("결과 :");
		lbResultName.setBounds(279, 146, 103, 15);
		frame.getContentPane().add(lbResultName);
		
		JLabel txtHpaa = new JLabel("휴대폰");
		txtHpaa.setBounds(20, 177, 57, 15);
		frame.getContentPane().add(txtHpaa);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(65, 174, 116, 21);
		frame.getContentPane().add(txtHp);
		
		JButton btnHp = new JButton("확인");
		btnHp.setBounds(188, 173, 76, 23);
		frame.getContentPane().add(btnHp);
		
		JLabel lbResultHp = new JLabel("결과 :");
		lbResultHp.setBounds(279, 177, 103, 15);
		frame.getContentPane().add(lbResultHp);
		
		JLabel txtHp_1 = new JLabel("덧셈");
		txtHp_1.setBounds(20, 205, 57, 15);
		frame.getContentPane().add(txtHp_1);
		
		txtNum1 = new JTextField();
		txtNum1.setColumns(10);
		txtNum1.setBounds(65, 202, 49, 21);
		frame.getContentPane().add(txtNum1);
		
		txtNum2 = new JTextField();
		txtNum2.setColumns(10);
		txtNum2.setBounds(132, 202, 49, 21);
		frame.getContentPane().add(txtNum2);
		
		JButton btnPlus = new JButton("확인");
		btnPlus.setBounds(188, 201, 76, 23);
		frame.getContentPane().add(btnPlus);
		
		JLabel lblNewLabel_3 = new JLabel("  +");
		lblNewLabel_3.setBounds(111, 205, 15, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lbResultPlus = new JLabel("결과 :");
		lbResultPlus.setBounds(279, 205, 103, 15);
		frame.getContentPane().add(lbResultPlus);
		
		JLabel lbResultMinus = new JLabel("결과 :");
		lbResultMinus.setBounds(279, 234, 103, 15);
		frame.getContentPane().add(lbResultMinus);
		
		btnMiuns = new JButton("확인");
		btnMiuns.setBounds(188, 230, 76, 23);
		frame.getContentPane().add(btnMiuns);
		
		txtNum4 = new JTextField();
		txtNum4.setColumns(10);
		txtNum4.setBounds(132, 231, 49, 21);
		frame.getContentPane().add(txtNum4);
		
		JLabel lblNewLabel_3_1 = new JLabel("  -");
		lblNewLabel_3_1.setBounds(111, 234, 15, 15);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		txtNum3 = new JTextField();
		txtNum3.setColumns(10);
		txtNum3.setBounds(65, 231, 49, 21);
		frame.getContentPane().add(txtNum3);
		
		JLabel txtHp_1_1 = new JLabel("뺄셈");
		txtHp_1_1.setBounds(20, 234, 57, 15);
		frame.getContentPane().add(txtHp_1_1);
		
		JLabel lbResultMulti = new JLabel("결과 :");
		lbResultMulti.setBounds(279, 263, 103, 15);
		frame.getContentPane().add(lbResultMulti);
		
		JButton btnMulti = new JButton("확인");
		btnMulti.setBounds(188, 259, 76, 23);
		frame.getContentPane().add(btnMulti);
		
		txtNum6 = new JTextField();
		txtNum6.setColumns(10);
		txtNum6.setBounds(132, 260, 49, 21);
		frame.getContentPane().add(txtNum6);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("  *");
		lblNewLabel_3_1_1.setBounds(111, 263, 15, 15);
		frame.getContentPane().add(lblNewLabel_3_1_1);
		
		txtNum5 = new JTextField();
		txtNum5.setColumns(10);
		txtNum5.setBounds(65, 260, 49, 21);
		frame.getContentPane().add(txtNum5);
		
		JLabel txtHp_1_1_1 = new JLabel("곱셈");
		txtHp_1_1_1.setBounds(20, 263, 57, 15);
		frame.getContentPane().add(txtHp_1_1_1);
		
		JLabel lbResultDiv = new JLabel("결과 :");
		lbResultDiv.setBounds(279, 292, 103, 15);
		frame.getContentPane().add(lbResultDiv);
		
		JButton btnDiv = new JButton("확인");
		btnDiv.setBounds(188, 288, 76, 23);
		frame.getContentPane().add(btnDiv);
		
		txtNum8 = new JTextField();
		txtNum8.setColumns(10);
		txtNum8.setBounds(132, 289, 49, 21);
		frame.getContentPane().add(txtNum8);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("  /");
		lblNewLabel_3_1_1_1.setBounds(111, 292, 15, 15);
		frame.getContentPane().add(lblNewLabel_3_1_1_1);
		
		txtNum7 = new JTextField();
		txtNum7.setColumns(10);
		txtNum7.setBounds(65, 289, 49, 21);
		frame.getContentPane().add(txtNum7);
		
		JLabel txtHp_1_1_1_1 = new JLabel("나눗셈");
		txtHp_1_1_1_1.setBounds(20, 292, 57, 15);
		frame.getContentPane().add(txtHp_1_1_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("체크박스 실습");
		lblNewLabel_4.setBounds(10, 317, 90, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JCheckBox chk1 = new JCheckBox("서울");
		chk1.setBounds(10, 338, 57, 23);
		frame.getContentPane().add(chk1);
		
		JCheckBox chk2 = new JCheckBox("대전");
		chk2.setBounds(71, 338, 57, 23);
		frame.getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("대구");
		chk3.setBounds(132, 338, 57, 23);
		frame.getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("부산");
		chk4.setBounds(194, 338, 57, 23);
		frame.getContentPane().add(chk4);
		
		JCheckBox chk5 = new JCheckBox("광주");
		chk5.setBounds(255, 338, 57, 23);
		frame.getContentPane().add(chk5);
		
		JButton btnCheck = new JButton("확인");
		btnCheck.setBounds(320, 338, 70, 23);
		frame.getContentPane().add(btnCheck);
		
		JLabel lbCheckResult = new JLabel("결과");
		lbCheckResult.setBounds(10, 367, 201, 15);
		frame.getContentPane().add(lbCheckResult);
		
		//이벤트 리스너
		btnUId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//텍스트 필드에 입력된 문자열 가져오기
				String uid = txtUid.getText();
				
				//결과 라벨에 가져온 문자열 입력하기
				lbResultUid.setText("결과 : " + uid);
			}
		});
		
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = txtName.getText();
				lbResultName.setText("결과 : " + name);
				
			}
		});
		
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String hp = txtHp.getText();
				lbResultHp.setText("결과 : " + hp);
			}
		});
		
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1 = Integer.parseInt(txtNum1.getText());
				int num2 = Integer.parseInt(txtNum2.getText());
				int result = num1 + num2;
				
				lbResultPlus.setText("결과 : " + result);
				
			}
		});
		
		btnMiuns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num3 = Integer.parseInt(txtNum3.getText());
				int num4 = Integer.parseInt(txtNum4.getText());
				int result = num3 - num4;
				
				lbResultMinus.setText("결과 : " + result);
				
			}
		});
		
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num5 = Integer.parseInt(txtNum5.getText());
				int num6 = Integer.parseInt(txtNum6.getText());
						
				int result = num5 * num6;
				lbResultMulti.setText("결과 : " + result);
				
			}
		});
		
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num7 = Integer.parseInt(txtNum7.getText());
				int num8 = Integer.parseInt(txtNum8.getText());
						
				int result = num7 / num8;
				lbResultDiv.setText("결과 : " + result);
				
			}
		});
		
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> cities = new ArrayList<>();
				
				if(chk1.isSelected()) {
					cities.add(chk1.getText());
				}
				if(chk2.isSelected()) {
					cities.add(chk2.getText());
				}
				if(chk3.isSelected()) {
					cities.add(chk3.getText());
				}
				if(chk4.isSelected()) {
					cities.add(chk4.getText());
				}
				if(chk5.isSelected()) {
					cities.add(chk5.getText());
				}
				
				lbCheckResult.setText("결과 : " + cities);
				
			}
			
		
		});
		
	}
}
