package util;

import java.io.Console;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import beans.Product;
/* Classe responsável por apresentar as informações para o usuário
 * This class is responsible for handling files (reading and writing)
 */
public class Display {
	//Variáveis, variables
	UtilLista popuList = new UtilLista();
	int sorttype = 0;
	FileRendler fileRendler = new FileRendler();
	Scanner scanner = new Scanner(System.in);
	List <Product> list = popuList.retornaLista();
	/* Construtor
	 * Constructor
	 */
	public Display() {
	
	}
	/* Método que apresenta as opções para o usuário
	 * Method that presents options to the user
	 */
	public void apresenta() {
	  if(list.size()>0) {
		do {
			    menu();
			    if( sorttype != 0) {
			    	popuList.ordenaLista(list, sorttype);
					if(sorttype !=5) {
			        	for(Product p : list)
				          System.out.println(p);
				       esperarEnter();
			        }
					else {
						for(Product p : list)
			                fileRendler.escreve(p.toString());
		                fileRendler.escreve("----------------------------------------------");
					}
			    }
		} while (sorttype !=5);
        System.out.println("Arquivo modificado!!");
	  }
	  else
		  System.out.println("Erro ao percorer arquivo de entrada!!");

	}
	/* Método que espera a ação do usuário para continuar
	 * Method waits the user action to continue
	 */
	public void esperarEnter() {
		System.out.println("Aperte Enter para continuar:\n");
				try {
			        System.in.read();
			    } catch (IOException e) {
			        // TODO Auto-generated catch block
			        e.printStackTrace();
			    }
	}
	/* Método que apresenta o menu
	 * Method shows the menu
	 */
	public void menu(){
		do {
				System.out.println("Ordenar produtos:\n");
		        System.out.println("1-por nome, 2-por preço, 3-por nome(lista inversa)"
				+ " 4-preço reverso(lista inversa)\n ");
		        System.out.println("5 ou outra sair e escrever no arquivo.\n");
		        try {
		        	sorttype = Integer.parseInt(scanner.nextLine());
	        	} catch (NumberFormatException e) {
                    System.out.println("Escolha um NÚMERO de 1 a 5!!");
                    sorttype = 0;
                    scanner.reset();
		        }
		         if((sorttype < 1) || (sorttype > 5)) {
			         System.out.println("Escolha um NÚMERO de 1 a 5!!");
	          sorttype = 0;
	          menu();
		}
		}while(sorttype == 0);
	
	}

}
