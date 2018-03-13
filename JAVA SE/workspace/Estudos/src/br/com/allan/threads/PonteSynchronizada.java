package br.com.allan.threads;

public class PonteSynchronizada implements Ponte{
	private int valor = -1;
	private boolean ocupada = false;
	@Override
	public synchronized void set(int valor) throws Exception {
		while(ocupada){
			System.out.println("Ponte cheia. produtor deve aguardar");
			wait();
		}
		System.out.print("Produziu "+valor);
		this.valor = valor;
		ocupada = true;
		notifyAll();
	}

	@Override
	public synchronized int get() throws Exception {
		while(!ocupada){
			System.out.println("ponte vazia");
			wait();
		}

		System.err.print("Consumiu " + valor);
		ocupada = false;
		notifyAll();
		return valor;
	}

}
