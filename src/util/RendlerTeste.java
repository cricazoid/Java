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
        String content = "";
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
          path = Paths.get("C:/", "Users\\Cristiano\\Documents", "out.txt");
		  try {
			Files.writeString(path, line, StandardOpenOption.APPEND);
			Files.write(path, System.getProperty("line.separator").getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return true;
	}
}
