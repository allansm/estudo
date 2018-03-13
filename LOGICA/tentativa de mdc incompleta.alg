algoritmo "semnome"
// Função :
// Autor :
// Data : 9/7/2015
// Seção de Declarações 
var
a,x,y,z : inteiro
mdc : numerico
inicio
y <- 1
z <- 1
mdc <- 1
x <- 2
leia (a)
se (a = 0) entao
escreval ("mdc = 0")
fimse
se (a <> 0) entao
repita
se (a mod x = 0) entao
a <- a div x
fimse
se (a mod x <> 0) entao
x <- x + 1
fimse
escreval ("divisor",x)
escreval ("a",a)
ate a <= 1
fimse
escreval ("mdc : ",mdc)
fimalgoritmo
