package View;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {
	
	
		public void grava() throws IOException {
		 
		 
		FileWriter arq = new FileWriter("d:\\teste.txt");
		 PrintWriter gravarArq = new PrintWriter(arq);
		 
		 for(int i = 0; i < 1000; i++) {
			 gravarArq.println("valor de i: " + i); 
		 }
		 arq.close();
		
		}
		public void leitura() throws IOException {
		
		 FileReader arqleitura = new FileReader("d:\\teste.txt");
		 BufferedReader lerArq = new BufferedReader(arqleitura);
	 
	     String linha = lerArq.readLine(); 
	     int i = 0;
	     
	     while (linha != null) {
	    	 i++;
	    	 if(linha.contains("Cenoura")) {
	    		 System.out.println("linha: " + i + " conteudo: " + linha); 
	    	 } 
	    	 linha = lerArq.readLine();
	     }
	     
	     arqleitura.close();
	     
		}
	     
		public void atualiza() throws IOException {
		File arquivo = new File("d://teste.txt");
		
		FileReader arqleitura = new FileReader(arquivo);
		FileReader arqteste = new FileReader(arquivo);
		BufferedReader lerarq = new BufferedReader(arqleitura);
		
		
		int i = 0;

		boolean porNome = true;
		boolean porLinha = false;
			
		
		if(porNome == true) {
			String procura = "Cenoura";
			String novo = "Romã";
			
			tamanho tam = new tamanho();
			int contador = tam.contar(arqteste);
			
			String[] valores = new String[contador];
					
			String linha = lerarq.readLine();
			
			System.out.println(contador);
			
			for(int cont = 0;cont<contador;cont++)
			{
				if(linha.contains(procura)) {
				valores[cont] = novo;
				System.out.println("1");
				}
				else {
					valores[cont] = linha;
				}
				System.out.println(linha);
				linha = lerarq.readLine();
			}
			
			FileWriter arqgravar = new FileWriter(arquivo); 
			PrintWriter gravarArq = new PrintWriter(arqgravar);
			for(int f = 0; f<contador;f++) {
				System.out.println(valores[f]);
				gravarArq.println(valores[f]);
			}
			arqgravar.close();
			
		}
		
		else if(porLinha == true) {
			System.out.println();
		}
		
		else {
			
		}
		}
		
		public void deleta() throws IOException {
		
		File arquivo = new File("d://teste.txt");
		
		FileReader arqleitura = new FileReader(arquivo);
		FileReader arqteste = new FileReader(arquivo);
		BufferedReader lerarq = new BufferedReader(arqleitura);
		
		
		int i = 0;

		boolean porNome = true;
		boolean porLinha = false;
			
		
		if(porNome == true) {
			String procura = "Cenoura";
			
			tamanho tam = new tamanho();
			int contador = tam.contar(arqteste);
			
			String[] valores = new String[contador];
					
			String linha = lerarq.readLine();
			
			System.out.println(contador);
			int ajuda = 0;
			
			for(int cont = 0;cont<contador;cont++)
			{
				if(linha.contains(procura)) {
				System.out.println("1");
				ajuda++;
				}
				else {
					valores[cont-ajuda] = linha;
				}
				System.out.println(linha);
				linha = lerarq.readLine();
			}
			
			FileWriter arqgravar = new FileWriter(arquivo); 
			PrintWriter gravarArq = new PrintWriter(arqgravar);
			for(int f = 0; f<(valores.length-ajuda);f++) {
				System.out.println(valores[f]);
				gravarArq.println(valores[f]);
			}
			arqgravar.close();
			
		}
		
		}
		
		public static void main(String args[]) throws Exception {
			
		}
	
	}


