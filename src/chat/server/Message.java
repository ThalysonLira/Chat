package chat.server;

import java.io.Serializable;

public class Message implements Serializable{

	private static final long serialVersionUID = -3832064268098333569L;
	
	private String name;
	private String msg;
	
	public Message(String name, String msg) {
		this.name = name;
		this.msg = msg;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}

}