
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main (String[] args) {
		
		DameLaHora oyente = new DameLaHora();
		
		Timer miTemporizador = new Timer (5000, oyente);
		
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Aceptar para detener");
	}
	
}


class DameLaHora implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		Date ahora = new Date();
		
		System.out.println("La hs cada 5 seg: " + ahora);
		
		Toolkit.getDefaultToolkit().beep(); // Sonido caracteristico de windows.
	}
}