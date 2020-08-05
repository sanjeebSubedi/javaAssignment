package TCP;

import java.net.*;
import java.io.*;
class ServerDemo
{
    public static void main(String args[]) throws Exception
    {
        ServerSocket serverSocket = new ServerSocket(6666);
        Socket socket = serverSocket.accept();
        DataInputStream dis=new DataInputStream(socket.getInputStream());  
        String  str=(String)dis.readUTF();  
        System.out.println("message= "+str);  
        serverSocket.close();
       
    }
}
