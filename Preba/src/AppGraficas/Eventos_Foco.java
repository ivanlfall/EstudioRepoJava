package AppGraficas;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Eventos_Foco {

	public static void main(String[] args) {
		
		MarcoFoco nuevoMarcoFoco = new MarcoFoco();
		
		
		
		nuevoMarcoFoco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoFoco extends JFrame{
	
	public MarcoFoco(){
		
		setTitle("Eventos de Focos");
		setBounds(0, 0, 300, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		add(new LaminaFoco());
		
		
	}
	
	
}

class LaminaFoco extends JPanel{
	
	public String resultadoCuadroTexto;
	
	public void paintComponent(Graphics g ) {
		
		super.paintComponent(g);
		setLayout(null);
		
		nuevoTextField1 = new JTextField();
		nuevoTextField2 = new JTextField();
		botonValidar = new JButton("Validar");
		
		nuevoTextField1.setBounds(20, 20, 100, 20);
		nuevoTextField2.setBounds(20, 60, 100, 20);
		botonValidar.setBounds(120, 100, 80, 20);
				
		add(nuevoTextField1);
		add(nuevoTextField2);
		add(botonValidar);
		
		EventoFoco nuevoEventos_Foco = new EventoFoco();
		EventoFoco nuevoEventos_Foco2 = new EventoFoco();
		
		nuevoTextField1.addFocusListener(nuevoEventos_Foco);
		nuevoTextField2.addFocusListener(nuevoEventos_Foco2);
	}
	
	JTextField nuevoTextField1;
	JTextField nuevoTextField2; 
	JButton botonValidar;
	
	
	private class EventoFoco implements FocusListener{

		
		public void focusGained(FocusEvent e) {
			
			//System.out.println("Foco en cuadro 1");
			
		}

		
		public void focusLost(FocusEvent e) {
			
			String email = nuevoTextField1.getText();
			String pass = nuevoTextField2.getText();
			
			boolean verificacion = false ;
			int contPunto=0;
			
			// Se evalua formato de mail
			for (int i = 0; i < email.length(); i++) {
					
					if(email.charAt(i)=='@') {
						
						verificacion=true;
					}
					if (email.charAt(i)=='.') {
						
						contPunto++;
					}
				}
			
			// Valido formato de pass
			
			boolean ok;
			int contMayus=0;
			int contNum=0;
			int contEspa=0;
			
			//Recorriendo String para validar especificaciones.
					if ((pass.length()>4) && (pass.length()<11)) {
						
						for(int i=0; i<pass.length(); i++) {
							
							if (Character.isUpperCase(pass.charAt(i))) {
								contMayus++;
							}
							if(Character.isWhitespace(pass.charAt(i))) {
								contEspa++;
							}
							if(Character.isDigit(pass.charAt(i))) {
								contNum++;
							}
							
						} // Cierre for
						
						ok=true;
						// Mensajes de alerta
						
						if (contMayus == 0) {
							System.out.println("Tu contraseña debe contener al menos una Mayúscula");
							ok=false;
						}
						if (contEspa != 0) {
							System.out.println("Tu contraseña no debe poseer espacios en blanco");
							ok=false;
						}
						if (contNum == 0) {
							System.out.println("Tu contraseña debe poseer al menos un número");
							ok=false;
						}
						
						
					}else {
						
						System.out.println("Tu contraseña debe contener entre 5 y 10 caracteres");
						ok=false;
					} 	
			
			// Muestro errores o bienvenida
			if (verificacion&&(contPunto>0)) {
				
				System.out.println("Bienvenido " + email);
			}else {
				System.out.println("El formato de mail no es valido");
			}
			
		} // Cierre focusLost
		
		
	}
	
}

