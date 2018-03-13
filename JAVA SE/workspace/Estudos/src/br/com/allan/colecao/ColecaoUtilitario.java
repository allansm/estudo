package br.com.allan.colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColecaoUtilitario {
	
	public static void main(String[] args){
		List<String> list = new ArrayList<>();
		list.add("guarana");
		list.add("2");
		list.add("uva");
		list.add("1");
		list.add("maça");
		list.add("3");
		list.add("banana");
		list.add("5");
		list.add("acai");
		list.add("4");
		list.add("coco");
		list.add("6");
		list.add("manga");
		System.out.println(list);
		Collections.sort(list);//ordena em ordem crescente e alfabetica um vetor
		System.out.println(list);
		Collections.reverse(list);//ordena de forma reversa um vetor
		System.out.println(list);
		Collections.shuffle(list);//embaralha um vetor
		System.out.println(list);
		Collections.addAll(list, "Cupuaçu","laranja","laranja");//adiciona mais de um elemento a uma coleçao
		System.out.println(list);
		System.out.println(Collections.frequency(list, "laranja"));//exibe a frequencia de um determinado elemento
		List<String> list2 = Arrays.asList("acerola","graviola");
		boolean d = Collections.disjoint(list, list2);
		System.out.println(d);
		System.out.println(list2);
		Collections.sort(list);
		int indice = Collections.binarySearch(list, "guarana");
		System.out.println(indice);
		Collections.fill(list, "acai");
		System.out.println(list);
		Collection<String> constante = Collections.unmodifiableCollection(list);
		System.out.println(constante);
	}
}
