package AppGraficas;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PruebaJSliderII {

	public static void main(String[] args) {
		
		MarcoJSliderII nuevoMarcoJSliderII = new MarcoJSliderII();
		
		nuevoMarcoJSliderII.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoJSliderII extends JFrame{
	
	public MarcoJSliderII() {
		
		setTitle("Combo Box");
		setBounds(0, 0, 300, 300);
		setLocationRelativeTo(null);
		
		add(new LaminaJSliderII());
		
		setVisible(true);
	
	}
}

class LaminaJSliderII extends JPanel{
	
	private JLabel texto;
	private JSlider deslizante;
	
	public LaminaJSliderII() {
		
		setLayout(new BorderLayout());
		
		texto = new JLabel("Habia una vez un circo...");
		
		deslizante = new JSlider(10, 26, 18);
		
		// Valores del Slider
		deslizante.setMajorTickSpacing(4);
		deslizante.setMinorTickSpacing(2);
		deslizante.setSnapToTicks(true);
		deslizante.setPaintLabels(true);
		deslizante.setPaintTicks(true);
		deslizante.addChangeListener(new EventoCambiaTamanio());
		
		JPanel laminaTop = new JPanel();
		laminaTop.add(deslizante);
		
		add(texto, BorderLayout.CENTER);
		add(laminaTop, BorderLayout.NORTH);
		
	}
	
	private class EventoCambiaTamanio implements ChangeListener{

		
		public void stateChanged(ChangeEvent e) {
			
			int tamanio = deslizante.getValue();
			
			texto.setFont(new Font("Serif", Font.ITALIC, tamanio));
			
		}
		
		
	}
	
}