package ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class Pregunta2 extends JDialog implements ActionListener {

	private JFormattedTextField fecha;
	private static final long serialVersionUID = 1L;
	private JButton btnContinuar;

	public Pregunta2(Pregunta1 pregunta1, boolean b, int numCorrecto) {
		setBounds(750, 300, 450, 300);
		getContentPane().setLayout(null);

		btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(157, 215, 120, 35);
		getContentPane().add(btnContinuar);
		btnContinuar.addActionListener(this);

		fecha = new JFormattedTextField();
		fecha.setFont(new Font("Serif", Font.PLAIN, 18));
		fecha.setBounds(137, 106, 160, 35);
		getContentPane().add(fecha);

		JLabel lblNewLabel = new JLabel("Que dia nacio Álvaro?");
		lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 18));
		lblNewLabel.setBounds(137, 41, 160, 24);
		getContentPane().add(lblNewLabel);

		int numero = numCorrecto;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnContinuar)) {
			continuar();
		}

	}

	private void continuar() {
		int numCorrecto = 0;

		if (fecha.getText().equals("08/02/2001") || fecha.getText().equals("08-02-2001")) {
			numCorrecto++;
			System.out.println("2. Correcto");
		}

		Pregunta3 sig = new Pregunta3(this, true, numCorrecto);
		this.dispose();
		sig.setVisible(true);
	}
}
