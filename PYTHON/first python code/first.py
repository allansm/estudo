# all study file
#!venv/bin/python
import pymysql
#include py file
from classe import test
from tkinter import *
import time
import threading

def breakCurse():
    print("Hello World")
def execute():
    try:
        a = input("value of a : ")
        if(float(a % 2) == 0):
            return "a e par"
        else:
            return "a e impar"
    except:
        return "erro durante a exeecucao do programa"


def soma(x,y):
    float(x)
    float(y)
    soma = x+y
    return soma

class person:
    #protected variable
    __name = "person"
    def setName(self,name):
        #self == this
        self.__name = name
    def getName(self):
        return self.__name
    def __showName(self):
        print("seu nome:"+self.__name)
    def doShowName(self):
        self.__showName()
    def insert(self):
        con = Connection().getBancoTeste()
        cursor = con.cursor()
        sql = "insert into pessoa(nome,sobrenome) values(%s,%s)"
        cursor.execute(sql,(self.__name,"qualquer"))
        con.commit();
class Connection:
    def getConnection(self):
        return pymysql.connect("localhost","root","","daily_exercise")
    def getBancoTeste(self):
        return pymysql.connect("localhost","root","","bancoteste")

class ExerciseDao:
    def all(self):
        connection = Connection()
        con = connection.getConnection()
        cursor = con.cursor(pymysql.cursors.DictCursor)
        cursor.execute("select * from exercises")
        return cursor.fetchall()
ed = ExerciseDao()
exercises = ed.all()
for exercise in exercises:
    if(exercise["title"] == "Flexão"):
        print(exercise["days"])
p = person();
p.setName("executadoAgora")
#p.insert()

test().execute()
breakCurse()
#window
root = Tk()
root.title("titulo")
root.geometry("200x100")
#frame
app = Frame(root)
app.grid()
label = Label(app,text = "rotulo")
label.grid(row=0,column=0)
val =StringVar()
entrada = Entry(app,width=10,textvariable=val)
entrada.grid(row=0,column=1)
def onClick():
    print(val.get())
button = Button(app,text="button",command=onClick)
button.grid(row=1,column=0)
class thread(threading.Thread):
    def __init__(self,i):
       threading.Thread.__init__(self)
       self.i = i
    def run(self):
        while(True):
            print(self.i)
            self.i+=2
            time.sleep(self.i)
thread = thread(1)
thread.start()

#run window
root.mainloop()
#while(True):
    #incognita = 0
    #time.sleep(1)


