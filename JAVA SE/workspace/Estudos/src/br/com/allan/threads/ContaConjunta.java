package br.com.allan.threads;

public class ContaConjunta {
	private int saldo = 100;
	public int getSaldo(){
		return saldo;
	}
	public synchronized void sacar(int valor,String client){
		if(saldo >= valor){
			int saldoOriginal = saldo;
			System.out.println(client+" vai sacar");
			try{
				System.out.println(client+" esperando processamento");
				Thread.sleep(1000);
			}catch(Exception e){
				
			}
			saldo -=valor;
			String msg = client+" sacou "+valor+ " [saldo original = "+saldoOriginal+",saldo final = "+saldo+"]";
			System.out.println(msg);
		}else{
			System.out.println(client+" saldo insuficiente para "+client);
		}
	}
	public static void main(String[] args){
		
	}
}
