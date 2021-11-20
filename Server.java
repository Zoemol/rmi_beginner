// Step 3 : Developing the Server program
// Note: it should implement or extend the implementation class.
// (1) create a client class form where you want invoke the remote object
// (2) creat a remote object by instantiating the implementation class
// (3) export the remote object
// (4) get the RMI registry 
// (5) bind the remote object created to the registry


import java.rmi.registry.Registry; 
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends Impl{
    public Server() {}
    public static void main(String[] args){
        try{
            // instantiating the implementation class
            Impl obj = new Impl();

            //export obj
            Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);

            //binding the remote object(stub) in the registry
            Registry registry = LocateRegistry.getRegistry();

            registry.bind("Hello", stub); // this stub is for interface "Hello"
            System.err.println("Server ready");
        } catch (Exception e){
            System.err.println("Server exception:" + e.toString());
            e.printStackTrace();
        }
    }
}
