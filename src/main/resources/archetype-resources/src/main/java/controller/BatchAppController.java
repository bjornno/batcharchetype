package ${groupId}.controller;

import ${groupId}.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BatchAppController {
    private final BatchService batchService;

    @Autowired

    public BatchAppController(BatchService batchService) {
        this.batchService = batchService;
    }

    @RequestMapping("/doSomething")
    public String doSomething() {
        this.batchService.doSomething();
        return "redirect:index";
    }
}
