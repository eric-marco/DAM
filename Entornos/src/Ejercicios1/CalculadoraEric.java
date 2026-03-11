package Ejercicios1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraEric {

	private JFrame frame;
	private JTextField textNumero;
	private JTextField textNumero2;
	private JTextField textResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraEric window = new CalculadoraEric();
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
	public CalculadoraEric() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(147, 201, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCalculadora = new JLabel("CALCULADORA");
		lblCalculadora.setForeground(new Color(0, 0, 255));
		lblCalculadora.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblCalculadora.setBounds(140, 11, 142, 26);
		frame.getContentPane().add(lblCalculadora);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(147, 201, 255));
		panel.setBounds(50, 61, 303, 139);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(55, 11, 54, 14);
		panel.add(lblNewLabel);
		
		textNumero = new JTextField();
		textNumero.setBounds(119, 8, 101, 20);
		panel.add(textNumero);
		textNumero.setColumns(10);
		
		textNumero2 = new JTextField();
		textNumero2.setColumns(10);
		textNumero2.setBounds(119, 33, 101, 20);
		panel.add(textNumero2);
		
		JLabel lblNumero = new JLabel("Numero 2");
		lblNumero.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNumero.setBounds(55, 36, 54, 14);
		panel.add(lblNumero);
		
		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double num1 = Double.parseDouble(textNumero.getText());
					double num2 = Double.parseDouble(textNumero2.getText());
					double resultado = num1 + num2;
					textResultado.setText(String.valueOf(resultado));
				} catch (NumberFormatException ex) {
					textResultado.setText("Error");
				}
			}
		});
		btnSuma.setBounds(65, 64, 89, 23);
		panel.add(btnSuma);
		
		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double num1 = Double.parseDouble(textNumero.getText());
					double num2 = Double.parseDouble(textNumero2.getText());
					double resultado = num1 - num2;
					textResultado.setText(String.valueOf(resultado));
				} catch (NumberFormatException ex) {
					textResultado.setText("Error");
				}
			}
		});
		btnResta.setBounds(157, 64, 89, 23);
		panel.add(btnResta);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double num1 = Double.parseDouble(textNumero.getText());
					double num2 = Double.parseDouble(textNumero2.getText());
					if (num2 == 0) {
						textResultado.setText("Div/0");
					} else {
						double resultado = num1 / num2;
						textResultado.setText(String.valueOf(resultado));
					}
				} catch (NumberFormatException ex) {
					textResultado.setText("Error");
				}
			}
		});
		btnDivision.setBounds(157, 87, 89, 23);
		panel.add(btnDivision);
		
		JButton btnMultiplicacion = new JButton("*");
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double num1 = Double.parseDouble(textNumero.getText());
					double num2 = Double.parseDouble(textNumero2.getText());
					double resultado = num1 * num2;
					textResultado.setText(String.valueOf(resultado));
				} catch (NumberFormatException ex) {
					textResultado.setText("Error");
				}
			}
		});
		btnMultiplicacion.setBounds(65, 87, 89, 23);
		panel.add(btnMultiplicacion);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblResultado.setBounds(119, 214, 68, 14);
		frame.getContentPane().add(lblResultado);
		
		textResultado = new JTextField();
		textResultado.setColumns(10);
		textResultado.setBounds(197, 211, 101, 20);
		frame.getContentPane().add(textResultado);
	}
}
