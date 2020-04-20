package AppGraficas;

import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Eventos_Mouse {

	public static void main(String[] args) {
		
		MarcoMouse nuevoMarcoMouse = new MarcoMouse();
		
		nuevoMarcoMouse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoMouse extends JFrame{
	
	public MarcoMouse() {
		
		setTitle("Marco Evento Mouse");
		setBounds(0, 0, 300, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		addMouseMotionListener(new MouseEvento());
	}
}

class MouseEvento implements MouseMotionListener{

	

	@Override
	public void mouseDragged(MouseEvent e) {
		
		System.out.println("Se está arrastrando");
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		System.out.println("Se está Moviendo el Mouse");
		
	}
	
	
}