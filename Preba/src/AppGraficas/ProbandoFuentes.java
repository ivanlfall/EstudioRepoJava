package AppGraficas;

import javax.swing.*;
import java.awt.*;



public class ProbandoFuentes {
	
	public static void main(String[] args) {
		
		MarcoConFuente miMarco = new MarcoConFuente(200, 300);
		
		LaminaConFuente miLamina = new LaminaConFuente();
		
		miMarco.add(miLamina);
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoConFuente extends JFrame{
	
	public MarcoConFuente(int ancho, int alto){
		
		setSize(ancho, alto);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}

class LaminaConFuente extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Font miFuente = new Font("Arial", Font.BOLD, 15);
		
		g2.setColor(Color.GREEN.darker());
		
		g2.setFont(miFuente);
		
		g2.drawString("Ivan", 50, 50);
		
	}
	
	
}
