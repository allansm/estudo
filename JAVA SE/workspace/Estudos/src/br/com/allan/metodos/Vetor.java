package br.com.allan.metodos;

public class Vetor {
	/**
	 * selection sort:
	 * no primeiro la�o for s�o atribuidos valores aleatorios de 0 a 100 para o vetor
	 * no segundo la�o for � onde sao  efetuadas as trocas de valores dentro do vetor.
	 * o terceiro la�o for procura o primeiro menor valor dentro do vetor
	 * encontrado o menor valor a variavel menor recebe o indice do menor valor
	 * e continua procurando por valores menores ate que seja definido o indice do menor valor
	 * terminado o terceiro la�o for o bloco if verifica
	 * se a variavel menor � diferente do indice i se sim � efetuada a troca dos valores
	 * o vetor na posi��o i recebe o menor valor encontrado pelo terceiro la�o for
	 * a mesma coisa e feita para os outros indices o selection sort procura o segundo menor valor
	 * encontrado o menor valor o indice desse valor e atribuido a variavel menor
	 * se o indice menor for diferente do indice i os valores sao trocados
	 * o vetor na posi��o i recebe o menor valor e o vetor na posi��o menor recebe o valor do indice i
	 * essa opera�ao e feita ate que todos os valores fiquem em ordem do menor para o maior
	 * terminada a troca dos valores o quarto la�o for exibe no console o vetor ordenado
	 * */
	public void selectionSort(int vetor[]){
		
        int menor;//variavel menor responsavel pelo indice do menor valor 
        int aux; //variavel aux responsavel por auxiliar a troca de valores
        System.out.println("antes do selection sort");
        
        /* PRIMEIRO LA�O FOR */
        /*aqui sao atribuidos valores aleatorios ao vetor e exibidos no console*/
        for(int i=0;i<vetor.length;i++){
            vetor[i] = (int)Math.round(100+Math.random()*(0-100));//atribui�ao de valores aleatorios de 0 a 100 
            System.out.println("Valor : "+vetor[i]+" indice : "+i);//exibe o valor e a posi��o onde se encontra o valor antes da troca
        }
        
        /* SEGUNDO LA�O FOR */
        /*esse la�o for e responsavel pela troca de valores dentro do vetor*/
        for(int i =0;i<vetor.length-1;i++){
            menor = i;
            
            /* TERCEIRO LA�O FOR */
            /*esse la�o for e responsavel por encontrar o menor valor dentro do vetor*/
            for(int j = i+1;j<vetor.length;j++){//esse la�o for procura o menor valor dentro do vetor
                if(vetor[menor] > vetor[j]){//verifica o indice do menor valor dentro do vetor
                    menor = j;//atribui o indice do menor valor a variavel menor
                }
            }
            
            if(menor != i){//se o indice da variavel menor for diferente de i 
                aux = vetor[i]; //aux recebe o maior valor
                vetor[i] = vetor[menor];//vetor[i] recebe o menor valor
                vetor[menor] = aux;//vetor[menor] recebe o maior valor que foi armazenado em aux
            }
            
        }
        System.out.println("depois do selection sort");
        /* QUARTO LA�O FOR */
        /*esse la�o for e responsavel por exibir o vetor no console apos a troca dos valores*/
        for(int x = 0; x < vetor.length;x++){
            System.out.println("Valor : "+vetor[x]+" indice : "+x);
        }
	}
	public static void main(String[] args){
		Vetor troca = new Vetor();
		int[] vetor= new int[5];
		troca.selectionSort(vetor);
	}
}
