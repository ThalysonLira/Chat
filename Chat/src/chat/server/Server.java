package chat.server;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class Server {

	public static void main(String args[]) {
		ChatRMI server;

		try {
			server = new ChatRMI();
			Naming.rebind("rmi://127.0.0.1:1099/Chat", server);
			System.out.println("Server está online!");

		} catch (RemoteException re) {
			System.out.println("Erro remoto: " + re.toString());
		} catch (Exception e) {
			System.out.println("Erro Local: " + e.toString());
		}
	}
}