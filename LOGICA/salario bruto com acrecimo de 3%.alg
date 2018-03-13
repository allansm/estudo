algoritmo "salario bruto com acrescimo de 3% por filho"
// Função :calcular o salario bruto de um funcionario que recebe 3% a mais por filho em cima de seu salario bruto mensal
// Autor : allan
// Data : 8/30/2015
// Seção de Declarações 
var
htd,salarioph,nfilhos,salariobruto : real
nome :caractere
inicio
Escreval ("programa que calcula o salario de um funcionario")
escreva ("digite o nome do funcionario : ")
leia (nome)
escreva ("digite o numero de horas trabalhadas : ")
leia (htd)
escreva ("digite o valor que recebe por hora : ")
leia (salarioph)
escreva ("digite o numero de filhos : ")
leia (nfilhos)
nfilhos <- nfilhos*0.03+1
salariobruto <- (salarioph*(htd*30)*nfilhos)
Escreval ("o funcionario : ",nome," recebe por mês : ",salariobruto)
fimalgoritmo
