package Calculadora;

import java.awt.BorderLayout;

import javax.lang.model.type.NullType;
import javax.swing.JFrame;

public class MarcoCalculadora extends JFrame{
	
	public MarcoCalculadora() {

		setTitle("Calculadora");
		setBounds(0, 0, 340, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		add(new LaminaCalculadora());
		
		
	}

}
