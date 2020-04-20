package AppGraficas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.PopupMenu;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;

public class PruebaJSpinner {

	public static void main(String[] args) {

		MarcoJSpinner nuevoMarcoJSpinner = new MarcoJSpinner();
		
		nuevoMarcoJSpinner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoJSpinner extends JFrame{
	
	public MarcoJSpinner() {
		
		setTitle("JSpinner");
		setBounds(0, 0, 300, 100);
		setLocationRelativeTo(null);
		
		add(new LaminaJSpinner());
		
		setVisible(true);
	}
}

class LaminaJSpinner extends JPanel{
	
	public LaminaJSpinner() {
		
		setLayout(new BorderLayout());
		
		ArrayList<String> lista =  new ArrayList<String>();
		lista.add("Hola");
		lista.add("Adios");
		lista.add("Chau");
		
		Dimension dim = new Dimension(80, 30);
		
		JSpinner control = new JSpinner(new SpinnerListModel(lista));
		control.setFont(new Font("Serif", Font.BOLD, 16));
		control.setPreferredSize(dim);
		
		JSpinner date = new JSpinner(new SpinnerNumberModel(50, 0, 100, 5));
		
		JPanel laminaLeft = new JPanel();
		laminaLeft.setLayout(new GridLayout(2,1));
		
		laminaLeft.add(control);
		laminaLeft.add(date);
		
		add(laminaLeft, BorderLayout.WEST);
		
		JLabel text = new JLabel("Lala");
		add(text, BorderLayout.CENTER);
		
	}
}