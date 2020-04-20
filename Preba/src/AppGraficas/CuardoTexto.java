package AppGraficas;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CuardoTexto {

	public static void main(String[] args) {
		
		MarcoCuatroTexto nuevoMarco = new MarcoCuatroTexto();
		
		nuevoMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCuatroTexto extends JFrame{
	
	public MarcoCuatroTexto() {

			setTitle("Cuadro Texto");
			setBounds(0, 0, 500, 150);
			setLocationRelativeTo(null);
			setVisible(true);
			
			add(new LaminaCuadroTexto());
	}
}

class LaminaCuadroTexto extends JPanel{
	
	private JTextField cuadro1;
	private int contAr=0;
	private int contP=0;
	private JLabel resultado;
	
	public LaminaCuadroTexto() {
		
		setLayout(new BorderLayout());
		
		JPanel lamina2 = new JPanel();
		lamina2.setLayout(new FlowLayout());
		
		JLabel textoMaiLabel = new JLabel("Email: ");
		lamina2.add(textoMaiLabel);
		
		resultado= new JLabel("", JLabel.CENTER);
		cuadro1 = new JTextField(15);
		
		JButton botonLeer = new JButton("Leer");
		botonLeer.addActionListener(new DameTexto());
		

		lamina2.add(cuadro1);
		lamina2.add(botonLeer);
		
		add(lamina2, BorderLayout.NORTH);
		add(resultado, BorderLayout.CENTER);
	}
	
	
	
	private class DameTexto implements ActionListener{
		
		private String valorTexto;
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			valorTexto= cuadro1.getText().trim();
			evaluarMail(valorTexto);
			
		}
		
		public void evaluarMail(String valorText) {

			for (int i = 0; i < valorText.length(); i++) {
				
				if (valorText.charAt(i)=='@') {
					
					contAr++;
				}
				if (valorText.charAt(i)=='.') {
					
					contP++;
				}
			}
			
			
			if (contAr!=1) {
				
				resultado.setText("La direccion debe contener un @");
			}
			else if (contP==0) {
				
				resultado.setText("La direccion debe contener al menos un punto");
			}else {
				
				resultado.setText("Bienvenido: " + valorText);
			}
			
			contAr=0;
			contP=0;
			
		}// Cierre evaluarMail
		
	}
	
	
}
