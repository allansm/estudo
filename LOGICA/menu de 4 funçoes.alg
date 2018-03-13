algoritmo "semnome"
// Função :apresentar um menu de 3 opçoes
// Autor : allan de souza melo
// Data : 9/13/2015
// Seção de Declarações 
var
opcao : inteiro
numero : vetor [1..999] de inteiro
i : inteiro
tamanho : inteiro
nome : vetor [1..999] de caractere
procedimento insere (opcao : inteiro) : inteiro
var
aux : inteiro
inicio
se opcao = 1 entao
escreva ("indice : ")
leia (i)
escreva ("numero : ")
leia (numero[i])
escreva ("nome : ")
leia (nome[i])
fimse
fimprocedimento
procedimento remove (opcao :inteiro):inteiro
inicio
se opcao = 2 entao
escreva ("indice : ")
leia (i)
numero[i] <- 0
nome[i] <- ""
fimse
fimprocedimento
procedimento escreve (opcao : inteiro):inteiro
inicio
se opcao = 3 entao
escreva ("indice : ")
leia (i)
escreval ("nome : ",nome[i]," vetor : ",i," tamanho : ",numero[i])
fimse
fimprocedimento
inicio
escreval ("programa que apresenta 3 opcões para um vetor ")
repita
escreval ("menu")
escreval ("***********")
escreval ("1 – Inserir")
escreval ("2 – Remover")
escreval ("3 – Escrever na Tela o Vetor")
escreval ("4 – Sair")
escreva ("digite a opção : ")
leia (opcao)
insere (opcao)
remove (opcao)
escreve (opcao)
ate opcao = 4
fimalgoritmo
