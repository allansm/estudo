algoritmo "classificação de atletas"
// Função :
// Autor :
// Data : 8/29/2015
// Seção de Declarações 
var
nome,categoria : caractere
idade : inteiro
inicio
Escreva ("nome do atleta = ")
Leia (nome)
Escreva ("idade do atleta = " )
Leia (idade)
Escolha idade
caso 5,6,7,8,9,10
categoria <- "infantil"
caso 11,12,13,14,15
categoria <- "juvenil"
caso 16,17,18,19,20
categoria <- "junior"
caso 21,22,23,24,25
categoria <- "profissional"
outrocaso
categoria <- "invalido"
fimescolha
Escreva ("Categoria = ",categoria)
fimalgoritmo
