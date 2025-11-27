package calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tela {

	private JFrame frmCalculadoraItalo;
	private JTextField txtField;
	double numero1;
	double numero2;
	double resultado;
	String operacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
					window.frmCalculadoraItalo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadoraItalo = new JFrame();
		frmCalculadoraItalo
				.setIconImage(Toolkit.getDefaultToolkit().getImage(tela.class.getResource("/imagem/10784221.jpg")));
		frmCalculadoraItalo.setTitle("Calculadora de italo");
		frmCalculadoraItalo.getContentPane().setBackground(new Color(224, 159, 95));
		frmCalculadoraItalo.setBounds(100, 100, 332, 456);
		frmCalculadoraItalo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadoraItalo.getContentPane().setLayout(null);

		txtField = new JTextField();
		txtField.setHorizontalAlignment(SwingConstants.TRAILING);
		txtField.setFont(new Font("Arial Black", Font.PLAIN, 18));
		txtField.setBounds(10, 11, 290, 61);
		frmCalculadoraItalo.getContentPane().add(txtField);
		txtField.setColumns(10);

		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnC.setBounds(232, 104, 63, 50);
		frmCalculadoraItalo.getContentPane().add(btnC);

		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSub.setBounds(232, 223, 63, 50);
		frmCalculadoraItalo.getContentPane().add(btnSub);

		JButton btnMult = new JButton("X");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "x";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMult.setBounds(232, 284, 63, 50);
		frmCalculadoraItalo.getContentPane().add(btnMult);

		JButton btnDiv = new JButton("÷");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "÷";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDiv.setBounds(232, 345, 63, 50);
		frmCalculadoraItalo.getContentPane().add(btnDiv);

		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "+";
			}
		});
		btnSoma.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSoma.setBounds(232, 165, 63, 50);
		frmCalculadoraItalo.getContentPane().add(btnSoma);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn9.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(159, 165, 63, 50);
		frmCalculadoraItalo.getContentPane().add(btn9);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn8.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(83, 165, 63, 50);
		frmCalculadoraItalo.getContentPane().add(btn8);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn7.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 165, 63, 50);
		frmCalculadoraItalo.getContentPane().add(btn7);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn4.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 223, 63, 50);
		frmCalculadoraItalo.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn5.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(83, 223, 63, 50);
		frmCalculadoraItalo.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn6.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(159, 223, 63, 50);
		frmCalculadoraItalo.getContentPane().add(btn6);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn1.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 284, 63, 50);
		frmCalculadoraItalo.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn2.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(83, 284, 63, 50);
		frmCalculadoraItalo.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn3.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(159, 284, 63, 50);
		frmCalculadoraItalo.getContentPane().add(btn3);

		JButton btnPonto = new JButton(",");
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ponto = ".";
				String IngressarNumero = txtField.getText() + ponto;
				txtField.setText(IngressarNumero);
			}
		});
		btnPonto.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPonto.setBounds(10, 345, 63, 50);
		frmCalculadoraItalo.getContentPane().add(btnPonto);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn0.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(83, 345, 63, 50);
		frmCalculadoraItalo.getContentPane().add(btn0);

		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selecionar;
				numero2 = Double.parseDouble(txtField.getText());
				if (operacao.equals("+")) {
					resultado = numero1 + numero2;
					txtField.setText(String.valueOf(resultado));

				} else if (operacao.equals("-")) {
					resultado = numero1 - numero2;
					txtField.setText(String.valueOf(resultado));

				} else if (operacao.equals("x")) {
					resultado = numero1 * numero2;
					txtField.setText(String.valueOf(resultado));

				} else if (operacao.equals("÷")) {
					resultado = numero1 / numero2;
					txtField.setText(String.valueOf(resultado));

				}
			}
		});
		btnIgual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnIgual.setBounds(159, 345, 63, 50);
		frmCalculadoraItalo.getContentPane().add(btnIgual);
	}
}
