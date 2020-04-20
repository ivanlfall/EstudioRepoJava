package Calculadora;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class LaminaCalculadora extends JPanel{
	
	private JButton pantalla;
	private JPanel laminaValores;
	private boolean inicio;
	private double resultadoMomentaneo;
	private double resultadoOperacion = 0;
	private String ultimaOperacion;
	
	public LaminaCalculadora() {
		
		inicio=true;
	
		setLayout(new BorderLayout());
		
		pantalla = new JButton("0");
		pantalla.setEnabled(false);
		
		
		add(pantalla, BorderLayout.NORTH);
		
		ActionListener insertaNumero = new InsertaNumero();
		ActionListener calculo = new Calculos();
		
		laminaValores = new JPanel();
		
		laminaValores.setLayout(new GridLayout(4, 4));
		
		insertaBoton("1", insertaNumero);
		insertaBoton("2", insertaNumero);
		insertaBoton("3", insertaNumero);
		insertaBoton("/", calculo);
		insertaBoton("4", insertaNumero);
		insertaBoton("5", insertaNumero);
		insertaBoton("6", insertaNumero);
		insertaBoton("*", calculo);
		insertaBoton("7", insertaNumero);
		insertaBoton("8", insertaNumero);
		insertaBoton("9", insertaNumero);
		insertaBoton("-", calculo);
		insertaBoton("0", insertaNumero);
		insertaBoton(".", insertaNumero);
		insertaBoton("=", calculo);
		insertaBoton("+", calculo);
		
		add(laminaValores , BorderLayout.CENTER);
		
		ultimaOperacion="=";
	}

	private void insertaBoton(String valor, ActionListener oyente) {
		
		JButton botonValor = new JButton(valor);
		
		botonValor.addActionListener(oyente);
		
		laminaValores.add(botonValor);
		
		
		
	}
	
	private class InsertaNumero implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			String valorTecla = e.getActionCommand();
			
			if (inicio) {
				
				pantalla.setText("");
				inicio=false;
			}
			
			pantalla.setText(pantalla.getText() + valorTecla);
			
		}
		
		
	}
	
	private class Calculos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String operacion = e.getActionCommand();
			
			calcular(Double.parseDouble(pantalla.getText()));
			
			ultimaOperacion=operacion;
			
			inicio=true;
			
		}
		
		public void calcular(double valorMomentaneo) {
			
						// SUMA
						if (ultimaOperacion.equals("+")) {
							
							resultadoOperacion += valorMomentaneo;
							//pantalla.setText(""+ resultadoOperacion);
						}
						// RESTA
						else if (ultimaOperacion.equals("-")) {
							
							resultadoOperacion -= valorMomentaneo;
							//pantalla.setText(""+ resultadoOperacion);
						}
						// DIVISION
						else if (ultimaOperacion.equals("/")) {
				
							resultadoOperacion /= valorMomentaneo;
							//pantalla.setText(""+ resultadoOperacion);
						}
						// MULTIPLICACION
						else if (ultimaOperacion.equals("*")) {
				
							resultadoOperacion *= valorMomentaneo;
							//pantalla.setText(""+ resultadoOperacion);
						}
						// IGUAL
						else if(ultimaOperacion.equals("=")) {
							
							resultadoOperacion=valorMomentaneo;
							
						}
						
						
						pantalla.setText(""+ resultadoOperacion);
		}
		
		
	}

}
