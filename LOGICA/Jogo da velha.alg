algoritmo "jogo da velha"
// Função :
// Autor : Allan de souza melo
// Data : 12/01/2016
// Seção de Declarações
procedimento escrita() :caractere
var
inicio
para i de 1 ate 3 faca     //escrevendo na tela
   escreva(velha[1,i])
   escreva (" ")
fimpara
escreval (" ")
para i de 1 ate 3 faca
   escreva(velha[2,i])
   escreva (" ")
fimpara
escreval (" ")
para i de 1 ate 3 faca
   escreva(velha[3,i])
   escreva (" ")
fimpara
escreval(" ")        //termino da escrita
fimprocedimento
var
velha : vetor[1..3,1..3] de caractere
i : inteiro
a : caractere
select1,select2 : caractere
j: inteiro
v1,v2 : inteiro
gameover: inteiro
c1,c2 :caractere
inicio
gameover <- 0
c1 <- "no"
c2 <- "no"
para i de 1 ate 3 faca
   a <- numpcarac(i)
   velha[1,i] <- ("A" + a)
fimpara
para i de 1 ate 3 faca
   a <- numpcarac(i)
   velha[2,i] <- ("B" + a)
fimpara
para i de 1 ate 3 faca
   a <- numpcarac(i)
   velha[3,i] <- ("C" + a)
fimpara
escreval ("Bem vindo ao jogo da velha")
escreval ("para jogar selecione uma casa EX: A1")
escrita()
j <- 1
v1 <- 0
v2 <- 0
enquanto (v1 = 0) e (v2 = 0) faca
   escreva("player X escolha uma casa : ")
   leia(select1)
   se select1 = "O" entao
      c1 <- "cheater"
         se c1 = "cheater" entao
            escreval(" ")
            escreval ("Tentativa de roubo do jogador 1 X")
            escreval ("O vencedor e o Jogador 2 O")
            v2 <- 1
            fimalgoritmo
         fimse
   fimse
   repita
      para i de 1 ate 3 faca
         se velha[j,i] = select1 entao
            velha[j,i] <- "X"
         fimse
      fimpara
   j <- j + 1
   ate j = 4
   fimrepita //fim do round 1
   j <- 1
   gameover <- gameover + 1
   se gameover = 9 entao
      escreval (" ")
      escreval("GAME OVER o jogo deu empate ")
      fimalgoritmo
   fimse
   escrita()

   //verificando o vencedor player 1
   escreval (" ")
   se (velha[1,1] = "X") e (velha[1,2] = "X") e (velha[1,3] = "X") entao //1
      escreval ("O vencedor é o X")
      v1 <- 1
   senao
      se (velha[2,1] = "X") e (velha[2,2] = "X") e (velha[2,3] = "X")entao //2
         escreval("O vencedor é o X")
         v1 <- 1
      senao
         se (velha[3,1] = "X") e (velha[3,2] = "X") e (velha[3,3] = "X")entao //3
            escreval("O vencedor é o X")
            v1 <- 1
         senao
            se (velha[1,1] = "X") e (velha[2,1] = "X") e (velha[3,1] = "X")entao //4
               escreval("O vencedor é o X")
               v1 <- 1
            senao
               se (velha[1,2] = "X") e (velha[2,2] = "X") e (velha[3,2] = "X")entao //5
                  escreval("O vencedor é o X")
                  v1 <- 1
               senao
                  se (velha[1,3] = "X") e (velha[2,3] = "X") e (velha[3,3] = "X")entao //6
                     escreval("O vencedor é o X")
                     v1 <- 1
                  senao
                     se (velha[1,1] = "X") e (velha[2,2] = "X") e (velha[3,3] = "X")entao //7
                        escreval("O vencedor é o X")
                        v1 <- 1
                     senao
                        se (velha[1,3] = "X") e (velha[2,2] = "X") e (velha[3,1] = "X")entao  //8
                           escreval("O vencedor é o X")
                           v1 <- 1
                        fimse
                     fimse
                  fimse
               fimse
            fimse
         fimse
      fimse
   fimse
se v1 = 1 entao
   fimalgoritmo
fimse
escreva("player O escolha uma casa : ")
   leia(select2)
   se select2 = "X" entao
      c2 <- "cheater"
         se c2 = "cheater" entao
            escreval(" ")
            escreval ("Tentativa de roubo do jogador 2 O")
            escreval ("O vencedor e o Jogador 1 X")
            v1 <- 1
            fimalgoritmo
         fimse
   fimse
   repita
      para i de 1 ate 3 faca
         se velha[j,i] = select2 entao
            velha[j,i] <- "O"
         fimse
      fimpara
   j <- j + 1
   ate j = 4
   fimrepita //fim do round 2
   gameover <- gameover + 1
   j <- 1
   se gameover = 9 entao
      escreval(" ")
      escreval("GAMEOVER o jogo deu empate")
      fimalgoritmo
   fimse
   escrita()
   escreval(" ")
   //verificando o vencedor player 2
   se (velha[1,1] = "O") e (velha[1,2] = "O") e (velha[1,3] = "O") entao //1
      escreval ("O vencedor é o O")
      v2 <- 1
   senao
      se (velha[2,1] = "O") e (velha[2,2] = "O") e (velha[2,3] = "O")entao //2
         escreval("O vencedor é o O")
         v2 <- 1
      senao
         se (velha[3,1] = "O") e (velha[3,2] = "O") e (velha[3,3] = "O")entao //3
            escreval("O vencedor é o O")
            v2 <- 1
         senao
            se (velha[1,1] = "O") e (velha[2,1] = "O") e (velha[3,1] = "O")entao //4
               escreval("O vencedor é o O")
               v2 <- 1
            senao
               se (velha[1,2] = "O") e (velha[2,2] ="O") e (velha[3,2] = "O")entao //5
                  escreval("O vencedor é o O")
                  v2 <- 1
               senao
                  se (velha[1,3] = "O") e (velha[2,3] = "O") e (velha[3,3] = "O")entao //6
                     escreval("O vencedor é o O")
                     v2 <- 1
                  senao
                     se (velha[1,1] = "O") e (velha[2,2] = "O") e (velha[3,3] = "O")entao //7
                        escreval("O vencedor é o O")
                        v2 <- 1
                     senao
                        se (velha[1,3] = "O") e (velha[2,2] = "O")e (velha[3,1] = "O")entao  //8
                           escreval("O vencedor é o O")
                           v2 <- 1
                        fimse
                     fimse
                  fimse
               fimse
            fimse
         fimse
      fimse
   fimse
se v2 = 1 entao
   fimalgoritmo
fimse
fimenquanto
fimalgoritmo
