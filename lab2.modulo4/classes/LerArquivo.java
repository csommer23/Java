package classes;

import java.io.*;
import java.util.ArrayList;

public class LerArquivo {

	protected String caminho;
	
	public LerArquivo(String caminho) {		
		this.caminho = caminho;		
	}
	
	public ArrayList<String> abrirArquivoERetornoEmLista() {
		
		ArrayList<String> retorno = new ArrayList<String> ();
		try {
			File arquivo = new File(this.caminho);
			
			FileReader reader = new FileReader(arquivo);
			BufferedReader bufReader = new BufferedReader(reader);
	
			String linha;
	 
			while((linha = bufReader.readLine()) != null) {
				retorno.add(linha);
			}

			bufReader.close();
		} catch(IOException e) {}
		
		return retorno;
	}

}
