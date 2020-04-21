package AppGraficas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;



public class BarraDeHerramientas {

	public static void main(String[] args) {
		
		MarcoBarraDeHerramientas nuevoMarcoBarraDeHerramientas = new MarcoBarraDeHerramientas();
		
		nuevoMarcoBarraDeHerramientas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBarraDeHerramientas extends JFrame{
	
	LaminaMenuBar laminaMenuBar;
	
	public MarcoBarraDeHerramientas() {

		setTitle("Barra de Herramientas");
		setBounds(0, 0, 500, 300);
		setLocationRelativeTo(null);
		
		laminaMenuBar = new LaminaMenuBar();
		add(laminaMenuBar);
		
		// Generando Acciones
		ActionColor accionVerde = new ActionColor("Verde", new ImageIcon("src/AppGraficas/Iconos/verde.png") , Color.green);
		
		ActionColor accionRojo = new ActionColor("Rojo", new ImageIcon("src/AppGraficas/Iconos/rojo.png") , Color.red);
		
		ActionColor accionAzul = new ActionColor("Azul", new ImageIcon("src/AppGraficas/Iconos/azul.png") , Color.blue);
		
		
		JMenu menu = new JMenu("Color");
		
		menu.add(accionVerde);
		menu.add(accionRojo);
		menu.add(accionAzul);
		
		JMenuBar barraMenu = new JMenuBar();
		
		barraMenu.add(menu);
		
		setJMenuBar(barraMenu);
		
		setVisible(true);
		
		// Construimos barra de Herramientas.
		
		JToolBar barraHerramientas = new JToolBar();
		
		barraHerramientas.add(accionVerde);
		barraHerramientas.add(accionRojo);
		barraHerramientas.add(accionAzul);
		
		barraHerramientas.addSeparator();
		
		barraHerramientas.add(new AbstractAction("Salir", new ImageIcon("src/AppGraficas/Iconos/salir.png")) {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		
		add(barraHerramientas, BorderLayout.NORTH);
	}
	
	private class ActionColor extends AbstractAction{

		public ActionColor(String nombre, Icon icono, Color color_Boton) {
			
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Coloca la lamina de color: " + nombre); 
			putValue("Color_de_Fondo", color_Boton); // Creamos nuestro propio nombre KEY
			
		}
		public void actionPerformed(ActionEvent e) {

			Color colorDeBoton = (Color)getValue("Color_de_Fondo");
			
			laminaMenuBar.setBackground(colorDeBoton);
			
		}
		
		
	} // Cierre ActionColor
}

class LaminaMenuBar extends JPanel{
	
	public LaminaMenuBar(){
		
		
	}
}