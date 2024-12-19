package livraria.repository;

import livraria.model.Obras;

public interface LivrariaRepository {

	// CRUD Livraria
	
	public void cadastrar (Obras livro);
	public void deletar (int numero);
	public void listarTodos();
	
}
