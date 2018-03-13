package estudo;

import java.util.ArrayList;

import metodos.IMC;
import metodos.Serializar;
import poo.Pessoa;

public class Test4 {
	public static void main(String[] args)throws Exception{
		Serializar serializar = new Serializar();
		ArrayList<Pessoa> pessoas = (ArrayList<Pessoa>)serializar.ler("c:/users/allan/desktop/pessoas.obj");
		IMC imc = new IMC(pessoas.get(2).getPeso(),pessoas.get(2).getAltura());
		System.out.print(pessoas.get(2).getNome()+" você é ");
		imc.estado();
	}
}
