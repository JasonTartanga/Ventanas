package ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;

public class Pregunta2 extends JDialog implements ActionListener{


	private static final long serialVersionUID = 1L;
	private JButton btnContinuar;


	public Pregunta2(Pregunta1 pregunta1, boolean b, int numCorrecto) {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(157, 215, 120, 35);
		getContentPane().add(btnContinuar);
		btnContinuar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnContinuar)) {
			
		}
		
	}
}
