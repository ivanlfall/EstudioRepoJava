package AppGraficas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Eventos_MultiplesOyentes {

	public static void main(String[] args) {
		
		MarcoMultiplesOyentes nuevoMarcoMultiplesOyentes = new MarcoMultiplesOyentes();
		
		nuevoMarcoMultiplesOyentes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoMultiplesOyentes extends JFrame{
	
	public MarcoMultiplesOyentes() {
		
		setTitle("Multiples Oyentes");
		setBounds(0, 0, 300, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		add(new LaminaMultiplesOyentes());
		
	}
}

class LaminaMultiplesOyentes extends JPanel{
	
	JButton botonCerrarTodo;
	
	public LaminaMultiplesOyentes() {
		
		JButton botonNuevo = new JButton("Nuevo");
		add(botonNuevo);
		
		botonCerrarTodo = new JButton("Cerrar Todo");
		add(botonCerrarTodo);
		
		botonNuevo.addActionListener(new NuevoOyente());
		
	}
	
	private class NuevoOyente implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			new VentanaEmergente(botonCerrarTodo);
			
		}
		
		
	}
}

class VentanaEmergente extends MarcoMultiplesOyentes{
	
	private static int contadorVentana = 0;
		
	public VentanaEmergente(JButton boton) {
		
		super();
		contadorVentana++;
		setTitle("Ventana " + contadorVentana);
		setLocation(40*contadorVentana, 40*contadorVentana);
		
		boton.addActionListener(new CerrarTodo());
	}
	
	private class CerrarTodo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			dispose();
			
		}
		
		
	}
}