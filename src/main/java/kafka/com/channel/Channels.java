package kafka.com.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface Channels {

    @Input(Channel.OCC_INPUT)
    MessageChannel occInput();
    
    @Output
    MessageChannel outputChannel();

}
