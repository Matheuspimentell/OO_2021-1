package ArquivosDeTeste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import toyStore.srcCode.Cliente;
import toyStore.srcCode.Sistema;

class SistemaTest {

	@Test
	void testarAdicaoDeCliente() {
		boolean adicionou = false;
		
		Cliente teste = new Cliente("John Doe", "012.345.678-90");
		Sistema system = new Sistema();
		
		int tamanhoInicial = system.getClientes().size();
		
		system.addCliente(teste, null, null);
		
		if(tamanhoInicial == (system.getClientes().size()-1)) {
			adicionou = true;
		}
		
		Assertions.assertTrue(adicionou);
		Assertions.assertEquals((tamanhoInicial+1), system.getClientes().size());
	}

}
