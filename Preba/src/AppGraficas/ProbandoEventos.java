package AppGraficas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ProbandoEventos {

	public static void main(String[] args) {
	
		MarcoBotones miMarcoBotones1 = new MarcoBotones();
		miMarcoBotones1.setVisible(true);
		miMarcoBotones1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoBotones extends	JFrame{
	
	public MarcoBotones() {
		
		setTitle("Botones y Eventos");
		setBounds(500, 200, 300, 300);
		LaminaBotones nuevaLaminaBotones1 = new LaminaBotones();
		add(nuevaLaminaBotones1);
		
		
	}
	
	class LaminaBotones extends JPanel implements ActionListener{
		
		JButton botonAzul = new JButton("Azul");
		JButton botonRojo = new JButton("Rojo");
		JButton botonVerde = new JButton("Verde");
		
		public LaminaBotones() {
			
			add(botonAzul);
			add(botonRojo);
			add(botonVerde);
			
			botonAzul.addActionListener(this);
			botonRojo.addActionListener(this);
			botonVerde.addActionListener(this);
		}
		
		public void actionPerformed(ActionEvent e) {
			
			Object botonPulsado = e.getSource();
			
			if (botonPulsado.equals(botonAzul)) {
				setBackground(Color.BLUE);
			}
			if (botonPulsado.equals(botonRojo)) {
				setBackground(Color.RED);
			}
			if (botonPulsado.equals(botonVerde)) {
				setBackground(Color.GREEN);
			}
			
			
			
			
		}
	}
}