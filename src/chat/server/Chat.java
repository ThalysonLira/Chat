package chat.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Chat extends Remote{

	String postMessage(Message msg) throws RemoteException;
	
	String getMessage() throws RemoteException;
	
}