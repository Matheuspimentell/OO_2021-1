package toyStore.srcCode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LojaTest {

	@Test
	void testaAdicaoDeFuncionario() {
		boolean adicionou = false;
		
		Funcionario funcionario = new Funcionario("John Doe", 12345, "Salesman");
		Loja loja = new Loja("Toy Store", "teste", "98.976.973/0001-65");
		
		int tamanhoAnterior = loja.getFuncionarios().size();
		
		loja.setFuncionario(funcionario, null, null);
		
		if(tamanhoAnterior == (loja.getFuncionarios().size()-1)){
			adicionou = true;
		}
		
		Assertions.assertTrue(adicionou);
		Assertions.assertEquals((tamanhoAnterior+1), loja.getFuncionarios().size());
	}
	
	
	@Test
	void testaAdicaoDeBrinquedo() {
		boolean adicionou = false;
		
		Brinquedo Brinquedo = new Brinquedo("Test Name", "Test Label", "Test Category", 10.0, 1, 10, 123);
		Loja loja = new Loja("Toy Store", "teste", "98.976.973/0001-65");
		
		int tamanhoAnterior = loja.getEstoque().size();
		
		loja.setBrinquedo(Brinquedo);
		
		if(tamanhoAnterior == (loja.getEstoque().size()-1)){
			adicionou = true;
		}
		
		Assertions.assertTrue(adicionou);
		Assertions.assertEquals((tamanhoAnterior+1), loja.getEstoque().size());
	}
}
