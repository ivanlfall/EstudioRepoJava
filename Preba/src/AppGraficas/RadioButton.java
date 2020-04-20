package AppGraficas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButton {

	public static void main(String[] args) {
		
		MarcoRadioButton nuevoMarcoRadioButton = new MarcoRadioButton();
		
		nuevoMarcoRadioButton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoRadioButton extends JFrame{
	
	public MarcoRadioButton() {
		
		setTitle("Radio Button");
		setBounds(0, 0, 300, 200);
		setLocationRelativeTo(null);
		
		add(new LaminaRadioButton());
		
		setVisible(true);
	}
}

class LaminaRadioButton extends JPanel{
	
	private JRadioButton botonRojo, botonVerde, botonAzul;
	
	public LaminaRadioButton() {
		
		setLayout(new BorderLayout());
		
		ButtonGroup nuevoGrupo = new ButtonGroup();
		
		botonRojo = new JRadioButton("Rojo", false);
		botonVerde = new JRadioButton("Verde", false);
		botonAzul = new JRadioButton("Azul", true);
		
		botonRojo.addActionListener(new CambiaColorRadio());
		botonVerde.addActionListener(new CambiaColorRadio());
		botonAzul.addActionListener(new CambiaColorRadio());
		
		
		nuevoGrupo.add(botonRojo);
		nuevoGrupo.add(botonAzul);
		nuevoGrupo.add(botonVerde);
		
		
		JPanel laminaTop = new JPanel();
		
		laminaTop.add(botonRojo);
		laminaTop.add(botonVerde);
		laminaTop.add(botonAzul);
		
		add(laminaTop, BorderLayout.NORTH);
		
	}
	
	private class CambiaColorRadio implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			Object btnActivo = e.getSource();
			
			if (btnActivo.equals(botonRojo)) {
				
				setBackground(new Color(200, 55, 48));
			} else if (btnActivo.equals(botonVerde)) {
				
				setBackground(new Color(65, 167, 74));
			}else {
				
				setBackground(new Color(67, 65, 167));
			}
		}
		
		
	}
}