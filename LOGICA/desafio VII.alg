algoritmo "semnome"
// Função : ler um valor e dizer se ele esta contido ou nao no vetor se estiver dizer sua posição
// Autor :Allan de souza melo
// Data : 9/15/2015
// Seção de Declarações 
var
vet : vetor [1..100] de inteiro
val : inteiro
i: inteiro
x: inteiro
loc : inteiro
procedimento encontre () : inteiro
inicio
escreva ("digite o valor a ser lido : ")
leia (val)
x <- 1
para i de 1 ate 100 faca
vet[i] <- x+i-3
se (vet[i] = val) entao
loc <- i
fimse
x <- x+2
fimpara
fimprocedimento
inicio
escreval ("programa que le um valor e diz se está ou não contido no vetor")
escreval ("se sim ele deve dizer sua localização")
escreval ("se não deve dizer que o valor não esta contido no vetor")
encontre()
para i de 1 ate 100 faca
escreval ("vetor : ",i," : ",vet[i])
fimpara
para i de 1 ate 100 faca
se (val = vet[i]) entao
escreval ("o valor lido esta contido no vetor e esta na posição :" ,loc)
fimse
fimpara
se loc = 0 entao
escreval ("o valor lido não esta contido no vetor")
fimse
fimalgoritmo
