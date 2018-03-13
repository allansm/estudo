package br.com.allan.threads;

public class PonteTest {
	public static void main(String[] args){
		Ponte ponte = new PonteSynchronizada();
		new Thread(new Produtor(ponte)).start();
		new Thread(new Consumidor(ponte)).start();
	}
}
