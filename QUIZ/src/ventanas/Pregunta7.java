package ventanas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.border.EmptyBorder;

public class Pregunta7 extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton btnContinuar;
	private JSpinner numero;

	public Pregunta7(Pregunta6 main, boolean b, int numCorrecto) {
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

		JLabel lblNewLabel = new JLabel("Cual es la comida favorita de Álvaro?");
		lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 18));
		lblNewLabel.setBounds(82, 49, 270, 24);
		contentPanel.add(lblNewLabel);

		numero = new JSpinner();
		numero.setFont(new Font("Serif", Font.PLAIN, 18));
		numero.setBounds(197, 110, 39, 35);
		getContentPane().add(numero);

		JLabel lblNewLabel_1 = new JLabel("Cual es el numero favorito de Álvaro");
		lblNewLabel_1.setFont(new Font("Serif", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(84, 43, 266, 24);
		getContentPane().add(lblNewLabel_1);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnContinuar)) {
			continuar();
		}

	}

	private void continuar() {
		int numCorrecto = 0;
		if (numero.getValue().equals(7)) {
			numCorrecto++;
			System.out.println("7. Correcto");
		}
		Pregunta8 pre = new Pregunta8(this, true, numCorrecto);
		this.dispose();
		pre.setVisible(true);
	}
}
