package estudo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import poo.Conta;

public class Serializa2 {
	public void cadastro(ArrayList<Conta> contas) throws IOException{
		try(FileOutputStream fos = new FileOutputStream("c:/users/allan/desktop/test/contas.ser")){
			try(ObjectOutputStream oss = new ObjectOutputStream(fos)){
				oss.writeObject(contas);
			}
		}
	}
	public ArrayList<Conta> retorno() throws Exception{
		try(FileInputStream fis = new FileInputStream("c:/users/allan/desktop/test/contas.ser")){
			try(ObjectInputStream ois = new ObjectInputStream(fis)){
				return (ArrayList<Conta>) ois.readObject();
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		ArrayList<Conta> contas = new ArrayList<>();
		contas.add(new Conta("Allan",100000));
		contas.add(new Conta("bill",9999999));
		contas.add(new Conta("jobs",9999999));
		contas.add(new Conta("pobre",1.99));
		contas.add(new Conta("test",50.00));
		contas.add(new Conta("katia",0));
		contas.get(0).transferePara(contas.get(5), 50000);
		/*char a = 'a';
		for(int i =0;i<100;i++){
			contas.add(new Conta(Character.toString(a),0));
			a++;
		}*/
		Serializa2 bank = new Serializa2();
		bank.cadastro(contas);
		ArrayList<Conta> contas2 = bank.retorno();
		for(int i = 0;i < contas2.size();i++){
			contas2.get(i).exibeSaldo();
		}
	}
}
