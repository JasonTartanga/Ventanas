package ventanas;

import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Resultado extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField resultado;

	public Resultado(Pregunta10 main, boolean b, int numCorrecto) {
		super(main);
		this.setModal(b);

		setBounds(750, 300, 450, 300);
		getContentPane().setLayout(null);

		resultado = new JTextField(
				"Has acertado " + numCorrecto + "/10 preguntas !!! \n\n Vaya amigo de mierda eres ehh ");
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setEditable(false);
		resultado.setBounds(52, 104, 330, 53);
		getContentPane().add(resultado);
		resultado.setColumns(10);

	}

}
