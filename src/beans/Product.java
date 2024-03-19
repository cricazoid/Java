package beans;
/* Classe com os atributos do produto
 * Class with the product's attributes
 */
public class Product {
	//Variáveis, variables
	private String nome;
	public Double preco;
	public Double total;
	
	/* Construtor 
	 * parametro: String contendo os dados de um produto
	 * retorno: um produto
	 * Constructor
	 * parameter: String containing product data
     * return: one product
	 */
    public Product product(String line) {
    	String[] item = line.split(",");
		Double precouni = Double.valueOf(item[1]);
		Double multiplaca = Double.valueOf(item[2]);
		Double total = precouni*multiplaca;
		return new Product(item[0],precouni, total);
		
	}
	/* Construtor
	 * parametro: String nome, Double peco, Double total
	 * retorno: um produto
	 * Constructor
	 * parameter: String nome, Double peco, Double total
     * return: one product
	 */
    public Product(String nome, Double peco,Double total) {
		this.setNome(nome);
		this.setPreco(peco);
		this.setTotal(total);
	}
	/* Construtor
	 * Constructor
	 */
    public Product() {
	}
	/* 
	 * Getters and Setters
	 */
    public String getNome() {
		return nome;
	}
    public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
    /*
     * ToString
     */
	@Override
	public String toString() {
		return "[Nome= " + nome + ", preco= " + preco + ", total= "+total+"]";
	}

	
}
