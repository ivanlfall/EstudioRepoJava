package AppGraficas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComboBox {

	public static void main(String[] args) {
		
		MarcoComboBox nuevoMarcoComboBox = new MarcoComboBox();
		
		nuevoMarcoComboBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}

class MarcoComboBox extends JFrame{
	
	public MarcoComboBox() {
		
		setTitle("Combo Box");
		setBounds(0, 0, 300, 400);
		setLocationRelativeTo(null);
		
		add(new LaminaComboBox());
		
		setVisible(true);
	
	}
}

class LaminaComboBox extends JPanel{
	
	private JLabel texto;
	private JComboBox desplegable;
	
	public LaminaComboBox() {
		
		setLayout(new BorderLayout());
		
		texto = new JLabel("Ingresar como: ");
		
		desplegable = new JComboBox();
		
		desplegable.setEditable(true);
		desplegable.addActionListener(new EventoDesplegable());
		
		desplegable.addItem("Joel");
		desplegable.addItem("Ivan");
		desplegable.addItem("Braian");
		
		JPanel laminaTop = new JPanel();
		
		laminaTop.add(desplegable);
		
		add(laminaTop, BorderLayout.NORTH);
		add(texto, BorderLayout.CENTER);
		
	}
	
	private class EventoDesplegable implements ActionListener{


		public void actionPerformed(ActionEvent e) {
			
			texto.setText("Ingresar como: ");
			
			String seleccion = (String)desplegable.getSelectedItem();
			
			
			texto.setText(texto.getText() + seleccion);
			
		}
		
		
	}
}