package ventanas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Pregunta3 extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton btnContinuar;
	private JSlider altura;
	JLabel escribir;

	public Pregunta3(Pregunta2 main, boolean b, int numCorrecto) {
		super(main);
		this.setModal(b);

		setBounds(750, 300, 450, 300);
		getContentPane().setLayout(null);

		btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(157, 215, 120, 35);
		getContentPane().add(btnContinuar);
		btnContinuar.addActionListener(this);

		JLabel lblNewLabel = new JLabel("Cuanto mide Álvaro? (cm)");
		lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 18));
		lblNewLabel.setBounds(121, 60, 192, 24);
		getContentPane().add(lblNewLabel);

		escribir = new JLabel("0cm");
		escribir.setFont(new Font("Serif", Font.PLAIN, 18));
		escribir.setBounds(192, 127, 49, 24);
		getContentPane().add(escribir);

		altura = new JSlider();
		altura.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				cambiar();
			}
		});
		altura.setValue(0);
		altura.setMaximum(200);
		altura.setBounds(10, 152, 414, 36);
		getContentPane().add(altura);

	}

	protected void cambiar() {
		escribir.setText(altura.getValue() + "cm");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnContinuar)) {
			continuar();
		}

	}

	private void continuar() {
		int numCorrecto = 0;

		if (altura.getValue() == 182) {
			numCorrecto++;
			System.out.println("3. Correcto");
		}
		
		Pregunta4 sig = new Pregunta4(this, true, numCorrecto);
		this.dispose();
		sig.setVisible(true);
	}
}
