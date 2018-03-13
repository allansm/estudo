package br.com.pratica.test;

import java.io.File;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args){
		//test1();
		//test2();
		/*String url = "///192.168.1.7//users";
		Path path = Paths.get(url);
		test3(path);*/
		test4();
	}
	public static void test4(){
		/*test efetuado com sucesso listar diretorios em rede*/
		String url = "///192.168.1.7//users";
		Path path = Paths.get(url);
		try{
			DirectoryStream<Path> stream = Files.newDirectoryStream(path);
			for(Path p:stream){
				System.out.println(p.toAbsolutePath());
			}
		}catch(Exception e){
			System.err.println("fail");
		}
	}
	public static void test3(Path path){
		/*test efetuado com sucesso metodo recursivo para listar tds os subdiretorios da pasta path*/
		if(Files.isRegularFile(path)){
			System.out.println(path.toAbsolutePath());
		}else{
			String s = "\n"+path.toAbsolutePath();
			System.out.println(s.toUpperCase());
			try(DirectoryStream<Path> stream = Files.newDirectoryStream(path)){
				for(Path p : stream){
					test3(p);
				}
			}catch(Exception e){
				
			}
		}
	}
	public static void test2(){
		/*teste concluido efetuada a criaçao de arquivo na rede local*/
		File file = new File("///192.168.1.7//Users/ALEX/test.txt");
		if(!file.exists()){
			try{
				file.createNewFile();
			}catch(Exception e){
				System.out.println("erro!!!!");
			}
		}
		System.out.println(file.exists());
	}
	public static void test1(){
		/*teste fracaçado java protegido contra injeçao sql*/
		String senha = "123456";
		String autenticar = JOptionPane.showInputDialog("digite a senha");
		if(senha.equals(autenticar)){
			System.out.println("login efetuado com sucesso");
		}else{
			System.out.println("falha na autenticaçao");
		}
		System.out.println(autenticar);
		
	}
}
