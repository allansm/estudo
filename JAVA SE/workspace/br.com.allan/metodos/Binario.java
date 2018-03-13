package metodos;

import java.util.ArrayList;

public class Binario {
	public String paraBinario(Integer numero){
		if(numero <=255){
			String binario = "";
			int bits = 128;
			for(int i = 0;i<8;i++){
				if(numero >= bits){
					numero = numero - bits;
					binario = binario +1;
				}else{
					binario = binario + 0;
				}
				bits = bits/2;
			}
			return binario;
		}else{
			System.out.println("numero invalido");
			return null;
		}
	}
	public Integer paraDecimal(String binario){
		Integer decimal = 0;
			int bits = 128;
			 for(int i = 0;i<binario.length();i++){
					if(binario.charAt(i) == '1'){
						decimal = decimal + bits;
					}
			 		bits = bits/2;
			 }
			 
		return decimal;
	}
	public String ipParaBinario(int a,int b, int c,int d){
		String binario = paraBinario(a)+"."+paraBinario(b)+"."+paraBinario(c)+"."+paraBinario(d);
		return binario;
	}
	public String binarioParaIp(String a,String b,String c,String d){
		String ip = ""+paraDecimal(a)+"."+paraDecimal(b)+"."+paraDecimal(c)+"."+paraDecimal(d);
		return ip;
	}
	public Integer hostBits(Integer numero){
		String binario = paraBinario(numero);
		int bits = 0;
		for(int i = 0;i<binario.length();i++){
			if(binario.charAt(i) == '1'){
				bits = bits + 0;
			}else{
				bits = bits + 1;
			}
		}
		return bits;
	}
	public Integer ipValido(Integer hostBits){
		Integer ipValido = ((int)Math.pow(2, hostBits)-2);
		return ipValido;
	}
	public String barramento(int a,int b,int c ,int d){
		String binario = ipParaBinario(a,b,c,d);
		int bits = 0;
		for(int i = 0;i<binario.length();i++){
			if(binario.charAt(i) == '1'){
				bits++;
			}
		}
		return "/"+bits;
	}
	public String textoBinario(String texto){
		int decimal;
		String binario = "";
		for(int i = 0;i < texto.length();i++){
			decimal = texto.charAt(i);
			binario = binario + paraBinario(decimal);
		}
		return binario;
	}
	public String lerBinario(String binario){
		int valor = paraDecimal(binario);
		char letra = (char) valor;
		return ""+letra;
	}
	public String lerTextoBinario(String texto){
		String byteCode = "";
		String palavras = "";
		int contador = 0;
		for(int i = 0;i<texto.length();i++){
			if(contador == 8){
				palavras = palavras + lerBinario(byteCode);
				byteCode = "";
				contador = 0;
			}
				byteCode = byteCode + texto.charAt(i);
				contador++;
		}
		return palavras;		
	}
}
