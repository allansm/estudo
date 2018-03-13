algoritmo "salario de um vendedor"
// Função :
// Autor :
// Data : 8/31/2015
// Seção de Declarações 
var
nome : caractere
salariofixo,totaldevendas,pgtv,salariototal : real
inicio
Escreval ("programa que calcula o salario total de um vendedor em cima do total de vendas")
escreva("digite o nome do vendedor : ")
leia (nome)
escreva ("digite seu salario fixo : ")
leia (salariofixo)
escreva ("digite o total de vendas : ")
leia (totaldevendas)
escreva ("digite o percentual ganho sobre o total de vendas : ")
leia (pgtv)
pgtv <- ((pgtv/100)+1)
salariototal <- ((salariofixo)*(totaldevendas*pgtv))
escreval ("o vendedor : ",nome, " recebe : ",salariototal)
fimalgoritmo
