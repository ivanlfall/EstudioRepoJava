package AppGraficas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.security.KeyStore;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import Moldes.*;



public class Eventos_Multiples {

	public static void main(String[] args) {
	
		CreandoMarco marcoNuevo = new CreandoMarco("Eventos Multiples", new LaminaEventosMultiples());
		
		
		
		marcoNuevo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class LaminaEventosMultiples extends JPanel{
	
	// Generando Acciones
	ActionColor accionVerde = new ActionColor("Verde", new ImageIcon("src/AppGraficas/Iconos/verde.png") , Color.green);
	
	ActionColor accionRojo = new ActionColor("Rojo", new ImageIcon("src/AppGraficas/Iconos/rojo.png") , Color.red);
	
	ActionColor accionAzul = new ActionColor("Azul", new ImageIcon("src/AppGraficas/Iconos/azul.png") , Color.blue);
	
	
	
	public LaminaEventosMultiples() {
		
		add(new JButton(accionVerde)); // Uso constructor con acciones como parametros.
		add(new JButton(accionRojo));
		add(new JButton(accionAzul));
		
		//Se crea el mapa de entrada para cuando el componente tenga el foco
		InputMap mapaDeEntradaInputMap = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		
		// Se crean las combinaciones de teclas
		KeyStroke comboVerde = KeyStroke.getKeyStroke("ctrl V");
		KeyStroke comboRojo = KeyStroke.getKeyStroke("ctrl R");
		KeyStroke comboAzul = KeyStroke.getKeyStroke("ctrl A");
		
		// se agregan las combinaciones con sus correspondientes KEYS
		mapaDeEntradaInputMap.put(comboVerde, "fondo_verde");
		mapaDeEntradaInputMap.put(comboRojo, "fondo_rojo");
		mapaDeEntradaInputMap.put(comboAzul, "fondo_azul");
		
		ActionMap mapaAccion = getActionMap();
		
		// Se asocian las Keys a las acciones antes creadas
		mapaAccion.put("fondo_verde", accionVerde);
		mapaAccion.put("fondo_rojo", accionRojo);
		mapaAccion.put("fondo_azul", accionAzul);
	}
	
	
	// Clase interna de eventos
	private class ActionColor extends AbstractAction{

		public ActionColor(String nombre, Icon icono, Color color_Boton) {
			
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Coloca la lamina de color: " + nombre); 
			putValue("Color_de_Fondo", color_Boton); // Creamos nuestro propio nombre KEY
			
		}
		public void actionPerformed(ActionEvent e) {

			Color colorDeBoton = (Color)getValue("Color_de_Fondo");
			
			setBackground(colorDeBoton);
			
		}
		
		
	} // Cierre ActionColor

}

