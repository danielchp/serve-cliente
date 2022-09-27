import java.io.*;
import java.net.*; //import socket

public class serve{
   public static void main(String args[]) throws IOException{
    int port = 8000;
    ServerSocket server_Socket = new ServerSocket(port);
    while(true){
        System.out.print("Esperando conexion:  "+port+"\n");
        Socket client_Socket = server_Socket.accept();
        InputStream request = client_Socket.getInputStream();
        DataInputStream in = new DataInputStream(request);
        String message = new String(in.readAllBytes());
        System.out.println("Mensaje recibido: "+message);
        }

   } 
}
