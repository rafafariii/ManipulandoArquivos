package br.com.itau.au.app;

import java.io.FileOutputStream;
import java.io.PrintWriter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CargaRedisApplication {

	public static void main(String[] args) {
		
		try {
			FileOutputStream arquivo = new FileOutputStream("arquivo.txt");
			PrintWriter pr = new PrintWriter(arquivo);
			
			pr.println("40387157875;481025984;0001235;1;");
			pr.println("12334455667;324343545;0024235;1;");
			pr.println("12334354456;481143344;1211235;1;");
			pr.println("45365656325;488885984;7561235;1;");
			pr.println("40243465675;235465784;5741235;1;");
			
			pr.close();
			arquivo.close();
			System.out.print("Arquivo criado");
			
		}catch (Exception e ) {
				System.out.print("Erro ao Escrever Arquivo !");
				
		}
			
	}

}
