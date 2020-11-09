package Repositorio;

import java.util.ArrayList;
import java.util.List;

import Entidades.Pessoa;

public class RepositorioPessoa implements IRepositorioPessoa{
	
	List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

	@Override
	public boolean salvarPessoa(Pessoa pessoa) {
		
		try {
			listaPessoas.add(pessoa);
		}catch (Exception e) {
			return false;
		}
		
		return true;		
		
	}

	@Override
	public boolean deletarPessoa(String cpf) {
		
		for (Pessoa pessoa :listaPessoas) {
			if(pessoa.getCpf() == cpf) {
				listaPessoas.remove(pessoa);
			}
		}
		return false;
	}

	@Override
	public List<Pessoa> listarPessoa() {
		
		return this.listaPessoas;
	}

	@Override
	public boolean alterarPessoa(Pessoa pessoa) {
		
		for (Pessoa pessoal :listaPessoas) {
			if(pessoal.getCpf() == pessoa.getCpf()) {
				listaPessoas.remove(pessoal);
				listaPessoas.add(pessoa);
			}

		}
		return false;
	}
	
	

}
