package br.com.allan.threads;

public class PonteNaoSynchronizada implements Ponte {
	private int valor = -1;
	@Override
	public void set(int valor) throws Exception {
		System.out.print("produziu "+valor);
		this.valor = valor;
		
	}

	@Override
	public int get() throws Exception {
		System.err.print("consumiu "+valor);
		return valor;
	}

}
