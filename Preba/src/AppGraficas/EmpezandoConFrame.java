/*
 * Vamos a poner en practica la creación de ventanas/marcos extendiendo de la clase JFrame
 */

package AppGraficas;

import java.awt.Frame;

import javax.swing.*;

public class EmpezandoConFrame {

	public static void main(String[] args) {
		
		
		Marco miMarco = new Marco(600,300);
		
		miMarco.setVisible(true); 
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class Marco extends JFrame{
	
	public Marco(int ancho, int alto) {
		
		//setSize(ancho,alto);
		
		//setLocation(400,200);
		
		setBounds(400, 300, 500, 200);
		
		// setResizable(false); // Permite bloquear el maximizado y modificacion de tamaño
		
		// setExtendedState(Frame.MAXIMIZED_BOTH); // Parametro de metodo indica como aparecerá el marco
		
		setTitle("Probando");
	}
}










