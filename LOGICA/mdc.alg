algoritmo "mdc"
// Função : calcular o mdc
// Autor : allan de souza melo
// Data : 9/7/2015
// Seção de Declarações 
var
mdc,a,b,x,y,z,k : inteiro
procedimento troca (var x,y : inteiro)
var
z : inteiro
inicio
z <- x
x <- y
y <- z
fimprocedimento
inicio
leia (a)
leia (b)
repita
k <- a mod b
se (a < b) entao
enquanto nao a > b faca
troca (a,b)
fimenquanto
fimse
se (a mod b <> 0) entao
troca (a,b)
troca (b,k)
fimse
ate a mod b = 0
se (a mod b = 0) entao
mdc <- b
escreval (mdc)
fimse
fimalgoritmo
