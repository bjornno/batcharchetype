package ${groupId}.service;

import bjornno.asynchwork.AsynchSender;
import bjornno.javabatch.BatchFileReciever;
import java.io.Reader;

public class Input implements BatchFileReciever {
     private AsynchSender sender;

    public void setSender(AsynchSender sender) {
        this.sender = sender;
    }

    public void recieve(Reader reader) {
        System.out.println("Recieving file, sending message.");
        sender.send("processor", "hei");
    }
}
