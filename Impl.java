// Step 2 : Develmplementation Class (Remote Object)
// Note: we can also make the server program implement the interface
// (1) implement the interface created in step 1
// (2) provide implementation to all the abstract methods of the remote interface


public class Impl implements Hello{
    public void printMsg(){
        System.out.println("This is a message :)");
    }
}
