package AppGraficas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

import sun.awt.AWTAccessor.SystemColorAccessor;

public class DibujandoFrame {

	public static void main(String[] args) {

		MarcoDibujado miMarco = new MarcoDibujado(200, 400);
		miMarco.setTitle("Dibujando");
		
		Lamina nuevaL = new Lamina();
		
		nuevaL.setBackground(SystemColor.window); // Color por defecto de ventanas windows
		
		miMarco.add(nuevaL);
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoDibujado extends JFrame{
	
	public MarcoDibujado(int ancho, int alto) {
		
		setSize(ancho, alto);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
}

class Lamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(10, 10, 150, 100);
		
		g2.setPaint(Color.BLUE);
		
		g2.fill(rectangulo); // Metodo "fill()" pinta la figura.
		
		Ellipse2D elipse = new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo); //Marcamos a elipse que su frame será "rectangulo"
		
		g2.setPaint(new Color(237, 230, 83).brighter()); // Instanciamos un obj Color agregando el color con valores RGB. Metodo "brighter()" da brillo.
		
		g2.fill(elipse);
		
		
		
		
		
		
	}
	
}