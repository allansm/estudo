package br.com.allan.estudo;

import java.util.ArrayList;

import br.com.allan.metodos.Serializar;
import br.com.allan.poo.Pessoa;

public class Test3 {
	public static void main(String[] args) throws Exception{
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Allan",21,48.0,1.76));
		pessoas.add(new Pessoa("test",50,80.0,1.50));
		pessoas.add(new Pessoa("test2",25,50.0,1.80));
		Serializar serializar = new Serializar();
		serializar.salvar("c:/users/allan/desktop", "pessoas", pessoas);
	}
}
