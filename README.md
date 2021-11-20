# rmi_beginner
## A beginner project of rmi.

It models communication between two remote objects in one computer (and it can be run on two physical machines), which is server and client. 

To implement it in Ubuntu, first compile the 4 .java file using:
```
javac *.java
```
First,create and start a remote object registry on the specified port on the current host. If port is omitted, the registry is started on port 1099. The rmiregistry command produces no output and is typically run in the background. For example:
```
rmiregistry &
```
to use other port:
```
rmiregistry 2001 &
```
Probably port 1099 is occupied by other processes. Use command to check and kill the pid (the occupying process id):
```
lsof -i tcp:1099
kill [pid]
```
Then run the Server program using:
```
java Server
```
In this case, the program generates only one remote object.And our computer acts as a local object!
In another terminal, run the Client program using:
```
java Client
```
Each time the Client program generates a remote invocation, the local terminal would print the msg.
  
