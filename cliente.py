from email import message
import socket

port = 8000
while True:
    cliente_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    cliente_socket.connect(('localhost', port))
    message = input("cliente 1: \n")
    cliente_socket.send(message.encode())