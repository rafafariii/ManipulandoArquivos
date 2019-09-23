package br.com.itau.au.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.print.DocFlavor.INPUT_STREAM;
public class LeitorArquivo {

	public static void main(String[] args) {
		try {
			FileInputStream arquivo = new FileInputStream("arquivo.txt");
			InputStreamReader input = new InputStreamReader(arquivo);
			BufferedReader br 		= new BufferedReader(input); 
			String linha;
			do {
				linha = br.readLine();
				if (linha != null) {
					String [] palavras = linha.split(";");
					System.out.println("Nova Linha ----------------" );
					for (int i=0; i<palavras.length; i++) {
						String cpf = palavras[1];						
						System.out.println("cpf = "+cpf);
						System.out.println("Palavra Lida = "+palavras[i]);
					}
				}
			}while (linha != null);
			
			
		}catch (Exception e) {
			System.out.print("Erro ao ler arquivo");
		}

	}

	private static InputStream InputStream(FileInputStream arquivo) {
		// TODO Auto-generated method stub
		return null;
	}

}
