package toyStore.srcCode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

class SistemaTest {

	@Test
	void testarAdicaoDeCliente() {
		boolean adicionou = false;
		
		Cliente teste = new Cliente("John Doe", "012.345.678-90");
		Sistema system = new Sistema();
		
		int tamanhoInicial = system.getClientes().size();
		
		system.setCliente(teste, null, null);
		
		if(tamanhoInicial == (system.getClientes().size()-1)) {
			adicionou = true;
		}
		
		Assertions.assertTrue(adicionou);
		Assertions.assertEquals((tamanhoInicial+1), system.getClientes().size());
	}

}
