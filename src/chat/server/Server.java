package chat.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {

	public static void main(String args[]) {

		try {
			Chat chat = new ChatImp();
			Chat chatStub = (Chat) UnicastRemoteObject.exportObject(chat, 0);
			Registry registry = LocateRegistry.createRegistry(1099);
			registry.rebind("chat", chatStub);
			System.out.println("Server está online!");
		} catch (RemoteException re) {
			System.out.println("Erro remoto: " + re.toString());
		} catch (Exception e) {
			System.out.println("Erro Local: " + e.toString());
		}

	}
}