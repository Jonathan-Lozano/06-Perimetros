import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * 
 * @author Jonathan Lozano
 *
 */
public class VistaTriangulo extends JFrame implements ActionListener {

	private JLabel lblLado1 = new JLabel("Ingresa el lado 1");
	private JLabel lblLado2 = new JLabel("Ingresa el lado 2");
	private JLabel lblLado3 = new JLabel("Ingresa el lado 3");

	private Object[] model = { "Selecciona el tipo de triangulo", "Equilatero", "Escaleno", "Isoseles" };
	private JComboBox cmbTipoTriangulo = new JComboBox(model);

	private JTextField txtLado1 = new JTextField();
	private JTextField txtLado2 = new JTextField();
	private JTextField txtLado3 = new JTextField();

	private JButton btnPerimetro = new JButton("Perimetro");

	private JLabel result = new JLabel("El perimetro del triangulo es: ");

	private Container cont = getContentPane();

	private Perimetro p = new Perimetro();

	/**
	 * Contructor para crear una ventana
	 */
	public VistaTriangulo() {
		super("Triangulo");
		setSize(260, 370);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		cargarControles();
	}

	/**
	 * Metodo que carga los controles a la ventana
	 */
	private void cargarControles() {
		cont.setLayout(null);

		cmbTipoTriangulo.setBounds(10, 10, 210, 30);
		cmbTipoTriangulo.addActionListener(this);
		cont.add(cmbTipoTriangulo);

		btnPerimetro.setBounds(70, 230, 100, 30);
		btnPerimetro.addActionListener(this);
		cont.add(btnPerimetro);

		result.setBounds(10, 260, 210, 70);
		cont.add(result);

	}

	/**
	 * Se agregan controles segun la opcion que se seleccione
	 */
	public void labels() {
		JLabel[] lbls = { lblLado1, lblLado2, lblLado3 };
		JTextField[] txts = { txtLado1, txtLado2, txtLado3 };

		if (cmbTipoTriangulo.getSelectedIndex() == 0) {
			for (int i = 0; i < 3; i++) {
				if (lbls[i].isVisible() == true) {
					cont.remove(lbls[i]);
					cont.remove(txts[i]);
				}
			}
			this.repaint();
			JOptionPane.showMessageDialog(null, "Selecciona el tipo de triangulo");
			result.setText("El perimetro del triangulo es:");
		}

		else if (cmbTipoTriangulo.getSelectedIndex() == 1) {
			for (int i = 0; i < 3; i++) {
				if (lbls[i].isVisible() == true) {
					cont.remove(lbls[i]);
					cont.remove(txts[i]);
				}
			}

			this.repaint();
			lbls[0].setBounds(10, 40, 210, 30);
			lbls[0].setText("Ingresa el valor de los lados");
			cont.add(lbls[0]);

			txts[0].setBounds(10, 70, 210, 30);
			cont.add(txts[0]);

			result.setText("El perimetro del triangulo es:");
		}

		else if (cmbTipoTriangulo.getSelectedIndex() == 2) {
			for (int i = 0; i < 3; i++) {
				if (lbls[i].isVisible() == true) {
					cont.remove(lbls[i]);
					cont.remove(txts[i]);
				}
			}

			this.repaint();

			lbls[0].setBounds(10, 40, 210, 30);
			lbls[0].setText("Ingresa el lado 1 del triangulo");
			cont.add(lbls[0]);

			txts[0].setBounds(10, 70, 210, 30);
			cont.add(txts[0]);

			lbls[1].setBounds(10, 100, 210, 30);
			lbls[1].setText("Ingresa el lado 2 del triangulo");
			cont.add(lbls[1]);

			txts[1].setBounds(10, 130, 210, 30);
			cont.add(txts[1]);

			lbls[2].setBounds(10, 160, 210, 30);
			lbls[2].setText("Ingresa el lado 3 del triangulo");
			cont.add(lbls[2]);

			txts[2].setBounds(10, 190, 210, 30);
			cont.add(txts[2]);

			result.setText("El perimetro del triangulo es:");
		}

		else if (cmbTipoTriangulo.getSelectedIndex() == 3) {
			for (int i = 0; i < 3; i++) {
				if (lbls[i].isVisible() == true) {
					cont.remove(lbls[i]);
					cont.remove(txts[i]);
				}
			}

			this.repaint();

			lbls[0].setBounds(10, 40, 210, 30);
			lbls[0].setText("Ingresa los lados del triangulo");
			cont.add(lbls[0]);

			txts[0].setBounds(10, 70, 210, 30);
			cont.add(txts[0]);

			lbls[1].setBounds(10, 100, 210, 30);
			lbls[1].setText("Ingresa la base del triangulo");
			cont.add(lbls[1]);

			txts[1].setBounds(10, 130, 210, 30);
			cont.add(txts[1]);

			result.setText("El perimetro del triangulo es:");
		}
	}

	/**
	 * Se ejecutan un metodo segun el boton o control que se seleccione
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cmbTipoTriangulo) {
			labels();
		} else if (e.getSource() == btnPerimetro) {
			perimetro();
		}
	}

	/**
	 * Se muestran los resultados del perimetro segun la opcion que se
	 * seleccione
	 */
	private void perimetro() {
		if (cmbTipoTriangulo.getSelectedIndex() == 1) {
			result.setText(String.format("<html><body>El perimetro del triangulo Equilatero es: %f</body></html>",
					p.perimetroTrianguloEquilatero(Integer.parseInt(txtLado1.getText()))));
		} else if (cmbTipoTriangulo.getSelectedIndex() == 2) {
			result.setText(String.format("<html><body>El perimetro del triangulo Escaleno es: %f</body></html>",
					p.perimetroTrianguloEscaleno(Integer.parseInt(txtLado1.getText()),
							Integer.parseInt(txtLado2.getText()), Integer.parseInt(txtLado3.getText()))));
		} else if (cmbTipoTriangulo.getSelectedIndex() == 3) {
			result.setText(String.format("<html><body>El perimetro del triangulo Isoseles es: %f</body></html>",
					p.perimetroTrianguloIsoseles(Integer.parseInt(txtLado1.getText()),
							Integer.parseInt(txtLado2.getText()))));
		} else {
			JOptionPane.showMessageDialog(null, "Selecciona el tipo de triangulo");
		}
	}
}
