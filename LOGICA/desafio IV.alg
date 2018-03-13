algoritmo "mmc e mdc"
// Função : calcular o mmc e o mdc
// Autor : Allan de souza melo
// Data : 9/7/2015
// Seção de Declarações 
var
a,b :vetor [1..2] de inteiro
conjunto : inteiro
mmc,mdc : numerico
x : inteiro
z : inteiro
k : inteiro
n : inteiro
procedimento troca (var j,y : inteiro)
var
z: inteiro
inicio
z <- j
j <- y
y <- z
fimprocedimento
inicio
Escreval ("programa que diz o mmc e o mdc dos valores de A e B")
escreva ("digite a quantidade de conjuntos : ")
leia (conjunto)
repita
x <- 2
mmc <- 1
escreva ("digite o valor de A : ")
leia (a[1])
escreva ("digite o valor de B : ")
leia (b[1])
a[2] <- a[1]
b[2] <- b[1]
repita
k <- a[1] mod b[1]
se (a[1] < b[1]) entao
enquanto nao a[1] > b[1] faca
troca (a[1],b[1])
fimenquanto
fimse
se (a[1] mod b[1] <> 0) entao
troca (a[1],b[1])
troca (b[1],k)
fimse
ate a[1] mod b[1] = 0
se (a[1] mod b[1] = 0) entao
mdc <- b[1]
fimse
escreval ("mdc : ",mdc)
se (a[2] = 0) ou (b[2] = 0) entao
escreval ("mmc = 0")
fimse
se (a[2] <> 0) e (b[2] <> 0) entao
repita
se (a[2] mod x = 0) ou (b[2] mod x = 0) entao
se (a[2] mod x = 0)entao
a[2] <- a[2] div x
fimse
se (b[2] mod x = 0) entao
b[2] <- b[2] div x
fimse
se (a[2] <> 0) e (b[2] <> 0 ) entao
mmc <- x*mmc
fimse
fimse
se (a[2] mod x <> 0) e (b[2] mod x <> 0) entao
x <- x + 1
fimse
se (a[2] <= 1) e (b[2] <= 1) e (a[2] <> 0) e (b[2] <> 0) entao
escreval ("mmc : ",mmc)
fimse
ate (a[2] <= 1) e (b[2] <= 1)
fimse
conjunto <- conjunto - 1
ate conjunto = 0
fimalgoritmo
