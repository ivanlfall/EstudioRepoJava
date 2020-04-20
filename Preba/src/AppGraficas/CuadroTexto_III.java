package AppGraficas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class CuadroTexto_III {

	public static void main(String[] args) {

		MarcoCuadroTextoIII nuevoCuadroTextoIII = new MarcoCuadroTextoIII();
		nuevoCuadroTextoIII.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoCuadroTextoIII extends JFrame{
	
	public MarcoCuadroTextoIII(){
		
		setTitle("Cuadro Texto");
		setBounds(0, 0, 300, 200);
		setLocationRelativeTo(null);
		
		add(new LaminaCuadroTextoIII());
		setVisible(true);
		
	}
}

class LaminaCuadroTextoIII extends JPanel{
	
	private JTextField passText;
	
	
	public LaminaCuadroTextoIII() {
		
		setLayout(new BorderLayout());
		
		JPanel laminaTop = new JPanel();
		laminaTop.setLayout(new GridLayout(2, 2));
		
		JLabel usuario = new JLabel("Usuario: ");
		JTextField usuarioText = new JTextField(15);
		
		laminaTop.add(usuario);
		laminaTop.add(usuarioText);
		
		JLabel pass = new JLabel("Contraseña: ");
		passText = new JTextField(15);
		Document passDoc = passText.getDocument();
		passDoc.addDocumentListener(new EscuchaTextPass());
		
		laminaTop.add(pass);
		laminaTop.add(passText);
		
		add(laminaTop, BorderLayout.NORTH);
		
		JButton botonEnviar = new JButton("Enviar");
		add(botonEnviar, BorderLayout.SOUTH);
	}
	
	private class EscuchaTextPass implements DocumentListener{

		
		public void changedUpdate(DocumentEvent e) {
			
		}

		
		public void insertUpdate(DocumentEvent e) {
			
			if ((passText.getText().length()<8) || (passText.getText().length()>12)) {
				
				passText.setBackground(new Color(224, 150, 137));
			} else {
				
				passText.setBackground(new Color(255, 255, 255));
			}
			
			
		}

		
		public void removeUpdate(DocumentEvent e) {
			
			if ((passText.getText().length()<8) || (passText.getText().length()>12)) {
				
				passText.setBackground(new Color(224, 150, 137));
			} else {
				
				passText.setBackground(new Color(255, 255, 255));
				
			}
		}
		
		
	}
}