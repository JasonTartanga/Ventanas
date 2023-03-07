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

public class Pregunta6 extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton btnContinuar;
	private JLabel lblNewLabel_1;
	private JTextField color;

	public Pregunta6(Pregunta5 main, boolean b, int numCorrecto) {
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
		
		lblNewLabel_1 = new JLabel("Cual es el color favorito de Álvaro?");
		lblNewLabel_1.setFont(new Font("Serif", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(89, 39, 255, 24);
		getContentPane().add(lblNewLabel_1);
		
		color = new JTextField();
		color.setFont(new Font("Serif", Font.PLAIN, 18));
		color.setBounds(89, 100, 255, 45);
		getContentPane().add(color);
		color.setColumns(10);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnContinuar)) {
			continuar();
		}

	}

	private void continuar() {
		int numCorrecto = 0;

		if (color.getText().equalsIgnoreCase("Rosa")) {
			numCorrecto++;
			System.out.println("6. Correcto");
		}
		Pregunta7 pre = new Pregunta7(this, true, numCorrecto);
		this.dispose();
		pre.setVisible(true);
	}

}
