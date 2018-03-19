package messenger.smtp;

import messenger.Messenger;

public abstract class EmailMessenger implements Messenger {
	
	private Email email = null;
	
	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public void Send(){
		send(email);
	}
	
}
