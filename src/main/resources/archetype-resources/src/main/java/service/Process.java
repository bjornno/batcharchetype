package ${groupId}.service;

import bjornno.asynchwork.Message;
import bjornno.asynchwork.ReceivingService;

public class Process implements ReceivingService {
    public void receive(Message message) {
        System.out.println("Recieving message: ");
        System.out.println(message.getPayload());
    }
    public String getReceiverName() {
        return "processor";
    }
}
