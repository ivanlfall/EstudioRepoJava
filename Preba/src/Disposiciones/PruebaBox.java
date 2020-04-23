package Disposiciones;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PruebaBox {

	public static void main(String[] args) {
		
		MarcoBox nuevoMarcoBox = new MarcoBox();
		
		nuevoMarcoBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class MarcoBox extends JFrame{
	
	public MarcoBox() {
		
		setTitle("Disposicion Box");
		setBounds(0, 0, 300, 300);
		setLocationRelativeTo(null);
		
		JLabel nombreLabel = new JLabel("Nombre");
		JTextField txtNombre = new JTextField(10);
		txtNombre.setMaximumSize(txtNombre.getPreferredSize());
		
		Box cajaH1 = Box.createHorizontalBox();
		cajaH1.add(nombreLabel);
		cajaH1.add(Box.createHorizontalStrut(20));
		cajaH1.add(txtNombre);
		
		//-----------------------------------------------------
		JLabel passLabel = new JLabel("Contraseña");
		JTextField txtPass = new JTextField(10);
		txtPass.setMaximumSize(txtNombre.getPreferredSize());
		
		Box cajaH2 = Box.createHorizontalBox();
		cajaH2.add(passLabel);
		cajaH2.add(Box.createHorizontalStrut(20));
		cajaH2.add(txtPass);
		
		//----------------------------------------------------
		JButton btnOk = new JButton("Ok");
		JButton btnCancelar = new JButton("Cancelar");
		
		Box cajaH3 = Box.createHorizontalBox();
		cajaH3.add(btnOk);
		cajaH3.add(Box.createGlue());
		cajaH3.add(btnCancelar);
		
		//-----------------------------------------------------
		Box cajaPadre = Box.createVerticalBox();
		cajaPadre.add(cajaH1);
		cajaPadre.add(cajaH2);
		cajaPadre.add(cajaH3);
		
		add(cajaPadre);
		
		setVisible(true);
	}
}