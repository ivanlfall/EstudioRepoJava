package AppGraficas;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;





public class Eventos_Teclas {

	public static void main(String[] args) {
		
		MarcoTeclas nuevoMarcoTeclas = new MarcoTeclas();
		nuevoMarcoTeclas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoTeclas extends JFrame{
	
	public MarcoTeclas(){
		
		setTitle("Marco_Teclas");
		setBounds(0, 0, 300, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		addKeyListener(new EventoTeclado());
	}
}

class EventoTeclado implements KeyListener{
	
	
	@Override
	public void keyPressed(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		int codigo = e.getKeyCode();
		
		System.out.println("Codigo de tecla presionada: " + codigo);
		
		if (codigo==KeyEvent.VK_F10) {
			
			System.out.println("No puedes continuar luego de presionar esa tecla");
			System.exit(0);
		}
	}

	@Override
	public void keyReleased(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}