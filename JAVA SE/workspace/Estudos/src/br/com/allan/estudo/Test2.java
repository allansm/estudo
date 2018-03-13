package br.com.allan.estudo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.allan.metodos.IMC;

public class Test2 implements java.io.Serializable{
	private String nome;
	private int idade;
	private double peso;
	private double altura;
	public Test2(){
		
	}
	public Test2(String nome,int idade,double peso,double altura){
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	public static void main(String[] args)throws Exception{
		Test2 p = new Test2("Allan",21,48,1.76);
		try(FileOutputStream fos = new FileOutputStream("c:/users/allan/desktop/test/test2.ser")){
			try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(p);
			}
		}
		try(FileInputStream fis = new FileInputStream("c:/users/allan/desktop/test/test2.ser")){
			try(ObjectInputStream ois = new ObjectInputStream(fis)){
				Test2 pessoa = (Test2) ois.readObject();
				IMC imc = new IMC(pessoa.peso,pessoa.altura);
				System.out.print(pessoa.nome +" você tem "+pessoa.idade +" anos de idade e pesa "+pessoa.peso+" kilos");
				System.out.print(" e você é : ");
				imc.estado();
			}
		}
	}
}
