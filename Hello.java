// Step 1
// Defining the Remote Interface
// (1) extend the predefined interface Remote
// (2) declare all the business methods that can be invoked by the client in this interface
// (3) throw RemoteException: the name of a network issue during remote calls


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote{
    void printMsg() throws RemoteException;
}
