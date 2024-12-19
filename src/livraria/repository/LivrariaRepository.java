package livraria.repository;

import livraria.model.Livros;

public interface LivrariaRepository {

	// CRUD Livraria
	
	public void cadastrar (Livros livro);
	public void atualizar (Livros livro);
	public void deletar (String nome);
	public void listarTodos();
	
}
