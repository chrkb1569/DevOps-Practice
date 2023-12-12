package devOps.practice.CI.CD.Practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    @GetMapping("/status")
    public String checkStatus() {
        return "Status is Ok!!";
    }

    @GetMapping("/status/v2")
    public String checkStatusV2() {
        return "This is Version2!!!";
    }

    @GetMapping("/status/v3")
    public String checkStatusV3() {
        return "This is Version3!!!";
    }
}
