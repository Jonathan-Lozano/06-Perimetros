import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 * @author Jonathan Lozano
 *
 */
public class VistaPrincipal extends JFrame implements ActionListener {

	private JButton btnCuadrado = new JButton("Cuadrado");
	private JButton btnRectangulo = new JButton("Rectangulo");
	private JButton btnTriangulo = new JButton("Triangulo");
	private JButton btnCirculo = new JButton("Circulo");
	private VistaCuadrado vc = new VistaCuadrado();
	private VistaRectangulo vr = new VistaRectangulo();
	private VistaTriangulo vt = new VistaTriangulo();
	private VistaCirculo vci = new VistaCirculo();
	
	private Container cont = getContentPane();
	
	/**
	 * Contructor para crear una ventana 
	 */
	public VistaPrincipal() {
		super("Menu");
		setSize(240, 220);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cont.setLayout(null);
		
		btnCuadrado.setBounds(10, 10, 200, 30);
		btnCuadrado.addActionListener(this);
		cont.add(btnCuadrado);
		
		btnRectangulo.setBounds(10, 50, 200, 30);
		btnRectangulo.addActionListener(this);
		cont.add(btnRectangulo);
		
		btnTriangulo.setBounds(10, 90, 200, 30);
		btnTriangulo.addActionListener(this);
		cont.add(btnTriangulo);
		
		btnCirculo.setBounds(10, 130, 200, 30);
		btnCirculo.addActionListener(this);
		cont.add(btnCirculo);
	}


	/**
	 * Se instancia un objeto de cada ventana y al precionar un boton se le da visibilidad
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnCuadrado)
			vc.setVisible(true);
		else if (e.getSource() == btnRectangulo)
			vr.setVisible(true);
		else if(e.getSource() == btnTriangulo)
			vt.setVisible(true);
		else if(e.getSource() == btnCirculo)
			vci.setVisible(true);
	}

}
