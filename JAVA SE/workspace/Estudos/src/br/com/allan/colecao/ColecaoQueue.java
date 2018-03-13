package br.com.allan.colecao;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {
	public static void main(String[] args){
		Queue<String> fila = new LinkedList<>();
		fila.add("allan");
		fila.add("bill");
		fila.offer("jobs");
		System.out.println(fila);
		System.out.println(fila.peek());//fila.poll remove o proximo elemento da fila
		System.out.println(fila.poll());
		System.out.println(fila.peek());
		System.out.println(fila);
		LinkedList<String> f = (LinkedList<String>)fila;
		System.out.println(f);
		f.addFirst("sua mae");//adiciona ao inicio da fila
		f.addLast("meu ovo esquerdo");//adiciona ao final da fila
		System.out.println(f);
		System.out.println(f.peekFirst());//exibe o primeiro da fila
		System.out.println(f.peekLast());//exibe o ultimo da fila
		f.pollFirst();//remove o primeiro da fila
		f.pollLast();//remove o ultimo da lista
		System.out.println(f);
	}
}
