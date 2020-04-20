import java.util.*;


public class ValidacionPass {

	public static void main(String[] args) {
		
		boolean pruebaOK=false;		
		Scanner entrada = new Scanner(System.in);
		
		while(pruebaOK==false) {
		System.out.println("Ingrese su contraseña: ");
		String contra = entrada.next(); 
		
		pruebaOK=Validar(contra);
		}
		
		System.out.println("Bienvenido");
		
			
	}

	public static boolean Validar(String pass) {
		
		boolean ok;
		int contMayus=0;
		int contNum=0;
		int contEspa=0;
		
		//Recorriendo String para validar especificaciones.
				if ((pass.length()>4) && (pass.length()<11)) {
					
					for(int i=0; i<pass.length(); i++) {
						
						if (Character.isUpperCase(pass.charAt(i))) {
							contMayus++;
						}
						if(Character.isWhitespace(pass.charAt(i))) {
							contEspa++;
						}
						if(Character.isDigit(pass.charAt(i))) {
							contNum++;
						}
						
					} // Cierre for
					
					ok=true;
					// Mensajes de alerta
					
					if (contMayus == 0) {
						System.out.println("Tu contraseña debe contener al menos una Mayúscula");
						ok=false;
					}
					if (contEspa != 0) {
						System.out.println("Tu contraseña no debe poseer espacios en blanco");
						ok=false;
					}
					if (contNum == 0) {
						System.out.println("Tu contraseña debe poseer al menos un número");
						ok=false;
					}
					
					
				}else {
					
					System.out.println("Tu contraseña debe contener entre 5 y 10 caracteres");
					ok=false;
				} 		
		return ok;
				
	} // Cierre Validar
}