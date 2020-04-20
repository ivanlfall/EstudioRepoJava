package AppGraficas;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.*;


public class CuadroTexto_II {

	public static void main(String[] args) {
		
		MarcoCuadroTextoII nuevoCuadroTextoII = new MarcoCuadroTextoII();
		
		nuevoCuadroTextoII.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class MarcoCuadroTextoII extends JFrame{
	
	public MarcoCuadroTextoII(){
		
		setTitle("Cuadro Texto");
		setBounds(0, 0, 300, 200);
		setLocationRelativeTo(null);
		
		add(new LaminaCuadroTextoII());
		setVisible(true);
		
	}
}

class LaminaCuadroTextoII extends JPanel{
	
	public LaminaCuadroTextoII() {
		
		JTextField texto = new JTextField(20);
		
		Document miDocument = texto.getDocument(); // Obtenemos documento para mas tarde ponerlo a la escucha 
		
		miDocument.addDocumentListener(new EscuchaTexto());
		
		
		add(texto);
	}
	
	private class EscuchaTexto implements DocumentListener{

		
		public void changedUpdate(DocumentEvent e) {
			
		}

		
		public void insertUpdate(DocumentEvent e) {
			
			setBackground(new Color(223, 164, 87));
			
		}

		
		public void removeUpdate(DocumentEvent e) {
			
			setBackground(new Color(131, 205, 119));
			
		}
		
		
	}
}
