package AppGraficas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AreasDeTextoII {

	public static void main(String[] args) {
		
		MarcoAreaDeTextoII nuevoMarcoAreaDeTextoII = new MarcoAreaDeTextoII();
		
		nuevoMarcoAreaDeTextoII.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoAreaDeTextoII extends JFrame{
	
	private static int cont=0;
	private JPanel laminaBotones = new JPanel();
	private JTextArea areaPrincipal = new JTextArea(20, 50);
	private JButton botonInsertar = new JButton("Insertar Texto");
	private JButton botonSaltoLinea = new JButton("Salto de Linea");
	
	public MarcoAreaDeTextoII() {
		
		setTitle("Area de Texto Vol.2");
		setBounds(0, 0, 500, 300);
		setLocationRelativeTo(null);
		
		
		setLayout(new BorderLayout());
		
		JScrollPane laminaPrincipal = new JScrollPane(areaPrincipal);
		
		// Generamos evento para botonInsertar
		botonInsertar.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				areaPrincipal.append("Este es el texto agregado" + ++cont + " - ");
			}
		});
		
		// Generamos evento para el botonSaltoLinea
		botonSaltoLinea.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				boolean cambio = !areaPrincipal.getLineWrap();
				
				areaPrincipal.setLineWrap(cambio);
				
				botonSaltoLinea.setText(cambio ? "Quitar Salto" : "Salto de Linea");
				
			}
		});
		
		laminaBotones.add(botonInsertar);
		laminaBotones.add(botonSaltoLinea);
		
		add(laminaPrincipal, BorderLayout.CENTER);
		add(laminaBotones, BorderLayout.SOUTH);
		
		setVisible(true);
	}
}