package ${groupId}.service;

import bjornno.asynchwork.Message;
import bjornno.asynchwork.ReceivingService;

public class Process {
    public void receive(Message message) {
        System.out.println(message.getPayload());
    }
    public String getReceiverName() {
        return "processor";
    }
}
