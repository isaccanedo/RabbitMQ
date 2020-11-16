package br.com.isaccanedo.rabbit;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Isac Canedo
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue helloQueue(){
        return new Queue("hello");
    }
}