package AppGraficas;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Eventos_Ventana {

	public static void main(String[] args) {
		
		MarcoEventoVentana nuevoMarcoEventoVentana = new MarcoEventoVentana();
		nuevoMarcoEventoVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoEventoVentana extends JFrame{
	
	public MarcoEventoVentana() {
		
		setTitle("Eventos Ventana");
		setBounds(500, 200, 300, 300);
		setVisible(true);
		
		M_Ventana oyenteVentana = new M_Ventana();
		
		addWindowListener(oyenteVentana);
	}
}

class M_Ventana extends WindowAdapter{

// Extendiendo de WindowAdapter podemos sobreescribir solo el metodo a utilizar de "WindowListener"
	public void windowIconified(WindowEvent e) {
		
		System.out.println("Ventana minimizada");
		
	}
	
}


