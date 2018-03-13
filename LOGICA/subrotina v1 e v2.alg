algoritmo "semnome"
// Função : fazer uma subrotina que recebe 2 valores v1 e v2 faz a sua soma e poem em um vetor v3
// Autor :allan de souza melo
// Data : 9/13/2015
// Seção de Declarações 
var
v1,v2 : vetor [1..100] de inteiro
v3 : vetor [1..101] de inteiro
soma : inteiro
i : inteiro
procedimento soma ():inteiro
inicio
para i de 1 ate 100 faca
escreva ("digite o valor de v1(",i,") : ")
leia (v1[i])
fimpara
para i de 1 ate 100 faca
escreva ("digite o valor de v2(",i,") : ")
leia (v2[i])
fimpara
para i de 1 ate 100 faca
v3[i] <- v1[i]+v2[i]
fimpara
fimprocedimento
inicio
escreval ("subrotina que recebe dois vetores V1(100) e V2(100) em que cada posição")
escreval ("contem um dígito e retorna V3(101) com a soma dos números nos vetores.")
soma()
para i de 1 ate 100 faca
escreval (" v3(",i,") = ",v3[i])
fimpara
fimalgoritmo
