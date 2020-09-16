package com.gale.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private ProduceService producer;

    @RequestMapping("/push")
    public String pushMsg(String msg) {
        return producer.send("TopicTest", "push", msg);
    }
}
