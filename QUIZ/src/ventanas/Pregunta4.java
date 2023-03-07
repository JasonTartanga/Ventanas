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

public class Pregunta4 extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton btnContinuar;
	private JSlider peso;
	private JLabel porcentaje; 

	public Pregunta4(Pregunta3 pregunta3, boolean b, int numCorrecto) {
		super(pregunta3);
		this.setModal(b);
		
		setBounds(750, 300, 450, 300);
		getContentPane().setLayout(null);

		btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(157, 215, 120, 35);
		getContentPane().add(btnContinuar);
		btnContinuar.addActionListener(this);
		
		porcentaje = new JLabel("0kg");
		porcentaje.setFont(new Font("Serif", Font.PLAIN, 18));
		porcentaje.setBounds(195, 117, 44, 24);
		getContentPane().add(porcentaje);

		peso = new JSlider();
		peso.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				porcentaje();
			}
		});
		peso.setValue(0);
		peso.setMaximum(150);
		peso.setBounds(10, 141, 414, 49);
		getContentPane().add(peso);

		JLabel lblNewLabel = new JLabel("Cuanto pesa Álvaro (kg)");
		lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 18));
		lblNewLabel.setBounds(129, 60, 176, 24);
		getContentPane().add(lblNewLabel);
		btnContinuar.addActionListener(this);
	}

	protected void porcentaje() {
		porcentaje.setText(peso.getValue() + "kg");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnContinuar)) {
			continuar();
		}

	}

	private void continuar() {
		int numCorrecto = 0;

		if(peso.getValue() == 79) {
			numCorrecto++;
			System.out.println("4. Correcto");
		}
		Pregunta5 sig = new Pregunta5(this, true, numCorrecto);
		this.dispose();
		sig.setVisible(true);
	}
}