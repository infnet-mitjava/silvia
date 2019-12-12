package jmsapp.jms;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;


public class ConsumerJms implements MessageListener {

	@Override
	public void onMessage(Message message) {
		if(message instanceof TextMessage) {
			try {
				TextMessage msg = (TextMessage) message;
				
				System.out.println("===============");				
				System.out.println(msg.getText());
				System.out.println("===============");
				
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}
	
	

}
