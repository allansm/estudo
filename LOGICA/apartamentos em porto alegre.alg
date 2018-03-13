algoritmo "semnome"
// Função : calcular o preço dos apartamentos em porto alegre encontrar o mais caro o mais barato do bairo do mais caro e calcular o aumento do preço
// Autor : Allan de souza melo
// Data : 9/13/2015
// Seção de Declarações 
var
t :vetor  [1..5,1..5] de real
a: inteiro
b: inteiro
c: inteiro
i : inteiro
mp : real
l : inteiro
mbt:real
procedimento leitura ():inteiro
inicio
para i de 1 ate 5 faca
escreva ("digite os valores dos apartamentos do centro : ")
leia (t[i,1])
fimpara
para i de 1 ate 5 faca
escreva ("digite os valores dos apartamentos de bela vista : ")
leia (t[i,2])
fimpara
para i de 1 ate 5 faca
escreva ("digite os valores dos apartamentos de petropolis : ")
leia (t[i,3])
fimpara
para i de 1 ate 5 faca
escreva ("digite os valores dos apartamentos de moinhos : ")
leia (t[i,4])
fimpara
para i de 1 ate 5 faca
escreva ("digite os valores dos apartamentos de bom fim : ")
leia (t[i,5])
fimpara
escreval ("            Apartamentos de porto alegre")
escreval ("            100m² 150m² 200m² 250m² 300m²       ")
escreval ("centro     : ",t[1,1],t[2,1],t[3,1],t[4,1],t[5,1])
escreval ("bela vista : ",t[1,2],t[2,2],t[3,2],t[4,2],t[5,2])
escreval ("petropolis : ",t[1,3],t[2,3],t[3,3],t[4,3],t[5,3])
escreval ("moinhos    : ",t[1,4],t[2,4],t[3,4],t[4,4],t[5,4])
escreval ("bom fim    : ",t[1,5],t[2,5],t[3,5],t[4,5],t[5,5])
escreval ("valores expressos em mil reais")
fimprocedimento
procedimento maiscaro ():inteiro
inicio
mbt <- 999999
mp <- 0
para i de 1 ate 5 faca
se t[i,1] > mp entao
mp <- t[i,1]
l <- 1
fimse
fimpara
para i de 1 ate 5 faca
se t[i,2] > mp entao
mp <- t[i,2]
l <- 2
fimse
fimpara
para i de 1 ate 5 faca
se t[i,3] > mp entao
mp <- t[i,3]
l <- 3
fimse
fimpara
para i de 1 ate 5 faca
se t[i,4] > mp entao
mp <- t[i,4]
l <- 4
fimse
fimpara
para i de 1 ate 5 faca
se t[i,5] > mp entao
mp <- t[i,5]
l <- 5
fimse
fimpara
para i de 1 ate 5 faca
se t[i,l] < entao
mbt <- t[i,l]
fimse
fimpara
escreval ("Apartamento mais caro : ",mp)
escreval ("Apartamento mais barato do bairo mais caro : ",mbt)
fimprocedimento
procedimento aumento() : real
inicio
para i de 1 ate 5 faca
se t[i,1] < 250 entao
t[i,1] <- t[i,1]*(1+0.05)
fimse
fimpara
para i de 1 ate 5 faca
se t[i,2] < 250 entao
t[i,2] <- t[i,2]*(1+0.05)
fimse
fimpara
para i de 1 ate 5 faca
se t[i,3] < 250 entao
t[i,3] <- t[i,3]*(1+0.05)
fimse
fimpara
para i de 1 ate 5 faca
se t[i,4] < 250 entao
t[i,4] <- t[i,4]*(1+0.05)
fimse
fimpara
para i de 1 ate 5 faca
se t[i,5] < 250 entao
t[i,5] <- t[i,5]*(1+0.05)
fimse
fimpara
escreval ("Apartamentos de porto alegre com aumento de 5% nos preços menores que 250mil")
escreval ("            100m² 150m² 200m² 250m² 300m²       ")
escreval ("centro     : ",t[1,1],t[2,1],t[3,1],t[4,1],t[5,1])
escreval ("bela vista : ",t[1,2],t[2,2],t[3,2],t[4,2],t[5,2])
escreval ("petropolis : ",t[1,3],t[2,3],t[3,3],t[4,3],t[5,3])
escreval ("moinhos    : ",t[1,4],t[2,4],t[3,4],t[4,4],t[5,4])
escreval ("bom fim    : ",t[1,5],t[2,5],t[3,5],t[4,5],t[5,5])
escreval ("valores expressos em mil reais")
fimprocedimento
inicio
escreval ("programa que le e calcula o preço dos apartamentos em porto alegre")
escreval ("valores expressos em mil reais")
leitura()
maiscaro()
aumento()
fimalgoritmo
