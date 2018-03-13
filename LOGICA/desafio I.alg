algoritmo "desafio I"
// Função :
// Autor :
// Data : 8/31/2015
// Seção de Declarações 
var
chopp,pizza,cobertura,pessoas,garcom,conta : real
inicio
escreval ("programa que calcula o gasto de uma turma em uma pizzaria")
escreva ("numero de chopps comprados : ")
leia (chopp)
escreva ("numero de coberturas pedidas : ")
leia (cobertura)
escreva ("numero de pizza's : ")
leia (pizza)
escreva ("numero de pessoas do grupo : ")
leia (pessoas)
chopp <- (chopp*0.80)
cobertura <- (cobertura*1.50)
pizza <- (pizza*10.00)
garcom <- (0.10+1)
conta <- (((pizza+cobertura+chopp)*garcom)/pessoas)
Escreval ("A conta dividida para ",pessoas," pessoas e igual a ",conta)
fimalgoritmo
