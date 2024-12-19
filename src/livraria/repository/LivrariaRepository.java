package livraria.repository;

import livraria.model.Obras;

public interface LivrariaRepository {

	// CRUD Livraria
	
	public void cadastrar (Obras livro);
	public void atualizar (Obras livro);
	public void deletar (String nome);
	public void listarTodos();
	
}
