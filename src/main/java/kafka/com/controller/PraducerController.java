package kafka.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kafka.com.channel.Channels;
import kafka.com.channel.PraducerMessage;
import kafka.com.model.Student;
import kafka.com.repository.StudentRepository;

@RestController
@RequestMapping(value = "/api/v1/producer")
public class PraducerController {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private Channels channels;
    
    @PostMapping
    public void saveDetail(@RequestBody Student student){
        
        Student stuentinfo =studentRepository.save(student);
        // producer send the information to kafaka
        PraducerMessage pMsg= new PraducerMessage(stuentinfo);
        this.channels.outputChannel().send(MessageBuilder.withPayload(pMsg).build());
    }
    
}
