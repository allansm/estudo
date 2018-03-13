package br.com.allan.estudo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.allan.poo.Conta;

public class Arquivo3 {
	Path path = Paths.get("c:/users/allan/desktop/bank/accounts.txt");
	Charset meta = StandardCharsets.UTF_8;
	BufferedWriter escreva = null;
	BufferedReader leia = null;
	public void cadastro(ArrayList<Conta> contas) throws IOException{
		try{
			byte[] bytes = "vai".getBytes();
			Files.createDirectories(path.getParent());
			Files.write(path,bytes);
			escreva = Files.newBufferedWriter(path,meta);
			for(int i = 0;i<contas.size();i++){
				String cliente = "cliente : "+ contas.get(i).getCliente();
				String saldo = "Saldo   : R$"+contas.get(i).getSaldo();
				escreva.write(cliente );
				escreva.newLine();
				escreva.write(saldo);
				escreva.newLine();
				escreva.newLine();
				escreva.flush();
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			escreva.close();
		}
	}
	public void leitura() throws IOException{
		try{
			leia = Files.newBufferedReader(path,meta);
			String linha = null;
			String txt = "";
			int i =0;
			while((linha = leia.readLine())!= null){
				txt = txt + linha+"\n";
			}
			JOptionPane.showMessageDialog(null, txt);
		}catch(Exception e){
			
		}finally{
			leia.close();
		}
	}
	public ArrayList<Conta> retorno() throws IOException{
		String[] dados = new String[3];
		try{
			leia = Files.newBufferedReader(path,meta);
			String linha = null;
			int i = 0;
			ArrayList<Conta> contas = new ArrayList<>();
			while((linha = leia.readLine()) != null){
				if(i == 2){
					i = 0;
				}else if (i == 0 || i == 1){
					dados[i] = linha;
					if(i == 1){
						String d = dados[0].replace("cliente : ","");
						String dd = (String) dados[1].subSequence(12, dados[1].length());
						Conta conta = new Conta(d,Double.parseDouble(dd));
						contas.add(conta);
						
					}
					i++;
					
				}
				
				
			}
			return contas;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return null;
		}finally{
			leia.close();
		}
		
	}
	
	public static void main(String[] args) throws IOException{
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
		Arquivo3 bank = new Arquivo3();
		bank.cadastro(contas);
		bank.leitura();
		ArrayList<Conta> contas2 = bank.retorno();
		for(int i = 0;i < contas2.size();i++){
			contas2.get(i).exibeSaldo();
		}
	}
}
