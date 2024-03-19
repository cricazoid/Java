package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import beans.Product;
/* Classe responsável pela manipulação dos arquivos(leitura e a escrita)
 * This class is responsible for handling files (reading and writing)
 */
public class FileRendler {
	//Variáveis, variables
    private String line;
	private Product p = new Product();	
	private Path path;
	/* Construtor
	 * Constructor
	 */
	public FileRendler() { 
		
	}
	/* Método que lê os dados do arquivo e retorna a lista com os dados
	 * Method that reads the data from the file and returns the list 
	 */
	public List <Product> leArquivo() {
		String path3 = this.path.ENTRADA.getPath();
		List <Product> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(path3))){
			line = br.readLine();
			while (line != null) {
				Product product = p.product(line);
				list.add(product);
				line = br.readLine();  
			}
		} catch (IOException e) { 
			System.out.println(e.getMessage());
			return new ArrayList<Product>();
		  }	
		return list;
	}
	/* Método escreve os dados no arquivo retorna true se escreveu e false se não
	 * Method writes the data to the file returns true if written e false if not
	 */
	public Boolean escreve(String line) {
        String path2  = path.SAIDA.getPath();
        //true indica que o aruivo já existe e add, true the file exists and add the line
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2,true))) {
        	bw.write(line);
        	bw.newLine();  
        } catch (IOException e) {
			System.out.println(e.getMessage());
			return false;
          }	
        return true;
	}
}
