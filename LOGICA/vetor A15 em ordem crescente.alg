algoritmo "vetor A15 ordem crescente "
// Função :por um vetor A15 em ordem crescente
// Autor :Allan de souza melo
// Data : 9/10/2015
// Seção de Declarações 
var
A :vetor [0..15] de inteiro
i : inteiro
z: inteiro
k : inteiro
l : inteiro
m : inteiro
procedimento troca (var x,y :inteiro)
var
z : inteiro
inicio
z <- x
x <- y
y <- z
fimprocedimento
inicio
para i de 1 ate 15 faca
leia (A[i])
fimpara
para i de 1 ate 15 faca
escreval ("A",i," : ",A[i])
fimpara
para l de 3 ate 15 faca
para k de 2 ate 15 faca
para i de 1 ate 15 faca
enquanto nao (A[i] <= A[k]) e (A[k] <= A[l]) faca
se (A[l] < A[k]) entao
troca (A[l],A[k])
fimse
se (A[k] < A[i]) entao
troca (A[k],A[i])
fimse
fimenquanto
fimpara
fimpara
fimpara
i <- 1
repita
escreval ("ordem crescente A",i," : ", A[i])
i <- i + 1
ate i = 16
fimalgoritmo
