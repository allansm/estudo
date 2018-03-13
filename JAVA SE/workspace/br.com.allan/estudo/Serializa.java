package estudo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import poo.Conta;

public class Serializa {
	public static void main(String[] args)throws Exception{
		String[] nome = {"allan","bill","steve"};
		Conta conta = new Conta("Allan",1000_000);
		Conta conta1 = new Conta("bill",1000_000_000.000);
		FileOutputStream fos = new FileOutputStream("c:/users/allan/desktop/test/objeto.ser");
		ObjectOutputStream oss = new ObjectOutputStream(fos);
		oss.writeObject(conta);
		oss.writeObject(conta1);
		oss.close();
		
		FileInputStream fis = new FileInputStream("c:/users/allan/desktop/test/objeto.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Conta c1 = (Conta) ois.readObject();
		Conta c2 = (Conta) ois.readObject();
		ois.close();
		
		c1.exibeSaldo();
		c2.exibeSaldo();
	}
}
