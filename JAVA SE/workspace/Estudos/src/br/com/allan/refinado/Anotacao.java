package br.com.allan.refinado;

import java.io.Serializable;

/*
 *    Exemplo de cabe�alho
 * Institui��o:           ???
 * projeto:               ??? 
 * Data de Cria��o:	      ???
 * Criador:               ???
 * Revisao:               ???
 */
@Cabecalho(
		instituicao = "???",
		projeto = "???",
		dataCriacao = "???",
		criador = "???",
		revisao = 2
)
@ErrosCorrigidos(erros = {"0001,0002"})
@SuppressWarnings("serial")
public class Anotacao  implements Serializable{
	@SuppressWarnings("unused")
	private int x;
	
	@Deprecated
	public void anotar(){}
	
	@Override
	public String toString(){
		return null;
	}
}
