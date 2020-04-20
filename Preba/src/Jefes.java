
public interface Jefes extends Trabajadores {

	String tomarDecisiones(String decision); // No lleva identificador de acceso, porq al ser interface se toma por hecho.
												// Los metodos son "public abstract"
}
