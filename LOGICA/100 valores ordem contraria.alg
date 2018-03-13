algoritmo "100 valores ordem contraria"
// Função : ler 100 valores e escrever na ordem contraria
// Autor :allan de souza melo
// Data : 9/7/2015
// Seção de Declarações 
var
x : vetor [1..100] de inteiro
i : inteiro
inicio
escreval ("programa que le 100 valores e os escreve na ordem contraria")
para i de 1 ate 100 faca
leia (x[i])
fimpara
escreval ("ordem contraria")
i <- 100
repita
escreval (x[i])
i <- i - 1
ate i = 0
fimalgoritmo
