package br.com.allan.threads;

public class ComprasEmFamilia implements Runnable{
	ContaConjunta conta = new ContaConjunta();
	
	public void run(){
		String client = Thread.currentThread().getName();
		for(int i = 0; i < 5; i ++){
		conta.sacar(20, client);
			if(conta.getSaldo() <0){
				System.out.println("Estourou");
			}
		}
	}
	public static void main(String[] args){
		ComprasEmFamilia irAsCompras = new ComprasEmFamilia();
		new Thread(irAsCompras,"Pai").start();
		new Thread(irAsCompras,"Mãe").start();
		new Thread(irAsCompras,"Filha").start();
		new Thread(irAsCompras,"Babá").start();
		
	}
}
