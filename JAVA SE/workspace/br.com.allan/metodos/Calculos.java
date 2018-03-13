package metodos;

import javax.swing.JOptionPane;

public class Calculos {
	/**
	 * 
	 * @author Allan de souza melo
	 * 
	 * */
	public Boolean ehDigito(String numero){
		try{
			Double.parseDouble(numero);
			return true;
		}catch(Exception e){
			return false;
		}
	}
	public Boolean fimIndex(int tamanho,int valor){
		if(valor > tamanho){
			return true;
		}else{
			return false;
		}
	}
	public Boolean fimIndex(String formula,int i){
		try{
			formula.charAt(i+1);
			return true;
		}catch(Exception e){
			return false;
		}
	}
	public String proximoValor(String formula,int i){
		try{
			if(ehDigito(""+formula.charAt(i)) == true){
				return "numero";
			}else{
				return "String";
			}
		}catch(Exception e){
			return "vazio";
		}
	}
	public Double soma(double n1,double n2){
		return n1+n2;
	}
	public Double subtracao(double n1,double n2){
		return n1-n2;
	}
	public Double multiplicacao(double n1,double n2){
		return n1*n2;
	}
	public Double divisao(double n1,double n2){
		return n1/n2;
	}
	public Double calculo(String formula){
		String n1 = "";
		String n2 = "";
		String operacao = "";
		Double calculo = 0.0;
		int contador = 0;
		for(int i = 0;i<formula.length();i++){
			if(ehDigito(""+formula.charAt(i)) == true){
				if(contador == 0){
					n1 = n1 + formula.charAt(i);
				}else if(contador == 1){
					n2 = n2 + formula.charAt(i);
					if(proximoValor(formula,i+1)== "String" || proximoValor(formula,i+1)=="vazio"){
						if(operacao == "soma"){
							calculo = soma(Double.parseDouble(n1),Double.parseDouble(n2));
							n1 = "" + calculo;
							operacao = "";
							n2="";
						}else if(operacao == "subtracao"){
							calculo = subtracao(Double.parseDouble(n1),Double.parseDouble(n2));
							n1 = "" + calculo;
							operacao = "";
							n2="";
						}else if(operacao == "multiplicacao"){
							calculo = multiplicacao(Double.parseDouble(n1),Double.parseDouble(n2));
							n1 = "" + calculo;
							operacao = "";
							n2="";
						}else if(operacao == "divisao"){
							calculo = divisao(Double.parseDouble(n1),Double.parseDouble(n2));
							n1 = "" + calculo;
							operacao = "";
							n2="";
						}
					}
				}
			}else{
				if(formula.charAt(i) == '+'){
					operacao = "soma";
					contador = 1;
				}else if(formula.charAt(i) == '-'){
					operacao = "subtracao";
					contador = 1;
				}else if(formula.charAt(i) == '*'){
					operacao = "multiplicacao";
					contador = 1;
				}else if(formula.charAt(i) == '/'){
					operacao = "divisao";
					contador = 1;
				}else if(formula.charAt(i) == '.'){
					if(contador == 0){
						n1 = n1 + ".";
					}
				}else{
					operacao = "Erro fatal !!!!";
					System.err.println(operacao);
					JOptionPane.showMessageDialog(null,operacao, null, JOptionPane.ERROR_MESSAGE);
					return 0.0;
				}
			}
		}
		return calculo;
	}
	public Integer fatorial(Integer numero){
		int fat;
		fat = numero;
		for(numero = numero;numero>1;numero--){
			fat = (fat*(numero-1));
		}
		return fat;
	}
	public Boolean ePar(Integer numero){
		if(numero % 2 == 0){
			return true;
		}else{
			return false;
		}
	}
	public Boolean eImpar(Integer numero){
		if(numero % 2 == 1){
			return true;
		}else{
			return false;
		}
	}
	public Double media(Double[] numeros){
		double media = 0;
		for(int i = 0;i < numeros.length;i++){
			media = media + numeros[i];
		}
		media = media/numeros.length;
		return media;
	}
	public Double media(Double a,Double b,Double c){
		double media = (a+b+c)/3;
		return media;
	}
	public Double media(Double a,Double b){
		double media = (a+b)/2;
		return media;
	}
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
			if(i < (texto.length()-1)){
				binario = binario + ".";
			}
		}
		return binario;
	}
}
