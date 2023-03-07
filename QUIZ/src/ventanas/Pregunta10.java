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

public class Pregunta10 extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton btnContinuar;
	private JLabel lblNewLabel_1;
	private JTextField nombre;

	public Pregunta10(Pregunta9 main, boolean b, int numCorrecto) {
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

		lblNewLabel_1 = new JLabel("Quien es el mejor amigo de Álvaro");
		lblNewLabel_1.setFont(new Font("Serif", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(92, 41, 250, 24);
		getContentPane().add(lblNewLabel_1);
		
		nombre = new JTextField();
		nombre.setBounds(92, 106, 250, 35);
		getContentPane().add(nombre);
		nombre.setColumns(10);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnContinuar)) {
			continuar();
		}

	}

	private void continuar() {
		int numCorrecto = 0;

		if (!nombre.getText().equalsIgnoreCase("Jason")) {
			numCorrecto++;
			System.out.println("10. Correcto");
		}
		Resultado res = new Resultado(this, true, numCorrecto);
		this.dispose();
		res.setVisible(true);
	}

}
