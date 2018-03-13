algoritmo "N20 troca de vetores"
// Função :troca de vetores
// Autor : Allan de souza melo
// Data : 9/7/2015
// Seção de Declarações 
var
N : vetor [1..20] de inteiro
z : inteiro
i : inteiro
procedimento troca (var x,y : inteiro)
var
z : inteiro
inicio
z <- x
x <- y
y <- z
fimprocedimento
inicio
escreval ("programa que troca N1 de lugar com N20, N2 com N19 e N10 com N11")
para i de 1 ate 20 faca
leia (N[i])
fimpara
para i de 1 ate 20 faca
escreval ("N",i," : ",N[i])
fimpara
troca (N[1],N[20])
troca (N[2],N[19])
troca (N[10],N[11])
Escreval ("numeros trocados")
para i de 1 ate 20 faca
escreval ("N",i," : ",N[i])
fimpara
fimalgoritmo
