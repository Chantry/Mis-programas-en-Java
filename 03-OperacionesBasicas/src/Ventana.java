import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ventana  extends JFrame implements ActionListener{
	
/**
 * Se crea las cajas de texto y botones
 */
	private JTextField txtN1= new JTextField();
	private JTextField txtN2= new JTextField();
	
	private JLabel lbN1 = new JLabel("Numero 1");
	private JLabel lbN2 = new JLabel("Numero 2");
	private JLabel lbnResultado = new JLabel("Numero 3");
	
	private JButton btnCalcular = new JButton("Calcular");
	private Container c = getContentPane(); // este es el contenedor de la ventana
	
	private Operaciones op = new Operaciones();
	
	
	public Ventana(){
		
 super.setTitle("Operaciones");	//titutlo de la ventana
 super.setSize(320, 420); //tamaño de la ventana
 super.setDefaultCloseOperation(EXIT_ON_CLOSE); // agrega la opcion de cerrar a ventana
 cargarControles(); //metodo que sirve para cargar todos los controles 
	
	
	
	}

/**
 * Metodo que tiene la funcion de cargar los controles.
 */
	
	private void cargarControles() {
		c.setLayout(null);
		lbN1.setBounds(10,10,280,30);
		txtN1.setBounds(10,40,280, 30);
		
		lbN2.setBounds(10,80, 280,30);
		txtN2.setBounds(10,110,280, 30);
		
		btnCalcular.setBounds(10, 150, 280, 30);
		lbnResultado.setBounds(10, 180, 280, 30);
			
		c.add(lbN1);
		c.add(txtN1);
		c.add(lbN2);
		c.add(txtN2);
		c.add(btnCalcular);
		c.add(lbnResultado);
		btnCalcular.addActionListener(this);
		
		
		
	}

/**
 *  Metodo en donde se manda a llamar el objeto que contiene la clase "Operaciones" y se imprime el resultado.
 */
	
	public void actionPerformed(ActionEvent arg0) {
		int r = op.sumar(Integer.parseInt(txtN1.getText()),Integer.parseInt(txtN2.getText()));
		lbnResultado.setText(String.format("%s + %s =%d",
			txtN1.getText(),
			txtN2.getText(),
			r));
	
		
	}
	
		
}
