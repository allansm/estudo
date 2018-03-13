algoritmo "semnome"
// Função :
// Autor :
// Data : 9/14/2015
// Seção de Declarações 
var
letras: vetor [1..1000] de literal
Npalavras : inteiro
i : inteiro
esp : inteiro
p : literal

procedimento rtp () : inteiro
inicio
Npalavras <- 0
para i de 1 ate 1000 faca
leia (letras[i])
p <- ""
se letras[i] <> p entao
Npalavras <- Npalavras + 1
fimse
fimpara
escreval (Npalavras)
fimprocedimento
inicio
rtp ()
fimalgoritmo
