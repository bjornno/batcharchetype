package ${groupId}.service;

import java.io.Reader;

public class Input implements BatchFileReciever {
    public void recieve(Reader reader) {
        System.out.println("Jihaa");
    }
}
