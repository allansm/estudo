algoritmo "N80 menor elemento de N"
// Função : encontra o menor elemento de N
// Autor :Allan de souza melo
// Data : 9/7/2015
// Seção de Declarações 
var
N : vetor [1..80] de inteiro
i : inteiro
me : inteiro
mi : inteiro
inicio
escreval ("programa que encontra o menor elemento de N e sua localização")
me <- 99999999
para i de 1 ate 80 faca
leia (N[i])
se (me >= N[i]) entao
me <- N[i]
mi <- i
fimse
fimpara
para i de 1 ate 80 faca
escreval ("N",i," : ",N[i])
fimpara
escreval ("o menor elemento de N é : ",me," e a sua posição é : N",mi)
fimalgoritmo
