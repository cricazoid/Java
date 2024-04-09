package util;

public enum Ordena {
      
	porNome(1),
	porPreco(2),
	porNomeReverso(3),
	porPrecoReverso(4);
	
	int metodo;
    private Ordena(int metodo) {
		this.metodo = metodo;
	}
	public int getMetodo() {
		return metodo;
	}

	
	
}
