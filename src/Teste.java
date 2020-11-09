import java.util.ArrayList;
import java.util.List;

import Entidades.Pessoa;
import Repositorio.RepositorioPessoa;

public class Teste {
	
	static RepositorioPessoa rp = new RepositorioPessoa();
	public static void main(String[] args) {
		
		popularArray();
		listarPessoas();
		rp.deletarPessoa("04523472964");
		listarPessoas();
		alterar();
		listarPessoas();

	}
	
	public static void alterar() {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Juca");
		pessoa.setCpf("68926419601");
		pessoa.setIdade(10);
		pessoa.setSexo("M");
		rp.alterarPessoa(pessoa);
		
	}
	
	public static void popularArray() {
		
		Pessoa pessoa1 = new Pessoa();		
		pessoa1.setNome("Daniel");
		pessoa1.setCpf("04523457145");
		pessoa1.setIdade(25);
		pessoa1.setSexo("M");
		rp.salvarPessoa(pessoa1);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Ana");
		pessoa2.setCpf("04523472964");
		pessoa2.setIdade(22);
		pessoa2.setSexo("F");
		rp.salvarPessoa(pessoa2);
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Mano");
		pessoa.setCpf("68926419601");
		pessoa.setIdade(10);
		pessoa.setSexo("M");
		rp.salvarPessoa(pessoa);
	}
	
	public static void listarPessoas() {		
		
		List<Pessoa> lista = new ArrayList<Pessoa>();
		
		lista = rp.listarPessoa();
		
		for (Pessoa pessoa : lista) {
			
			System.out.println("==============================");
			System.out.println("CPF: "+pessoa.getCpf());
			System.out.println("NOME: "+pessoa.getNome());
			System.out.println("SEXO: "+pessoa.getSexo());
			System.out.println("IDADE: "+pessoa.getIdade());
			
		}
	}

}
