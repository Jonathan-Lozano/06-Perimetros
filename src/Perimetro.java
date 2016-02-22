/**
 * 
 * @author Jonathan Lozano
 *
 */
public class Perimetro {

	/**
	 * 
	 * @param lado
	 * @return Calcula el perimetro de un cuadrado recibiendo como parametro el
	 *         valor del lado
	 */
	public int perimetroCuadrado(int lado) {
		return 4 * lado;
	}

	/**
	 * 
	 * @param base
	 * @param altura
	 * @return Calcula el perimetro de un rectangulo recibiendo como parametro
	 *         la base y la altura
	 */
	public float perimetroRectangulo(float base, float altura) {
		return (2 * base) + (2 * altura);
	}

	/**
	 * 
	 * @param lados
	 * @return Calcula el perimetro de un trinagulo equilatero recibiendo como
	 *         parametro el valor de los lados
	 */
	public float perimetroTrianguloEquilatero(float lados) {
		return 3 * lados;
	}

	/**
	 * 
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 * @return Calcula el perimetro de un trinagulo escaleno recibiendo como
	 *         parametro el valor de cada lado
	 */
	public float perimetroTrianguloEscaleno(float lado1, float lado2, float lado3) {
		return lado1 + lado2 + lado3;
	}

	/**
	 * 
	 * @param lados
	 * @param base
	 * @return Calcula el perimetro de un trinagulo isoseles recibiendo como
	 *         parametro el valor de los lados y la base
	 */
	public float perimetroTrianguloIsoseles(float lados, float base) {
		return 2 * lados + base;
	}

	/**
	 * 
	 * @param diametro
	 * @return Calcula el perimetro de un circulo recibiendo el valor del
	 *         diametro
	 */
	public double perimetroCirculo(float diametro) {
		return (3.1416 * diametro);
	}

}
