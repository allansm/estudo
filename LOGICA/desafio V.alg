algoritmo "semnome"
// Função :ler 20 valores para V por em ordem crescente ler 10 valores para A inserir em V de forma que continuem em ordem crescente
// Autor :Allan de souza melo
// Data : 9/10/2015
// Seção de Declarações 
var
v : vetor [1..30] de inteiro
A : vetor [1..10] de inteiro
i : inteiro
z: inteiro
k: inteiro
l : inteiro
m : inteiro
procedimento troca (var x,y : inteiro )
var
z: inteiro
inicio
z <- x
x <- y
y <- z
fimprocedimento
inicio
escreval ("programa que le 20 valores para V")
escreval ("poem seus valores em ordem crescente")
escreval ("le 10 valores para A")
escreval ("e insere os 10 valores de A em V tornando ele em V(30)")
escreval ("de forma que os valores de V continuem em ordem crescente")
para i de 1 ate 20 faca
escreval ("digite o valor de V",i," : ")
leia (v[i])
fimpara
escreval ("ordem crescente de V : ")
para l de 3 ate 20 faca
para k de 2 ate 20 faca
para i de 1 ate 20 faca
enquanto nao (v[i] <= v[k]) e (v[k] <= v[l]) faca
se (v[l] < v[k]) entao
troca (v[l],v[k])
fimse
se (v[k] < v[i]) entao
troca (v[k],v[i])
fimse
fimenquanto
fimpara
fimpara
fimpara
para i de 1 ate 20 faca
escreval ("V",i," : ",v[i])
fimpara
para i de 1 ate 10 faca
escreval ("digite os valores de A",i," : ")
leia (A[i])
fimpara
escreval ("valores de A : ")
para i de 1 ate 10 faca
escreval ("A",i," : ",A[i])
fimpara
para i de 21 ate 30 faca
k <- i - 20
v[i] <- A[k]
fimpara
para l de 3 ate 30 faca
para k de 2 ate 30 faca
para i de 1 ate 30 faca
enquanto nao (v[i] <= v[k]) e (v[k] <= v[l]) faca
se (v[l] < v[k])entao
troca (v[l],v[k])
fimse
se (v[k] < v[i]) entao
troca (v[k],v[i])
fimse
fimenquanto
fimpara
fimpara
fimpara
escreval ("valores de V(30) em ordem crescente : ")
para i de 1 ate 30 faca
escreval ("V",i," : ",v[i])
fimpara
fimalgoritmo
