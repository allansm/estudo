package colecao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ColecaoSet {
	public static void main(String[] args){
		String[] cores = {"verde","amarelo","azul","branco","vermelho","verde","azul","branco","amarelo"};
		List<String> list = Arrays.asList(cores);
		Set<String> set = new HashSet<>(list);//recebe um array mas nao recebe valores repetidos
		System.out.println(set);
	}
}
