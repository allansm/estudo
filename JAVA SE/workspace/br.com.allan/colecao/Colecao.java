package colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecao {
	public static void main(String[] args){
		Collection<String> c = new ArrayList<>();
		c.add("A");//adiciona um elemento
		c.add("l");
		c.add("n");
		System.out.println(c.toString());
		System.out.println(c.isEmpty());
		System.out.println(c.contains("l"));
		c.remove("l");//remove um elemento
		System.out.println(c.toString());
		Collection<String> c2 = Arrays.asList("l","a");
		c.addAll(c2);//adiciona todos os determinados elementos
		System.out.println(c.toString());
		System.out.println(c.containsAll(c2));
		c.removeAll(c2);//remove todos os determinados elementos
		System.out.println(c.toString());
		for(String a:c){//foreach
			System.out.println(a);
		}
		String[] s = c.toArray(new String[c.size()]);//transforma uma coleçao em um array
		System.out.println(Arrays.toString(s));
		c.clear();//limpa uma lista
		System.out.println(c);
	}
}
