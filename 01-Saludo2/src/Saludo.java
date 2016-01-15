
/**
 * Daniela Garcia
 */
import javax.swing.JOptionPane;

/**
 * 
 * Se crean dos variables de tipo String y se les asigna un valor
 *
 */
public class Saludo{
	public static void main(String[] args) {
		String nombre= "Daniela";
		String edad="22" ;
		//System.out.println("Hola" +nombre); 
		
	/**
	 * Se manda a imprimir la linea concatenando las dos variables creadas.
	 */
		
		//System.out.printf("Hola :%s",nombre); // evita saturar la memoria RAM
		JOptionPane.showMessageDialog(null,String.format("hola: %s tu edad es %s", nombre));
		
		
	}

}
