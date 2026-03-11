package Ejercicios1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class ContadorEric {

	private JFrame frame;
	private JTextField textField;
	private int cont = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContadorEric window = new ContadorEric();
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
	public ContadorEric() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 128));
		frame.getContentPane().setFont(new Font("Constantia", Font.PLAIN, 11));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 20));
		lblNumero.setBounds(49, 78, 90, 19);
		frame.getContentPane().add(lblNumero);
		
		JButton btnNewButton = new JButton("Suma");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cont++;
				textField.setText(String.valueOf(cont));
			}
		});
		btnNewButton.setBounds(28, 158, 114, 64);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnResta = new JButton("Resta");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cont--;
				textField.setText(String.valueOf(cont));
			}
		});
		btnResta.setBounds(159, 158, 114, 64);
		frame.getContentPane().add(btnResta);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cont = 0;
				textField.setText(String.valueOf(cont));
			}
		});
		btnReset.setBounds(296, 158, 114, 64);
		frame.getContentPane().add(btnReset);
		
		textField = new JTextField();
		textField.setBackground(new Color(192, 192, 192));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		textField.setBounds(188, 58, 181, 64);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(10, 147, 414, 86);
		frame.getContentPane().add(panel);
		
		JLabel lblContador = new JLabel("CONTADOR");
		lblContador.setBounds(148, 11, 146, 35);
		frame.getContentPane().add(lblContador);
		lblContador.setFont(new Font("Ebrima", Font.BOLD, 26));
	}
}
