package chat.client;

import java.rmi.Naming;

import chat.server.ChatInterface;

public class Client {
	
	public static void main(String args[]) {
		try {
			ChatInterface c = (ChatInterface) Naming.lookup("rmi://127.0.0.1/Chat");

			System.out.println(c.message("thalyson", "Tudo bem?"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}