from tkinter import *
import os

def gui():
    gui = Tk()
    gui.title("")
    gui.geometry("400x300")
    app = Frame(gui)
    app.grid()
    #label = Label(app,text="rotulo")
    #label.grid()
    def onClick():
        gui2 = Tk()
        gui.geometry("400x300")
        app2 = Frame(gui2)
        gui2.mainloop()
    Button(app,text="button",width=20,command=onClick) .grid()
    gui.mainloop()

gui()

