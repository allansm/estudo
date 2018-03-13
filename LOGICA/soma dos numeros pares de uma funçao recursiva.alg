algoritmo "semnome"
// Função : função recursiva que recebe 100 valores e faz o calculo da soma dos numeros pares
// Autor :allan de souza melo
// Data : 9/14/2015
// Seção de Declarações 
var
i: inteiro
vet : vetor [1..100] de inteiro
par : inteiro
p:inteiro
result : inteiro
funcao soma (x :inteiro): inteiro
inicio
para p de 0 ate x passo 2 faca
se p = x entao
par <- par + x
fimse
fimpara
retorne par
fimfuncao
inicio
escreval ("função recursiva que recebe 100 valores e faz o calculo da soma dos numeros pares")
para i de 1 ate 100 faca
escreva ("digite um valor para o vetor ",i," : ")
leia (vet[i])
fimpara
para i de 1 ate 100 faca
result <- soma (vet[i])
fimpara
escreval ("soma dos valores pares do vetor e igual a : ",result)
fimalgoritmo
