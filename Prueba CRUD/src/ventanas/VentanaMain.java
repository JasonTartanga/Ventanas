package ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaMain extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Introducir intro;
	private Modificar modi;
	@SuppressWarnings("unused")
	private Listar list;
	private Eliminar elim;

	JButton introducir;
	JButton modificar;
	JButton listar;
	JButton eliminar;

	public static void main(String[] args) {
		try {
			VentanaMain dialog = new VentanaMain();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public VentanaMain() {
		setTitle("Main");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		introducir = new JButton("Introducir");
		introducir.setBounds(10, 12, 207, 119);
		contentPane.add(introducir);
		introducir.addActionListener(this);

		modificar = new JButton("Modificar");
		modificar.setBounds(217, 12, 207, 119);
		contentPane.add(modificar);
		modificar.addActionListener(this);

		listar = new JButton("Listar");
		listar.setBounds(10, 131, 207, 119);
		contentPane.add(listar);
		listar.addActionListener(this);

		eliminar = new JButton("Eliminar");
		eliminar.setBounds(217, 131, 207, 119);
		contentPane.add(eliminar);
		eliminar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(introducir)) {
			introducir();
		} else if (e.getSource().equals(modificar)) {
			modificar();
		} else if (e.getSource().equals(listar)) {
			listar();
		} else if (e.getSource().equals(eliminar)) {
			eliminar();
		}

	}

	protected void eliminar() {
		elim = new Eliminar(this, true);
		this.dispose();
		elim.setVisible(true);
	}

	protected void listar() {
		list = new Listar(this, true);
		this.dispose();
		list.setVisible(true);
	}

	protected void modificar() {
		modi = new Modificar(this, true);
		this.dispose();
		modi.setVisible(true);
	}

	protected void introducir() {
		intro = new Introducir(this, true);
		this.dispose();
		intro.setVisible(true);
	}
}
