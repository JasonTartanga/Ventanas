package ventanas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Pregunta9 extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton btnContinuar;

	private JCheckBox a;
	private JCheckBox b;
	private JCheckBox c;
	private JCheckBox d;
	private JCheckBox e;

	public Pregunta9(Pregunta8 main, boolean bol, int numCorrecto) {
		super(main);
		this.setModal(bol);

		setBounds(750, 300, 325, 436);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 0, 0);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);

		btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(94, 351, 120, 35);
		getContentPane().add(btnContinuar);
		btnContinuar.addActionListener(this);

		JLabel lblNewLabel = new JLabel("Cual es la comida favorita de Álvaro?");
		lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 18));
		lblNewLabel.setBounds(82, 49, 270, 24);
		contentPanel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Que sitios jamas pisaria Álvarito?");
		lblNewLabel_1.setFont(new Font("Serif", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(54, 11, 201, 22);
		getContentPane().add(lblNewLabel_1);

		a = new JCheckBox("El altar");
		a.setHorizontalAlignment(SwingConstants.CENTER);
		a.setBounds(106, 65, 97, 23);
		getContentPane().add(a);

		b = new JCheckBox("Una biblioteca");
		b.setHorizontalAlignment(SwingConstants.CENTER);
		b.setBounds(100, 121, 108, 23);
		getContentPane().add(b);

		c = new JCheckBox("Un bar homo");
		c.setHorizontalAlignment(SwingConstants.CENTER);
		c.setBounds(106, 177, 97, 23);
		getContentPane().add(c);

		d = new JCheckBox("MOMA");
		d.setHorizontalAlignment(SwingConstants.CENTER);
		d.setBounds(106, 233, 97, 23);
		getContentPane().add(d);

		e = new JCheckBox("Una marcha feminista");
		e.setHorizontalAlignment(SwingConstants.CENTER);
		e.setBounds(68, 289, 173, 23);
		getContentPane().add(e);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnContinuar)) {
			continuar();
		}

	}

	private void continuar() {
		JCheckBox[] correctas = { a, b, c, d, e };
		int numCorrecto = 0;
		int clicadas = 0;
		for (int i = 0; i < correctas.length; i++) {
			if (correctas[i].isSelected()) {
				clicadas++;
			}
		}

		if (clicadas == 5) {
			numCorrecto++;
			System.out.println("9. Correcto");
		}
		Pregunta10 pre = new Pregunta10(this, true, numCorrecto);
		this.dispose();
		pre.setVisible(true);
	}
}
