package br.com.allan.estudo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {
	public static void main(String[] args){
		Path path = Paths.get("c:/test/test.txt");
		System.out.println(path.toAbsolutePath());
		System.out.println(path.getParent());
		System.out.println(path.getRoot());
		System.out.println(path.getFileName());
		try{
			Files.createDirectories(path.getParent());
			byte[] bytes = "sou foda e pronto U.U".getBytes();
			Files.write(path, bytes);
			byte[] retorno = Files.readAllBytes(path);
			System.out.println(new String(retorno));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
