package br.com.allan.metodos;

public class IMC {
	private Double peso;
	private Double altura;
	private Double imc;
	public IMC(){
		
	}
	public IMC(Double peso,Double altura){
		this.peso = peso;
		this.altura = altura;
		this.imc = (this.peso/(this.altura*this.altura));
	}
	public void estado(){
		if(this.imc < 18){
			System.out.println("magro");
		}
		else if(this.imc >=18 && this.imc<25){
			System.out.println("peso normal");
		}
		else if(this.imc >=25 && this.imc<30){
			System.out.println("sobrepeso");
		}
		else if(this.imc >=30 && this.imc<35){
			System.out.println("obesidade I");
		}
		else if(this.imc >=35 && this.imc<40){
			System.out.println("obesidade II");
		}
		else if(this.imc >40){
			System.out.println("obesidade III");
		}
	}
}
