package AppGraficas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


import Moldes.*;

public class Layouts_I {

	public static void main(String[] args) {
		
		CreandoMarco nuevoMarcoLayouts = new CreandoMarco("Layouts");
		
		nuevoMarcoLayouts.add(new LaminaLayouts(), BorderLayout.NORTH);
		//nuevoMarcoLayouts.add(new LaminaLayouts2(), BorderLayout.SOUTH);
		
		nuevoMarcoLayouts.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class LaminaLayouts extends JPanel{
	
	public LaminaLayouts() {
		
		setLayout(new GridLayout(2, 2));
		
		add(new JButton("Verde"));
		add(new JButton("Azul"));
		add(new JButton("Naranja"));
		add(new JButton("Morado"));
		
		
		
	}
}

class LaminaLayouts2 extends JPanel{
	
	public LaminaLayouts2() {
	
		setLayout(new BorderLayout());
		
		add(new JButton("Blanco"), BorderLayout.WEST);
		add(new JButton("Negro"), BorderLayout.EAST);
		
	}
		
}
