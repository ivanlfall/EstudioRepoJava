package AppGraficas;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class Eventos_Ventana2 {

	public static void main(String[] args) {
		
		MarcoEvento nuevoMarcoEvento = new MarcoEvento();
		nuevoMarcoEvento.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoEvento extends JFrame{
	
	public MarcoEvento() {
		
		setTitle("Eventos con Estados");
		setBounds(0, 0, 300, 300);
		setLocationRelativeTo(null); // Centro marco
		setVisible(true);
		
		EstadoCambiado nuevoEstadoCambiado = new EstadoCambiado();
		
		addWindowStateListener(nuevoEstadoCambiado);
	}
}

class EstadoCambiado implements WindowStateListener{

	
	public void windowStateChanged(WindowEvent e) {
		
		System.out.println("Pasa " + e.getNewState() + "Estaba " + e.getOldState());
		if (e.getNewState()==JFrame.MAXIMIZED_BOTH) {
			
			System.out.println("La ventana fué maximizada");
			// System.exit(0); //Instruccion que finaliza Programa
		}
	}
	
	
}