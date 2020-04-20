package AppGraficas;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class CheckBox {

	public static void main(String[] args) {
		
		MarcoCheckBox nuevoMarcoCheckBox = new MarcoCheckBox();
		
		nuevoMarcoCheckBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoCheckBox extends JFrame{
	
	public MarcoCheckBox() {
		
		setTitle("Check Box");
		setBounds(0, 0, 300, 200);
		setLocationRelativeTo(null);
		
		add(new LaminaCheckBox());
		
		setVisible(true);
	}
}

class LaminaCheckBox extends JPanel{
	
	private JLabel areaTexto;
	private JCheckBox checkNegrita , checkCursiva;
	private Font miLetra;
	
	
	public LaminaCheckBox() {
		
		setLayout(new BorderLayout());
		
		JPanel laminaCheck = new JPanel();
		
		miLetra = new Font("serif", Font.PLAIN, 20);
	
		areaTexto = new JLabel("Este es el texto que va a cambiar");
		areaTexto.setFont(miLetra);
		
		checkNegrita = new JCheckBox("Negrita");
		checkNegrita.addActionListener(new CambiaEstilo());
		
		checkCursiva = new JCheckBox("Cursiva");
		checkCursiva.addActionListener(new CambiaEstilo());
		
		laminaCheck.add(checkNegrita);
		laminaCheck.add(checkCursiva);
		
		add(areaTexto, BorderLayout.NORTH);
		add(laminaCheck, BorderLayout.SOUTH);
		
		
	}
	
	private class CambiaEstilo implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {

			int tipo=0;
			
			if (checkNegrita.isSelected()) tipo+=Font.BOLD;
			if (checkCursiva.isSelected()) tipo+=Font.ITALIC;
			
			areaTexto.setFont(new Font("Serif", tipo, 20));
				
				
			
		}
		
	}
}