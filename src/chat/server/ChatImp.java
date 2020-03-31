package chat.server;

import java.rmi.RemoteException;
import java.util.ArrayList;

public class ChatImp implements Chat {

	private final ArrayList<Message> dialog;
	
	public ChatImp() throws RemoteException {
		this.dialog = new ArrayList<Message>();
	}
	
	@Override
	public String postMessage(Message message) throws RemoteException {
		getDialog().add(message);
		return "Mensagem enviada.";
	}
	
	@Override
	public String getMessage() throws RemoteException {
		String messages = "";
		for (int i = 0; i < getDialog().size(); i ++) {
			messages += getDialog().get(i).getName() + " : " + getDialog().get(i).getMsg() + "\n";
		}
		return messages;
	}

	public ArrayList<Message> getDialog() {
		if(dialog == null)
			return new ArrayList<Message>();
		return dialog;
	}

}