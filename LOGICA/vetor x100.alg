algoritmo "vetor x100"
// Função :
// Autor :
// Data : 9/7/2015
// Seção de Declarações 
var
x : vetor [0..100] de inteiro
i : inteiro
inicio
escreval ("programa que le um vetor X(100) e escreve")
escreval ("se X for nulo ele substitui o valor de X por 1")
para i de 1 ate 100 faca
leia (x[i])
fimpara
para i de 1 ate 100 faca
se x[i] = 0 entao
x[i] <- x[i] + 1
fimse
escreval ("X",i," = ",x[i])
fimpara
fimalgoritmo
