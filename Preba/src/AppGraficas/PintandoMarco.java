package AppGraficas;

import javax.swing.*;
import java.awt.*;

public class PintandoMarco {

	public static void main(String[] args) {

		MarcoEscrito miMarco = new MarcoEscrito(400,250);
		miMarco.setTitle("Escrito");
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Film miFilm = new Film();
		
		miMarco.add(miFilm);

	}

}

class MarcoEscrito extends JFrame{
	
	public MarcoEscrito(int alto, int ancho) {
		
		setSize(ancho,alto);
		
		// Centro Marco
		setLocationRelativeTo(null);
		
		setVisible(true);
		
		
	}
	
}

class Film extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g); // indicamos que realialice las acciones por las que fue creado
		
		g.drawString("Insertando Texto", 10, 10);
	}
}