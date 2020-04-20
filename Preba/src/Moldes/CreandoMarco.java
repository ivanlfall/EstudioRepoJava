package Moldes;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CreandoMarco extends JFrame{

	public CreandoMarco(String title) {
		
		setTitle(title);
		setBounds(0, 0, 300, 300);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public CreandoMarco (String title, JPanel lamina) {
		
		setTitle(title);
		setBounds(0, 0, 300, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		add(lamina);
		
	}
}
