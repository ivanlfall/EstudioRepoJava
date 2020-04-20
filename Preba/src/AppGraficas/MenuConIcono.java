package AppGraficas;

import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuConIcono {

	public static void main(String[] args) {
		
		MarconMenuConIcono nuevoMarconMenuConIcono = new MarconMenuConIcono();
		
		nuevoMarconMenuConIcono.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarconMenuConIcono extends JFrame{
	
	public MarconMenuConIcono() {
		
		setTitle("Menú con icono");
		setBounds(0, 0, 500, 300);
		setLocationRelativeTo(null);
		
		add(new LaminaMenuConIcono());
		
		setVisible(true);
	}
}

class LaminaMenuConIcono extends JPanel{
	
	public LaminaMenuConIcono() {

		JMenuBar barraMenu = new JMenuBar();
		
		JMenu menuArchivo = new JMenu("Archivo");
		agregarItem(menuArchivo, "Guardar", "");
		agregarItem(menuArchivo, "Guardar como...", "");
		
		JMenu menuEdicion = new JMenu("Edición");
		agregarItem(menuEdicion, "Copiar", "src/AppGraficas/Iconos/copiar.png");
		agregarItem(menuEdicion, "Cortar", "src/AppGraficas/Iconos/cortar.png");
		agregarItem(menuEdicion, "Pegar", "src/AppGraficas/Iconos/hoja.png");
		
		JMenu menuHerramienta = new JMenu("Herramienta");
		agregarItem(menuHerramienta, "Acerca de...", "");
		

		barraMenu.add(menuArchivo);
		barraMenu.add(menuEdicion);
		barraMenu.add(menuHerramienta);
		
		add(barraMenu);
	}
	
	public void agregarItem (JMenu menu, String nomItem, String pathIcon) {
		
		
		
		JCheckBoxMenuItem item = new JCheckBoxMenuItem(nomItem, new ImageIcon(pathIcon));
		menu.add(item);
	}
}