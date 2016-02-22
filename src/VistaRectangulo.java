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
public class VistaRectangulo extends JFrame implements ActionListener {

	private JLabel lblBase = new JLabel("Ingresa la base");
	private JLabel lblAltura = new JLabel("Ingresa la altura");
	private JLabel lblResult = new JLabel("El perimetro es: ");
	private JTextField txtBase = new JTextField();
	private JTextField txtAltura = new JTextField();
	private JButton btnPerimetro = new JButton("Perimetro");
	private Container cont = getContentPane();
	private Perimetro p = new Perimetro();

	/**
	 * Contructor para crear una ventana
	 */
	public VistaRectangulo() {
		super("Rectangulo");
		setSize(260, 320);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		cargarControles();
	}

	/**
	 * Metodo que carga los controles a la ventana
	 */
	private void cargarControles() {
		cont.setLayout(null);

		lblBase.setBounds(10, 10, 230, 30);
		cont.add(lblBase);

		txtBase.setBounds(10, 50, 230, 30);
		cont.add(txtBase);

		lblAltura.setBounds(10, 90, 230, 30);
		cont.add(lblAltura);

		txtAltura.setBounds(10, 130, 230, 30);
		cont.add(txtAltura);

		btnPerimetro.setBounds(80, 170, 100, 30);
		btnPerimetro.addActionListener(this);
		cont.add(btnPerimetro);

		lblResult.setBounds(10, 210, 230, 50);
		cont.add(lblResult);
	}

	/**
	 * Se muestra el perimetro de un rectangulo al precionar el boton
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		float base = Float.parseFloat(txtBase.getText());
		float altura = Float.parseFloat(txtAltura.getText());
		lblResult.setText(String.format("El perimetro del triangulo es: %f", p.perimetroRectangulo(base, altura)));
	}
}
