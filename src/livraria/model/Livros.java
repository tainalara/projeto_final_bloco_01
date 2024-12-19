package livraria.model;

public abstract class Livros {
	
	//Atributos (variaveis)
	private String nome;
	private String autor;
	private String categoria;
	private int paginas;
	
	// Método Construtor 
	
	public Livros(String nome, String autor, String categoria, int paginas) {
	
	this.nome = nome;
	this.autor = autor;
	this.categoria = categoria;
	this.paginas = paginas;
	
	}
			
	// Método de Acesso
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	public void visualizar () {
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Informações sobre o Livro:");
		System.out.println("***********************************************************");
		System.out.println("Nome do Livro: " + this.nome);
		System.out.println("Autor(a) do Livro: " + this.autor);
		System.out.println("Categoria do Livro: " + this.categoria);
		System.out.println("Número de Páginas: " + this.paginas);
	}

}


