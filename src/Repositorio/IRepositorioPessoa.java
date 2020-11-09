package Repositorio;

import java.util.List;

import Entidades.Pessoa;

public interface IRepositorioPessoa {
	
	public boolean salvarPessoa(Pessoa pessoa);
	public boolean deletarPessoa(String cpf);
	public List<Pessoa> listarPessoa();
	public boolean alterarPessoa(Pessoa pessoa);

}
