package messenger.smtp;

import messenger.Message;

public class NetEastEmailMessenger extends EmailMessenger {

	public void send(Message message) {
		System.out.println("通过网易邮箱发送一封邮件!");
		if (message instanceof Email){
			Email email = (Email) message;
			System.out.println("邮件主题：" + email.getSubject());
			System.out.println("邮件内容：" + email.getContent());
			System.out.println("邮件收件人列表：" + email.getRecvAddrs());
			System.out.println("邮件抄送列表：" + email.getCcAddrs());
		}
	}
	
}
