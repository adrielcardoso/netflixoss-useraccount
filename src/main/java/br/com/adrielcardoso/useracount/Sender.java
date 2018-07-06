package br.com.adrielcardoso.useracount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class Sender
{
    @Autowired
    private KafkaTemplate<String, User> simpleKafkaTemplate;
    public void send(String topic, User payload) {
        simpleKafkaTemplate.send(topic, payload);
    }
}
