import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Uso_Empleado {

	public static void main(String[] args) {
		
		Empleado[] misEmpleados =  new Empleado[3];
		
		misEmpleados[0] = new Empleado ("Ivan Falleau", 35000 , 2015, 01, 16);
		misEmpleados[1] = new Empleado ("Joel Falleau", 50000 , 2014, 05, 20);
		misEmpleados[2] = new Empleado ("Braian Falleau", 25000 , 2017, 06, 01);
		
		Comparable nuevoE = new Empleado("Cosme Fulanito", 25000 , 1991, 8, 15);
		
		Jefe nuevoJ = new Jefe("Bill Gate", 105000 , 1985, 2, 01);
		
				
		Arrays.sort(misEmpleados);
		
		for (Empleado e: misEmpleados) {
			
			System.out.println(e.getDescripcion() + " | " + e.getSalario() + " | " + e.getFechaContrato() + " | Id=" + e.getId());
		}
		
		if (nuevoE instanceof Comparable) {
			
			System.out.println("Implementa la interfaz Comparable.");
		}
		
		// Usando Medoto tomarDecisiones de Interface "Jefes"
		System.out.println(nuevoJ.getDescripcion() + " Decide " + nuevoJ.tomarDecisiones("Comprar acciones de SpaceX"));
		
		// Usando Metodo estableceBono de Interface "Trabajadores"
		System.out.println(nuevoJ.getDescripcion() + " su Bono es: " + nuevoJ.estableceBono(5000));
		
		System.out.println(misEmpleados[0].getDescripcion() + " su Bono es: " + misEmpleados[0].estableceBono(3000));
		
		
	} // Cierre main
	
	
}


class Empleado implements Comparable, Trabajadores {
	
	private String nombre;
	private double salario;
	private Date fechaContrato; // Variables Empleado
	private int Id;
	private int IdSiguiente = 1;

	public Empleado(String nom, double sue, int anio, int mes, int dia) {

		nombre=nom;

		salario = sue;

		Calendar fecha = new GregorianCalendar(anio, mes - 1, dia);

		fechaContrato = fecha.getTime();

		Id = IdSiguiente;

		++IdSiguiente;

	}

	/* public Empleado(String nom) {

		this(nom, 10000, 3000, 01, 01);

		Id = IdSiguiente;

		IdSiguiente++;
	}*/ 

	public int compareTo(Object miObject) {
		
		Empleado otroEmpleado = (Empleado) miObject;
		
		if (this.salario<otroEmpleado.salario) {
			
			return -1;
		}
		if (this.salario>otroEmpleado.salario) {
			
			return 1;
		}
		return 0;
	}
	
	public double estableceBono(double bono) {
		
		return Trabajadores.bonoBase+bono;
	}

	public double getSalario() {

		return salario;
	}

	public Date getFechaContrato() {

		return fechaContrato;
	}

	public void setSalario(double sal) {

		salario = salario + sal;
	}

	public void aumentaSalario(double porcent) {

		double aumento = salario * porcent / 100;

		salario += aumento;
	}

	public int getId() {

		return Id;
	}

	public String getDescripcion() {

		return "Nombre: " + nombre;
	}
	
	

} // Cierre Empleado

 class Jefe extends Empleado implements Jefes {

	private double incentivo;

	public Jefe(String nom, double sue, int anio, int mes, int dia) {

		super(nom, sue, anio, mes, dia);

	}

	public void incentivo(double inc) {

		incentivo = inc;
	}

	public double getSalarioConIncentivo() {

		return getSalario() + incentivo;
	}
	
	public String tomarDecisiones(String decision) { // Metodo implementado de interface "Jefes"
		
		return decision ;
	}
	
	public double estableceBono(double bono) {
		
		double prima = 2000;
		
		return Trabajadores.bonoBase+bono+prima ; 
	}

} // Cierre Jefe 