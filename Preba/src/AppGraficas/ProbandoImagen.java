package AppGraficas;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ProbandoImagen {

	public static void main(String[] args) {
		
		MarcoConImagen miMarco = new MarcoConImagen();
		
		LaminaConImagen miLamina = new LaminaConImagen();
		
		miMarco.add(miLamina);
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConImagen extends JFrame{
	
	public MarcoConImagen() {
		
		setSize(800, 500);
		setLocationRelativeTo(null);
		setVisible(true);
		setTitle("Con Imagen");
	}
}

class LaminaConImagen extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		// Guardo ruta de imagen en Obj tipo File
		File miImagen = new File("src/AppGraficas/tesla.jpg"); 
		
		// Se genera try para metodo ImageIO.read()
		try {
			imagen=ImageIO.read(miImagen); // Metodo para leer imagen y almacenarla en var tipo Image
		}
		catch(IOException e) { // Tipo de excepcion que puede arrojar entre parentesis
			
			System.out.println("Ha ocurrido un error. Archivo no encontrado");
		}
		
		// Dibujo imagen en componente (g)
		g.drawImage(imagen, 15, 15, null);
	}
	
	private Image imagen;
}