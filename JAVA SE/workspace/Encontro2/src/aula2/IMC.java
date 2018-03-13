package aula2;

public class IMC {
	public static void main(String[] args){
		double altura = 1.76,peso = 50.0;
		double imc = peso/(altura*altura);
		if(imc < 18.5){
			System.out.println("imc : "+imc);
			System.out.println("peso abaixo do normal");
		}else if(imc <= 24.4){
			System.out.println("imc : "+imc);
			System.out.println("peso ideal");
		}else if(imc <= 29.9){
			System.out.println("imc : "+imc);
			System.out.println("pre obesidade");
		}else if(imc <= 34.9){
			System.out.println("imc : "+imc);
			System.out.println("obesidade 1");
		}else if(imc <= 39.9){
			System.out.println("imc : "+imc);
			System.out.println("obesidade severa");
		}else{
			System.out.println("imc : "+imc);
			System.out.println("obesidade morbida");
		}
	}
}
