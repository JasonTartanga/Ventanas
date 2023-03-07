package ventanas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Pregunta8 extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton btnContinuar;
	private JLabel lblNewLabel_1;
	private JComboBox<String> bebidas;

	public Pregunta8(Pregunta7 main, boolean b, int numCorrecto) {
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

		lblNewLabel_1 = new JLabel("Cual es la bebida alcholica favorita de Álvaro?");
		lblNewLabel_1.setFont(new Font("Serif", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(51, 45, 332, 24);
		getContentPane().add(lblNewLabel_1);

		bebidas = new JComboBox();
		bebidas.setSelectedIndex(-1);
		bebidas.setBounds(124, 114, 186, 22);
		getContentPane().add(bebidas);
		bebidas.addItem("RonCola");
		bebidas.addItem("43 RedBull");
		bebidas.addItem("Cerveza");
		bebidas.addItem("Vozka Naranja");
		bebidas.addItem("43 Cola");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnContinuar)) {
			continuar();
		}

	}

	private void continuar() {
		int numCorrecto = 0;
		if (bebidas.getSelectedIndex() == 1) {
			numCorrecto++;
			System.out.println("8. Correcto");
		}
		Pregunta9 pre = new Pregunta9(this, true, numCorrecto);
		this.dispose();
		pre.setVisible(true);
	}
}
