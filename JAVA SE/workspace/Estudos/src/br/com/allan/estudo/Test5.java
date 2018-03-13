package br.com.allan.estudo;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import br.com.allan.metodos.Binario;

public class Test5 {
	public static void main(String[] args)throws Exception{
		Binario binario = new Binario();
		Path path = Paths.get("c:/users/allan/desktop/binario/binario.txt");
		Files.createDirectories(path.getParent());
		Files.deleteIfExists(path);
		Files.createFile(path);
		BufferedWriter escreva = Files.newBufferedWriter(path);
		escreva.write("**leia com atenção cada palavra**");
		escreva.newLine();
		escreva.write(binario.textoBinario("se você chegou a esse ponto saiba que voce e muito troxa kkkkkkkkkkkk"));
		escreva.close();
	}
}
