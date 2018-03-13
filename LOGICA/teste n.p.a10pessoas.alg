algoritmo "teste n.p.a 10 pessoas"
// Função :
// Autor :
// Data : 9/5/2015
// Seção de Declarações 
var
nome : vetor[1..10] de caractere
peso,altura : vetor[1..10] de real
i : inteiro
p : real
media : real
amx : real
ni : inteiro
inicio
amx <- 0
i <- 1
p <- 0
repita
escreva ("nome : ")
leia (nome[i])
escreva ("peso : ")
leia (peso[i])
escreva ("altura : ")
leia (altura[i])
escreval (nome[i]," ",peso[i]," ",altura[i])
se altura[i] > amx entao
ni <- i
fimse
se amx > altura[i] entao
amx <- amx
senao
amx <- altura[i]
fimse
p <- p + peso[i]
i <- i + 1
ate (i = 10)
media <- ((p)/(10))
escreval (media)
escreval (amx)
escreval (ni)
escreval ("pessoa mais alta ",nome[ni])
fimalgoritmo
