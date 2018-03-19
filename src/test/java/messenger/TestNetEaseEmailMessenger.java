package messenger;

import java.util.ArrayList;
import java.util.List;

import messenger.smtp.Email;
import messenger.smtp.NetEastEmailMessenger;

public class TestNetEaseEmailMessenger {
	
	public static void main(String[] args){
		
		Messenger messenger = new NetEastEmailMessenger();
		
		List<String> recvers = new ArrayList<String>();
		
		List<String> cc = new ArrayList<String>();
		
		recvers.add("fuxiangluo@163.com");
		recvers.add("fuxiangluo@qq.com");
		cc.add("fuxiangluo@126.com");
		
		Message message = Email.newEmail()
				.setSubject("这是邮件主题")
				.setContent("这是邮件内容")
				.setRecvAddrs(recvers)
				.setCcAddrs(cc);
		
		messenger.send(message);
		
	}
	
}
