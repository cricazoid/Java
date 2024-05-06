package util;

import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;
import java.util.HashMap;
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
    	//new FileRendler().leArquivo()
		return new RendlerTeste().leArquivo();
	}
    /*Método recebe e ordena uma lista de acordo com o usuario
     *This method returns the list from the file   
     */
    public void ordenaLista(List<Product> list, int sorttype) {
    	HashMap<Integer,String> mapaOrdem = getMapa();
		try {
			list.sort((Comparator<? super Product>) Class.forName("util.MyComparator").
				getMethod(mapaOrdem.get(sorttype)).invoke(Class.forName("util.MyComparator").getDeclaredConstructor().newInstance()));
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
				| SecurityException | ClassNotFoundException | InstantiationException | NullPointerException e) {
			//System.out.println(e.toString());// Resolver Null pointer
			//e.printStackTrace();
		}
    }
    private HashMap<Integer, String> getMapa(){
    	HashMap<Integer,String> mapaOrdem = new HashMap<Integer ,String >();
		mapaOrdem.put( 1,"porNome");
		mapaOrdem.put( 2,"porPreco");
		mapaOrdem.put( 3,"porNomeReverso");
		mapaOrdem.put( 4,"porPrecoReverso");
    	return mapaOrdem;
    }
}
