package chat.client;

import java.rmi.Naming;
import chat.server.Chat;
import chat.server.Message;

public class Client {

	public static void main(String args[]) throws Exception {
		Chat chat = ((Chat) Naming.lookup("rmi://127.0.0.1:1099/chat"));
		
		try {
			chat.postMessage(new Message("thalyson", "oi"));
			System.out.println(chat.getMessage());

			chat.postMessage(new Message("denise", "olá"));
			System.out.println(chat.getMessage());
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}

	}
}