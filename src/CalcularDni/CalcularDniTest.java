package CalcularDni;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CalcularDniTest {
	
	
		@ParameterizedTest
		@ValueSource(strings = {"63018029F", "43727265X", "82039779K", "85036608L", "96844905R", "66603336M",
		"07942298F", "69666845Y", "76279642G", "21638693V"})
		public void testCalcularLetra(String documento) throws Exception {
		CalculoDni calculodni = new CalculoDni();
		String numDni = documento.substring(0, 8);
		int num  = Integer.parseInt(numDni); 
		char letraCalculada = calculodni.calculaLetra(num);
		String letraEsperada = documento.substring(8);
		String letraCalculadaString = Character.toString(letraCalculada);
		assertEquals(letraEsperada, letraCalculadaString);
		}
		

}
