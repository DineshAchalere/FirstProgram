
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Calculator extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField asc;
	private JTextField bsc;
	private JTextField res;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		Scanner sc = new Scanner(System.in);
		setTitle("D_Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 290, 350);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel calcLabel = new JLabel("CALCULATOR");
		calcLabel.setHorizontalAlignment(SwingConstants.CENTER);
		calcLabel.setFont(new Font("Arial Narrow", Font.BOLD, 22));
		calcLabel.setBounds(81, 22, 125, 26);
		contentPane.add(calcLabel);

		JLabel a = new JLabel("A");
		a.setFont(new Font("Tahoma", Font.BOLD, 18));
		a.setBounds(32, 63, 12, 22);
		contentPane.add(a);

		JLabel ans = new JLabel("=");
		ans.setFont(new Font("Tahoma", Font.BOLD, 20));
		ans.setBounds(32, 150, 21, 25);
		contentPane.add(ans);

		asc = new JTextField();
		asc.setHorizontalAlignment(SwingConstants.RIGHT);
		asc.setToolTipText("");
		asc.setFont(new Font("Tahoma", Font.BOLD, 18));
		asc.setBounds(63, 60, 176, 28);
		contentPane.add(asc);
		asc.setColumns(10);

		bsc = new JTextField();
		bsc.setToolTipText("");
		bsc.setHorizontalAlignment(SwingConstants.RIGHT);
		bsc.setFont(new Font("Tahoma", Font.BOLD, 18));
		bsc.setColumns(10);
		bsc.setBounds(63, 99, 176, 28);
		contentPane.add(bsc);

		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = asc.getText();
				String num2 = bsc.getText();
				int var1 = Integer.valueOf(num1);
				int var2 = Integer.valueOf(num2);
				int ans = var1 + var2;
				String answer = String.valueOf(ans);
				res.setText(answer);
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAdd.setBounds(32, 186, 94, 31);
		contentPane.add(btnAdd);

		JButton btnDiv = new JButton("DIV");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = asc.getText();
				String num2 = bsc.getText();
				float var1 = Float.valueOf(num1);
				float var2 = Float.valueOf(num2);
				float ans = var1 / var2;
				String answer = String.valueOf(ans);
				res.setText(answer);
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDiv.setBounds(149, 228, 90, 31);
		contentPane.add(btnDiv);

		JButton btnSub = new JButton("SUB");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = asc.getText();
				String num2 = bsc.getText();
				int var1 = Integer.valueOf(num1);
				int var2 = Integer.valueOf(num2);
				int ans = var1 - var2;
				String answer = String.valueOf(ans);
				res.setText(answer);
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSub.setBounds(32, 228, 94, 31);
		contentPane.add(btnSub);

		JButton btnMul = new JButton("MUL");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = asc.getText();
				String num2 = bsc.getText();
				int var1 = Integer.valueOf(num1);
				int var2 = Integer.valueOf(num2);
				int ans = var1 * var2;
				String answer = String.valueOf(ans);
				res.setText(answer);
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMul.setBounds(149, 186, 90, 31);
		contentPane.add(btnMul);

		res = new JTextField();
		res.setToolTipText("");
		res.setHorizontalAlignment(SwingConstants.RIGHT);
		res.setFont(new Font("Tahoma", Font.BOLD, 30));
		res.setColumns(10);
		res.setBounds(63, 138, 176, 37);
		contentPane.add(res);

		JButton btnRem = new JButton("%");
		btnRem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int var1 = Integer.valueOf(asc.getText());
				int var2 = Integer.valueOf(bsc.getText());
				int ans = var1 % var2;
				String answer = String.valueOf(ans);
				res.setText(answer);
			}
		});
		btnRem.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRem.setBounds(32, 269, 94, 31);
		contentPane.add(btnRem);

		JButton btnClr = new JButton("CLR");
		btnClr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asc.setText(null);
				bsc.setText(null);
				res.setText(null);
			}
		});
		btnClr.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClr.setBounds(149, 269, 90, 31);
		contentPane.add(btnClr);

		JLabel b_1 = new JLabel("B");
		b_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		b_1.setBounds(32, 109, 12, 22);
		contentPane.add(b_1);
	}
}
