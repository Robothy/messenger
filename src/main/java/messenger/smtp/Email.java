package messenger.smtp;

import java.util.List;

import messenger.Message;

public class Email implements Message {
	
	private String subject= "";
	
	private String content = "";
	
	private List<String> ccAddrs = null;
	
	private List<String> recvAddrs = null;
	
	/**
	 * set the construct method to private, so developers can not 
	 * create an Email object through construct method.
	 */
	private Email(){
		
	}
	
	/**
	 * {@link #newEmail()} get an new email instance.
	 * @return
	 */
	public static Email newEmail(){
		return new Email();
	}

	/**
	 * Get subject of this email.
	 * @return The subject of this email.
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * Set subject of this email.
	 * @param subject
	 */
	public Email setSubject(String subject) {
		this.subject = subject;
		return this;
	}

	/**
	 * Get content text of this email.
	 * @return content.
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Set content text of this email.
	 * @param content text.
	 */
	public Email setContent(String content) {
		this.content = content;
		return this;
	}

	/**
	 * {@link #getCcAddrs()} get the carbon copy addresses.
	 * @return
	 */
	public List<String> getCcAddrs() {
		return ccAddrs;
	}

	/**
	 * {@link #setCcAddrs(List)} set the carbon copy addresses.
	 * @param ccAddrs
	 * @return 
	 */
	public Email setCcAddrs(List<String> ccAddrs) {
		this.ccAddrs = ccAddrs;
		return this;
	}

	/**
	 * {@link #getRecvAddrs()} get all receivers' address of this email.
	 * @return
	 */
	public List<String> getRecvAddrs() {
		return recvAddrs;
	}

	/**
	 * {@link #setRecvAddrs(List)} set receivers' address of this email.
	 * @param recvAddrs
	 * @return 
	 */
	public Email setRecvAddrs(List<String> recvAddrs) {
		this.recvAddrs = recvAddrs;
		return this;
	}
	
}
