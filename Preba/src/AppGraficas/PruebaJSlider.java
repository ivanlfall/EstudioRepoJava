package AppGraficas;

import javax.swing.*;


public class PruebaJSlider {

	public static void main(String[] args) {
		
		MarcoJSlider nuevoMarcoJSlider = new MarcoJSlider();
		
		nuevoMarcoJSlider.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoJSlider extends JFrame{
	
	public MarcoJSlider() {
		
		setTitle("Combo Box");
		setBounds(0, 0, 300, 400);
		setLocationRelativeTo(null);
		
		add(new LaminaJSlider());
		
		setVisible(true);
	
	}
}

class LaminaJSlider extends JPanel{
	
	public LaminaJSlider(){
		
		JSlider deslizante = new JSlider();
		
		deslizante.setMajorTickSpacing(25);
		deslizante.setMinorTickSpacing(5);
		
		deslizante.setPaintLabels(true); // Muestra o no, valores numericos (previo set de valores)
		deslizante.setPaintTicks(true);	// Muestra o no, separaciones entre valores (previo set de valores)
		//deslizante.setPaintTrack(false); // Muestra o no, la barra de desplazamiento
		//deslizante.setOrientation(SwingConstants.VERTICAL);
		deslizante.setSnapToTicks(true);
		
		add(deslizante);
		
	}
}