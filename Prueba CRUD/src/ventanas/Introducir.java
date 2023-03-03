package ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;

public class Introducir extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private VentanaMain main;

	JButton confirmar;
	JButton salir;

	public Introducir(VentanaMain ventana, boolean modal) {
		super(ventana);
		this.setModal(modal);
		
		setTitle("Introducir");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			confirmar = new JButton("Confirmar");
			confirmar.setBounds(85, 227, 89, 23);
			getContentPane().add(confirmar);
			confirmar.addActionListener(this);
		}
		{
			salir = new JButton("Salir");
			salir.setBounds(259, 227, 89, 23);
			getContentPane().add(salir);
			salir.addActionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(confirmar)) {
			main = new VentanaMain();
			this.dispose();
			main.setVisible(true);
		} else if (e.getSource().equals(salir)) {
			main = new VentanaMain();
			this.dispose();
			main.setVisible(true);
		}

	}

}
