package ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Listar extends JDialog implements ActionListener{

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private VentanaMain main;
	JButton confirmar;
	JButton salir;

	public Listar(VentanaMain ventana, boolean modal) {
		super(ventana);
		this.setModal(modal);
		
		setTitle("Listar");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 0, 0);
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		{
			JButton confirmar = new JButton("Confirmar");
			confirmar.setBounds(85, 227, 89, 23);
			getContentPane().add(confirmar);
		}
		{
			JButton salir = new JButton("Salir");
			salir.setBounds(259, 227, 89, 23);
			getContentPane().add(salir);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(confirmar)) {
			main = new VentanaMain();
			this.dispose();
			main.setVisible(true);
		}else if(e.getSource().equals(salir)) {
			main = new VentanaMain();
			this.dispose();
			main.setVisible(true);
		}
		
	}

}
