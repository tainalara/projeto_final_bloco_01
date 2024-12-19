package livraria.repository;

import livraria.model.Obras;

public interface LivrariaRepository {

	// CRUD Livraria
	
	public void cadastrar (Obras livro);
	public void deletar (int numero);
	public void listarTodos();
	public void atualizar(int numero, String nome2, String autor, String categoria, int paginas, int tipoComercio, float precoCompra);
	
}
