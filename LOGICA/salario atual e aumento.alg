algoritmo "salario nome e aumento"
// Função :
// Autor :
// Data : 9/3/2015
// Seção de Declarações 
var
salarioatual,aumento,novosalario,percent : real
nome : caractere
inicio
Escreval ("para ver informaçoes sobre seu novo salario")
escreva ("digite seu nome : ")
leia (nome)
escreva ("digite seu salario atual : ")
leia (salarioatual)
se (salarioatual > 0) e (salarioatual <= 400)entao
aumento <- 0.15
fimse
se (salarioatual >= 401) e (salarioatual <= 700) entao
aumento <- 0.12
fimse
se (salarioatual >= 701) e (salarioatual <= 1000) entao
aumento <- 0.10
fimse
se (salarioatual >= 1001) e (salarioatual <= 1800) entao
aumento <- 0.07
fimse
se (salarioatual >= 1801) e (salarioatual <= 2500) entao
aumento <- 0.04
fimse
se (salarioatual > 2500) entao
aumento <- 0
fimse
novosalario <- ((salarioatual)*((aumento)+(1)))
percent <- (aumento*100)
Escreval ("nome do funcionario : ",nome)
escreval ("aumento : ",percent,"%")
escreval ("salario atual : ",salarioatual)
escreval ("novo salario : ",novosalario)
fimalgoritmo
