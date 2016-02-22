import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author Jonathan Lozano
 *
 */
public class VistaCirculo extends JFrame implements ActionListener {

	private JLabel lblDiametro = new JLabel("Ingresa el diametro");
	private JTextField txtDiametro = new JTextField();
	private JButton btnPerimetro = new JButton("Perimetro");
	private JLabel lblResult = new JLabel("El perimetro es: ");
	private Container cont = getContentPane();
	private Perimetro p = new Perimetro();

	/**
	 * Se crea un constructor para crear y dar caracteristicas a una ventana
	 */
	public VistaCirculo() {
		super("Circulo");
		setSize(240, 320);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		cargarControles();
	}

	/**
	 * Carga y agrega los controles a la ventana creada
	 */
	private void cargarControles() {
		cont.setLayout(null);

		lblDiametro.setBounds(10, 10, 210, 30);
		cont.add(lblDiametro);

		txtDiametro.setBounds(10, 40, 210, 30);
		cont.add(txtDiametro);

		btnPerimetro.setBounds(70, 80, 100, 30);
		btnPerimetro.addActionListener(this);
		cont.add(btnPerimetro);

		lblResult.setBounds(10, 120, 210, 30);
		cont.add(lblResult);
	}

	/**
	 * Muestra el resultado en una etiqueta del perimetro al precionar el boton
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		lblResult.setText(String.format("<html>El perimetro del circulo es:<br>%f<html>",
				p.perimetroCirculo(Integer.parseInt(txtDiametro.getText()))));
	}

}
