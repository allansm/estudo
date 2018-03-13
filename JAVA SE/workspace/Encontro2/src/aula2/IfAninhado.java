package aula2;

public class IfAninhado {
	public static void main(String[] args){
		double n1=5,n2=5;
		double media = (n1+n2)/2;
		if(media < 4){
			System.out.println("a media foi : "+media);
			System.out.println("aluno reprovado");
		}else if(media <=6.9){
			System.out.println("a media foi : "+media);
			System.out.println("aluno em recuperação");
		}else{
			System.out.println("a media foi : "+media);
			System.out.println("aluno aprovado");
		}
	}
}
