package colecao;

import java.util.ArrayList;
import java.util.List;

public class ColecaoLista {
	public static void main(String[] args){
		List<String> list = new ArrayList<>();
		list.add("surf");
		list.add("skateboarding");
		list.add("basquet");
		list.add("voley");
		list.add("hockey");
		list.add("esgrima");
		list.add("e o fodase");
		list.add("skateboarding");
		System.out.println(list);
		for(int i = 0 ;i < list.size();i++){
			String letra = list.get(i);
			list.set(i, letra.toUpperCase());
		}
		System.out.println(list);
		System.out.println(list.indexOf("SKATEBOARDING"));//encontra o i9ndice de um elemento
		System.out.println(list.subList(2, 4));//gera uma sublista dentro da lista
		list.subList(2, 4).clear();
		System.out.println(list);
	}
}
