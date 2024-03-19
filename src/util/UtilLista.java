package util;

import java.util.List;

import beans.Product;

/* Classe responsável pelas operações que envolvem a lista
 * This class is responsible for the list operators
 */
public class UtilLista {
    // Variáveis, variables
	MyComparator mcomp = new MyComparator();
    /*Método que retorna a lista com os dados do arquivo
     *This method returns the list from the file   
     */
    public List<Product> retornaLista() {
		FileRendler fileRendler = new FileRendler();		
		return fileRendler.leArquivo();
	}
    /*Método recebe e ordena uma lista de acordo com o usuario
     *This method returns the list from the file   
     */
    public void ordenaLista(List<Product> list, int sorttype) {
    	switch (sorttype) {
		  case 1: {
	        list.sort(mcomp.porNome());
	        break;
		  }
		  case 2: {
	        list.sort(mcomp.porPreco());
	        break;
		  }
		  case 3: {
            list.sort(mcomp.porNomeReverso());
            break;
	     }
	     case 4: {
           list.sort(mcomp.porPrecoReverso());
           break;
	     }
		}
    }
}
