package devOps.practice.CI.CD.Practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    @GetMapping("/status")
    public String checkStatus() {
        return "Status is Ok!";
    }
}