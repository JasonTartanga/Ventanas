package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

public class VentanaMain extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usuario;
	private JButton btnComenzar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMain frame = new VentanaMain();
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
	public VentanaMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(750, 300, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		usuario = new JTextField();
		usuario.setHorizontalAlignment(SwingConstants.CENTER);
		usuario.setFont(new Font("Rockwell", Font.PLAIN, 18));
		usuario.setBounds(107, 98, 220, 35);
		contentPane.add(usuario);
		usuario.setColumns(10);
		
		btnComenzar = new JButton("Comenzar");
		btnComenzar.setBounds(162, 186, 110, 35);
		contentPane.add(btnComenzar);
		btnComenzar.addActionListener(this);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Rockwell", Font.PLAIN, 18));
		lblNewLabel.setBounds(130, 52, 174, 35);
		contentPane.add(lblNewLabel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnComenzar)) {
			continuar();
		}
		
	}

	private void continuar() {
		if(usuario.getText().isBlank()) {
			JOptionPane.showMessageDialog(null, "Introduce un nombre de usuario", "ERROR", 0);
		}else {
			Pregunta1 sig = new Pregunta1(this, true);
			this.setVisible(false);
			sig.setVisible(true);
		}
		
	}

}
