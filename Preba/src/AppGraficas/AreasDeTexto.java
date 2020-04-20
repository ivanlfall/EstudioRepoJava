package AppGraficas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AreasDeTexto {

	public static void main(String[] args) {
		
		MarcoAreaDeTexto nuevoMarcoAreaDeTexto = new MarcoAreaDeTexto();
		
		nuevoMarcoAreaDeTexto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}

}

class MarcoAreaDeTexto extends JFrame{
	
	public MarcoAreaDeTexto() {
	
		setTitle("Area de texto");
		setBounds(0, 0, 500, 500);
		setLocationRelativeTo(null);
		
		add(new LaminaAreaDeTexto());
		
		setVisible(true);
		
	}
}

class LaminaAreaDeTexto extends JPanel{
	
	JTextArea areaTexNueva;
	
	public LaminaAreaDeTexto() {
	
		areaTexNueva = new JTextArea(8, 20);
		areaTexNueva.setLineWrap(true);
		
		JScrollPane laminaContenedora = new JScrollPane(areaTexNueva);
		
		JButton botonEnviar = new JButton("Enviar");
		botonEnviar.addActionListener(new AccionEnviar());
		
		add(laminaContenedora);
		add(botonEnviar);
		
	}
	
	private class AccionEnviar implements ActionListener{

		
		public void actionPerformed(ActionEvent arg0) {
			
			System.out.println(areaTexNueva.getText());
			areaTexNueva.setText("");
		}
		
		
	}
	
}