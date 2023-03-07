package ventanas;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Pregunta1 extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField respuesta;
	private JButton btnContinuar;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	public Pregunta1(VentanaMain main, boolean modal) {
		super(main);
		this.setModal(modal);

		setBounds(750, 275, 440, 534);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Como se llama?");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Rockwell", Font.PLAIN, 12));
			lblNewLabel.setBounds(5, 461, 99, 22);
			contentPanel.add(lblNewLabel);
		}
		{
			respuesta = new JTextField();
			respuesta.setHorizontalAlignment(SwingConstants.LEFT);
			respuesta.setFont(new Font("Rockwell", Font.PLAIN, 12));
			respuesta.setColumns(10);
			respuesta.setBounds(109, 461, 221, 22);
			contentPanel.add(respuesta);
		}
		{
			btnContinuar = new JButton("Continuar");
			btnContinuar.setBounds(335, 461, 81, 23);
			contentPanel.add(btnContinuar);
			{
				lblNewLabel_1 = new JLabel("");
				lblNewLabel_1.setBounds(173, 62, 46, 14);
				contentPanel.add(lblNewLabel_1);
			}
			{
				lblNewLabel_2 = new JLabel("");
				lblNewLabel_2.setIcon(new ImageIcon(Pregunta1.class.getResource("/recursos/alvaro.png")));
				lblNewLabel_2.setBounds(10, 11, 406, 439);
				contentPanel.add(lblNewLabel_2);
			}
			btnContinuar.addActionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnContinuar)) {
			continuar();
		}

	}

	private void continuar() {
		String[] respuestasValidas = { "Alvaro", "Álvaro", "Alvarito", "Moro" };
		boolean correcto = false;
		int numCorrecto = 0;

		for (int i = 0; i < respuestasValidas.length; i++) {
			if (respuesta.getText().equalsIgnoreCase(respuestasValidas[i])) {
				correcto = true;

			}
		}
		if (correcto) {
			numCorrecto++;
			System.out.println("1. Correcto");
		}
		Pregunta2 sig = new Pregunta2(this, true, numCorrecto);
		this.dispose();
		sig.setVisible(true);
	}

}