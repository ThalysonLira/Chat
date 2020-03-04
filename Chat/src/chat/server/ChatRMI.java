package chat.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ChatRMI extends UnicastRemoteObject implements ChatInterface {

	private List<String> dialog;
	
	public ChatRMI() throws RemoteException {

	}
	
	public List<String> message(String user, String message) throws RemoteException {
		getDialog().add(user + ": " + message);
		return getDialog();
	}

	public List<String> getDialog() {
		if(dialog == null)
			dialog = new ArrayList<String>();
		return dialog;
	}
}