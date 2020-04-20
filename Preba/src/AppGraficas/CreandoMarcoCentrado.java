package AppGraficas;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		
		MarcoCentrado miMarco = new MarcoCentrado();
		
		miMarco.setTitle("Marco Centrado");
		
		miMarco.setVisible(true);
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

	}

}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado() {
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		Dimension miDimension = miPantalla.getScreenSize();
		
		int alto = miDimension.height;
		
		int ancho = miDimension.width;
		
		setSize(ancho/2, alto/2);
		
		setLocation(ancho/4, alto/4);
		
		Image icono = miPantalla.getImage("src/AppGraficas/icono.gif");
		
		setIconImage(icono);
	}
	
}
