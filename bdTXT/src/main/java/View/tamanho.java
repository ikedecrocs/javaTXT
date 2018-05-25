package View;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class tamanho {
	public int contar(FileReader arqleitura) throws IOException {
		
		BufferedReader lerarq = new BufferedReader(arqleitura);
		
		String testelinha = lerarq.readLine();
		
		int contador=0;
		
		while(testelinha != null) {
			contador++;
			testelinha = lerarq.readLine();
		}
		return contador;
	}
}
