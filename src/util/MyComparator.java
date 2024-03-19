package util;

import java.util.Comparator;

import beans.Product;
/* Classe responsável por ordenar a lista
 * This class is responsible for ordering the list
 */
public class MyComparator {
	/* Método ordena a lista por preço
	 * Method Sort the list by price
	 */
    public Comparator porPreco() {
    	return  (p1,p2)->  ((Product) p1).getPreco().
    			compareTo(((Product) p2).getPreco());
    }
    /* Método ordena a lista por nome
	 * Method Sort the list by name
	 */
    public Comparator porNome() {
    	return  (p1,p2)->  ((Product) p1).getNome().toUpperCase().
    			compareTo(((Product) p2).getNome().toUpperCase());
    }
    /* Método ordena a lista por preço(ordem reversa)
	 * Method Sort the list by price(reverse ordem)
	 */
    public Comparator porPrecoReverso() {
    	return  (p1,p2)->  -((Product) p1).getPreco().
    			compareTo(((Product) p2).getPreco());
    }
    /* Método ordena a lista por nome(ordem reversa)
	 * Method Sort the list by name(reverse ordem)
	 */
    public Comparator porNomeReverso() {
    	return  (p1,p2)->  -((Product) p1).getNome().toUpperCase().
    			compareTo(((Product) p2).getNome().toUpperCase());
    }
}
