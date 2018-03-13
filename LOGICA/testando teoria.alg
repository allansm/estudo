algoritmo "semnome"
// Função :
// Autor :
// Data : 9/7/2015
// Seção de Declarações 
var
a,b,conjunto : inteiro
mmc,mdc : numerico
x : inteiro
inicio
leia (a,b)
se (a = b) entao
x <- a
fimse
se (a <= 10) e (b < 10) entao
x <- 2
fimse
se (a < 10) e (b <= 10) entao
x <- 2
fimse
se (a < 10)  e (b < 10) entao
x <- 2
fimse
se (a >= 10)  e (b >= 10) entao
x <- 10
fimse
se (a >= 100) e (b >= 100) entao
x <- 100
fimse
mmc <- (a*b)/x
escreval (mmc)
fimalgoritmo
