package AppGraficas;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;



public class RadioButtonII {

	public static void main(String[] args) {
		
		MarcoRadioButtonII nuevoMarcoRadioButton = new MarcoRadioButtonII();
		
		nuevoMarcoRadioButton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoRadioButtonII extends JFrame{
	
	public MarcoRadioButtonII() {
		
		setTitle("Radio Button II");
		setBounds(0, 0, 300, 200);
		setLocationRelativeTo(null);
		
		add(new LaminaRadioButtonII());
		
		setVisible(true);
	}
}

class LaminaRadioButtonII extends JPanel{
	
	private JRadioButton boton10, boton12, boton14, boton16;
	private JLabel texto;
	private JPanel laminaBotones;
	private ButtonGroup nuevoGrupo;
	
	
	public LaminaRadioButtonII() {
		
		setLayout(new BorderLayout());
		
		Font miFuente = new Font("Mia", Font.PLAIN, 10);
		
		texto = new JLabel("Habia una vez, un Circo....");
		texto.setFont(miFuente);
		
		nuevoGrupo = new ButtonGroup();
		
		laminaBotones = new JPanel();
		
		creaBotones("Pequeño", true, 10);
		creaBotones("Mediano", false, 14);
		creaBotones("Grande", false, 18);
		creaBotones("Muy Grande", false, 22);
		
		add(texto, BorderLayout.CENTER);
		add(laminaBotones, BorderLayout.SOUTH);
		
	}
	
	private void creaBotones (String nombre, boolean estado, int tamanio) {
		
		JRadioButton boton = new JRadioButton(nombre, estado);
		
		ActionListener eventoBoton = new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				texto.setFont(new Font("Mia", Font.PLAIN, tamanio));
				
			}
		};
		
		boton.addActionListener(eventoBoton);
		
		nuevoGrupo.add(boton);
		laminaBotones.add(boton);
	}
}
