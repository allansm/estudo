from tkinter import *
from tkinter import ttk
from tkinter import messagebox

def ui1():
    gui = Tk()
    gui.title("titulo")
    gui.geometry("400x200")
    app = ttk.Frame(gui)
    label = ttk.Label(text = "Nome",font=50)
    label.pack(fill=X,padx=20,pady=10)
    nome = StringVar()
    input = ttk.Entry(textvariable=nome)
    input.pack(fill=X,padx=20,pady=20,ipady=5)
    def test():
        messagebox.showinfo("nome",nome.get())
    button = ttk.Button(text = "print",command = test)
    button.pack(fill=X,padx=20,ipady=6,pady=20)
    gui.mainloop()
def grid(width):
    col = list(range(13))
    for i in range(1, 13):
        col[i] = width * i / 12
    return col
def ui2():
    gui = Tk()
    col = grid(800)
    gui.geometry("400x350")
    gui.resizable(False,False)
    frame = Frame(gui)
    frame.pack(fill=X)
    label = ttk.Label(frame,text = "label")
    label.pack(fill=X,pady=20,padx=20)
    entry = ttk.Entry(frame)
    entry.pack(fill=X,pady=20,padx=20)
    label = ttk.Label(frame, text="label")
    label.pack(fill=X, pady=20, padx=20)
    entry = ttk.Entry(frame)
    entry.pack(fill=X, pady=20, padx=20)
    button = ttk.Button(frame,text="button")
    button.pack(fill=X,pady=20,padx=20)
    gui.mainloop()
ui2()