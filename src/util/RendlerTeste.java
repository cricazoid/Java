package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.StandardOpenOption;

import beans.Product;

public class RendlerTeste {

	//Variáveis, variables
	private Product p = new Product();	
	private Path path;
	/* Construtor
	 * Constructor
	 */
	public RendlerTeste() { 
		
	}
	/* Método que lê os dados do arquivo e retorna a lista com os dados
	 * Method that reads the data from the file and returns the list 
	 */
	public List <Product> leArquivo() {
		List <Product> list = new ArrayList<>();
        path = Paths.get("C:/", "Users\\Cristiano\\Documents", "source.txt");
        String content = "Erouuuuuuuuuuu";
		try {
			content = Files.readString(path);
		} catch (IOException | UnsupportedOperationException e) {
			e.printStackTrace();
			return new ArrayList<Product>();
		}
    	String[] item = content.split("\n");
    	for (String line : item) {
            Product product = p.product(line);
			list.add(product);
		}
		return list;
	}
	/* Método escreve os dados no arquivo retorna true se escreveu e false se não
	 * Method writes the data to the file returns true if written e false if not
	 */
	public Boolean escreve(String line) {
       /* String path2  = path.SAIDA.getPath();
        //true indica que o aruivo já existe e add, true the file exists and add the line
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2,true))) {
        	bw.write(line);
        	bw.newLine();  
        } catch (IOException e) {
			System.out.println(e.getMessage());
			return false;
          }	*/
        return true;
	}
}
