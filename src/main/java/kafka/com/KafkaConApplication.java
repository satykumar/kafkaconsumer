package kafka.com;

import java.nio.channels.Channels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(Channels.class)
public class KafkaConApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaConApplication.class, args);
	}
}
