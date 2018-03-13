algoritmo "informações de 250 pessoas"
// Função :
// Autor : allan de souza melo
// Data : 9/5/2015
// Seção de Declarações
var
nome: vetor [1..250] de caractere
sexo : vetor [1..250] de caractere
i : inteiro
altura,peso : vetor [1..250] de real
homens,mulheres : inteiro
media :real
percenth,percentf,total : real
amx : real
p : real
ni : inteiro
inicio
amx <- 0
i <- 1
p <- 0
escreval ("programa que le informações sobre um grupo de 250 pessoas")
escreval ("e informa dados estatisticos sobre elas")
homens <- 0
mulheres <- 0
repita
escreva ("digite o nome : ")
leia (nome[i])
escreva ("digite a altura : ")
leia (altura[i])
escreva ("digite o peso : ")
leia (peso[i])
escreva ("digite o sexo m para masculino e f para feminino : ")
leia (sexo[i])
se (amx <= altura[i]) entao
amx <- altura[i]
fimse
se (altura[i] >= amx) entao
ni <- i
fimse
p <- p + peso[i]
se (sexo[i] = "f") entao
mulheres <- mulheres + 1
fimse
se (sexo[i] = "m") entao
homens <- homens + 1
fimse
se (sexo[i] <> "f") e (sexo[i] <> "m") entao
escreval ("sexo invalido")
escreval ("tente outra vez")
fimse
i <- i + 1
ate i = 251
media <- ((p)/250)
se (homens > 0) e (mulheres > 0) entao
total <- ((homens)+(mulheres))
percenth <- (((homens)/(total))*(100))
percentf <- (((mulheres)/(total))*(100))
fimse
escreval ("total de pessoas : ",i-1)
escreval ("total de homens : ",homens)
escreval ("total de mulheres : ",mulheres)
escreval ("total de homens e mulheres : ",total)
escreval ("percentual de homens : ",percenth," % ")
escreval ("percentual de mulheres : ",percentf," % ")
escreval ("a media do peso das pessoas e de : ",media)
escreval (" A pessoa mais alta é : ",nome[ni])
se (homens = 0) e (mulheres = 0) entao
escreval ("sem a quantidade de homens e mulheres o calculo não pode dizer")
escreval ("o total de homens,mulheres e o percentual")
fimse
fimalgoritmo
