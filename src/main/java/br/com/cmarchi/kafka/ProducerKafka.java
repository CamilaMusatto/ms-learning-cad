package br.com.cmarchi.kafka;

import br.com.cmarchi.model.CreatedStudentEvent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProducerKafka {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private ObjectMapper objectMapper;


    public void send(CreatedStudentEvent event) throws JsonProcessingException {
        String json = objectMapper.writeValueAsString(event);
        kafkaTemplate.send("StudentEvents", json);
    }
}
