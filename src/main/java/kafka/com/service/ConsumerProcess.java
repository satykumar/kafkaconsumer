package kafka.com.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import kafka.com.channel.Channel;
import kafka.com.channel.Channels;
import kafka.com.channel.PraducerMessage;
import kafka.com.model.Student;
import kafka.com.repository.StudentRepository;

@EnableBinding(Channels.class)
@Component
public class ConsumerProcess {

    
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ObjectMapper objectMapper;
    
    @StreamListener(Channel.OCC_INPUT)
    public final void process(final String strMessage) throws JsonParseException, JsonMappingException, IOException {

        final PraducerMessage message = this.objectMapper.readValue(strMessage, PraducerMessage.class);
        Student student = new Student(message);
        this.studentRepository.save(student);
        
    }
}
