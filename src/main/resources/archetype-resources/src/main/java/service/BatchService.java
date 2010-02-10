package ${groupId}.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
public class BatchService {
    private DataSource dataSource;

    @Autowired
    public BatchService(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public String doSomething() {
        if (dataSource == null) {
            throw new RuntimeException("Jikes");
        }
        System.out.println("Hei");
        return "hei";
        
    }
}
