package TCP;
import java.net.*;
import java.io.*;
class ClientDemo
{
public static void main(String args[]) throws Exception
    {
    Socket socket = new Socket("localhost", 6666);
    DataOutputStream dataOutputStream =new DataOutputStream(socket.getOutputStream());
    dataOutputStream.writeUTF("Hello Server");
    dataOutputStream.flush();
    dataOutputStream.close();
    socket.close();
}
}
