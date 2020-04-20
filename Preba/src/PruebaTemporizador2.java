/*
 * En esta clase ponemos en practica el uso de Clases Internas.
 * Clase interna local la creamos sin modificador de acceso y dentro del metodo donde la vamos a instanciar. 
 * De esta manera podemos crear mayor encapsulamiento
 * 
 */


import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador2 {

	public static void main(String[] args) {

		Reloj miReloj = new Reloj(3000,true);
		
		miReloj.enMarcha(); 
		
		JOptionPane.showMessageDialog(null, "Aceptar para finalizar");

	}

} // Cierre PruebaTemporizador2


class Reloj{
	
	public Reloj(int intervalo, boolean sonido) {
	
		this.intervalo=intervalo;
		this.sonido=sonido;
		
	}
	
	public void enMarcha() {
		
		class DameLaHora2 implements ActionListener{ // Las clases internas local no llevan modf de acceso
			
			public void actionPerformed(ActionEvent e) { 
				
				Date ahora = new Date();
				
				System.out.println("La hora cada 3: " + ahora);
				
				if (sonido==true) { // Podemos acceder al atributo sonido sin necesidad de metodos getter al ser una clase interna.
					Toolkit.getDefaultToolkit().beep();
				}
				
			}
		} // Cierre DameLaHora2, La hemos convertido en clase interna local
		
		ActionListener oyente = new DameLaHora2();
		
		Timer temporizador = new Timer(intervalo, oyente);
		
		temporizador.start();
		
	}
	
	private int intervalo;
	private boolean sonido;
	
	// Comentada clase interna para mostrar clase interna LOCAL
	/* private class DameLaHora2 implements ActionListener{ // Las clases internas pueden tener modf de acceso Private
		
		public void actionPerformed(ActionEvent e) { 
			
			Date ahora = new Date();
			
			System.out.println("La hora cada 3: " + ahora);
			
			if (sonido==true) { // Podemos acceder al atributo sonido sin necesidad de metodos getter al ser una clase interna.
				Toolkit.getDefaultToolkit().beep();
			}
			
		}
	} // Cierre DameLaHora2 */
	
	
}