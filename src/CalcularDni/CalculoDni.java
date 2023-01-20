package CalcularDni;

public class CalculoDni {
	private static final String LISTA_LETRA_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";
	private static final int NUM_LETRAS = 23;

	
	
	
	public static char calculaLetra(int numDni) throws Exception {
		char letraDni = ' ';
		int modulo = -1;

		if (numDni < 0) {
			throw new Exception();
		} else {
			modulo = (numDni % NUM_LETRAS);
			letraDni = LISTA_LETRA_DNI.charAt(modulo);
		}

		return letraDni;

		
	}


}
