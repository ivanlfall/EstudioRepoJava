package AppGraficas;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class MenuEmergente {

	public static void main(String[] args) {
		
		MarcoMenuEmergente nuevoEmergente = new MarcoMenuEmergente();
		
		nuevoEmergente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoMenuEmergente extends JFrame{
	
	public MarcoMenuEmergente() {
		
		setTitle("Menu Emergente");
		setBounds(0, 0, 300, 500);
		setLocationRelativeTo(null);
		
		add(new LaminaMenuEmergente());
		
		setVisible(true);
	}
}

class LaminaMenuEmergente extends JPanel{
	
	public LaminaMenuEmergente() {
		
		JPopupMenu menuEmergente = new JPopupMenu();
		
		JMenuItem verItem = new JMenuItem("Ver");
		JMenuItem copiarItem = new JMenuItem("Copiar");
		JMenuItem pegarItem = new JMenuItem("Pegar");
		
		menuEmergente.add(verItem);
		menuEmergente.add(copiarItem);
		menuEmergente.add(pegarItem);
		
		setComponentPopupMenu(menuEmergente);
		
		//add(menuEmergente);
	}
}