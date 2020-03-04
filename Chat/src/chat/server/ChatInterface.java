package chat.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ChatInterface extends Remote{

	public List<String> message(String user, String message) throws RemoteException;
	
}