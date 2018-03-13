algoritmo "tabela"
// Função :montar uma tabela de valores de um numero
// Autor :allan de souza melo
// Data : 9/6/2015
// Seção de Declarações 
var
tabela : inteiro
fatorial,numero,divisores : inteiro
quadrado,cubo : real
primo : caractere
i : inteiro
k : inteiro
cabecalho : caractere
inicio
cabecalho <- "numero   quadrado   cubo   fatorial   divisores   primo"
divisores <- 0
fatorial <- 1
escreval (cabecalho)
para i de 1 ate 10 faca
numero <- i
quadrado <- numero^2
cubo <- numero^3
fatorial <- fatorial*i
para i de 1 ate numero passo 1 faca
se (numero % i = 0) entao
divisores <- divisores + 1
fimse
fimpara
se (divisores = 2) entao
primo <- "sim"
senao
primo <- "não"
fimse
escreval (numero,"         ",quadrado,"         ",cubo,"         ",fatorial,"         ",divisores,"       ",primo)
k <- k + 1
divisores <- 0
fimpara
se k = 20 entao
repita
escreval (cabecalho)
k <- k -20
ate k = 0
fimse
fimalgoritmo
