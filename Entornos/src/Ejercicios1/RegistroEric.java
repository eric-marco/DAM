package Ejercicios1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;

public class RegistroEric {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroEric window = new RegistroEric();
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
	public RegistroEric() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(162, 102, 176, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("REGISTRO DE USUARIO");
		lblNewLabel.setFont(new Font("Ebrima", Font.BOLD, 14));
		lblNewLabel.setBounds(144, 46, 153, 29);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(162, 133, 176, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(162, 164, 176, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombre.setBounds(78, 102, 54, 20);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCorreo.setBounds(78, 133, 54, 20);
		frame.getContentPane().add(lblCorreo);
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setFont(new Font("Arial", Font.PLAIN, 12));
		lblContrasea.setBounds(78, 164, 81, 20);
		frame.getContentPane().add(lblContrasea);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.setBounds(144, 211, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(260, 211, 89, 23);
		frame.getContentPane().add(btnCancelar);
	}
}
