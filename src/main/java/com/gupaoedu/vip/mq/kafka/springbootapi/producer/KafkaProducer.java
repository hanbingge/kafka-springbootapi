package com.gupaoedu.vip.mq.kafka.springbootapi.producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;


@Component
public class KafkaProducer {
    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    public String send(@RequestParam String msg){
        kafkaTemplate.send("springboottom", msg);
        return "ok";
    }

}
