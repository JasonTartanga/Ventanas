package ventanas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Pregunta5 extends JDialog implements ActionListener{

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField comida;
	private JButton btnContinuar;
	private JLabel lblNewLabel_1;
	private JTextField textField;


	public Pregunta5(Pregunta4 main, boolean b, int numCorrecto) {
		super(main);
		this.setModal(b);
		
		setBounds(750, 300, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 0, 0);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		

		btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(157, 215, 120, 35);
		getContentPane().add(btnContinuar);
		btnContinuar.addActionListener(this);
		
		
		comida = new JTextField();
		comida.setBounds(82, 106, 270, 40);
		contentPanel.add(comida);
		comida.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Cual es la comida favorita de Álvaro?");
		lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 18));
		lblNewLabel.setBounds(82, 49, 270, 24);
		contentPanel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Cual es la comida favorita de Álvaro?");
		lblNewLabel_1.setFont(new Font("Serif", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(82, 40, 270, 24);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Serif", Font.PLAIN, 18));
		textField.setBounds(82, 104, 270, 41);
		getContentPane().add(textField);
		textField.setColumns(10);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnContinuar)) {
			continuar();
		}
		
	}


	private void continuar() {
		int numCorrecto = 0;
		
		if(comida.getText().equalsIgnoreCase("Hamburguesa")) {
			numCorrecto++;
			System.out.println("5. Correcto");
		}
		Pregunta6 pre = new Pregunta6(this, true, numCorrecto);
		this.dispose();
		pre.setVisible(true);
	}

}
