package br.com.allan.metodos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serializar {
	/*******************************************************************
	 * exemplo de diretorio: C:/users/pessoa/desktop                   *
	 * exemplo de nome : contas                                        *
	 * metodo salvar :"c:/users/pessoa/desktop"+"/"+"contas"+".obj";   *
	 * @throws                                                         *
	 * @throws FileNotFoundException                                   *
	 * @author Allan de souza melo                                     *
	 * *****************************************************************/
	public void salvar(String diretorio,String nome,Object arquivo) throws Exception{
		String caminho = diretorio+"/"+nome+".obj";
		try(FileOutputStream fos = new FileOutputStream(caminho)){
			try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(arquivo);
			}
		}
	}
	public void salvar(String diretorio,String nome,ArrayList<Object> arquivo) throws Exception{
		String caminho = diretorio+"/"+"nome"+".obj";
		try(FileOutputStream fos = new FileOutputStream(caminho)){
			try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(arquivo);
			}
		}
	}
	public void salvar(String diretorio,String nome,Object[] arquivo) throws Exception{
		String caminho = diretorio+"/"+"nome"+".obj";
		try(FileOutputStream fos = new FileOutputStream(caminho)){
			try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(arquivo);
			}
		}
	}
	public Object ler(String caminho)throws Exception{
		try(FileInputStream fis = new FileInputStream(caminho)){
			try(ObjectInputStream ois = new ObjectInputStream(fis)){
				return ois.readObject();
			}
		}
	}
}
