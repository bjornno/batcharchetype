package ${groupId}.task;

import ${groupId}.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;


public class ScheduledTask {
    private BatchService batchService;

    @Autowired
    public ScheduledTask(BatchService batchService) {
        this.batchService = batchService;
    }

    @Scheduled(fixedRate=1000)
    public void doSomethingEverySecond() {
        batchService.doSomething();
    }
}
