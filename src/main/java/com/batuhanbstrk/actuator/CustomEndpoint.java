package com.batuhanbstrk.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Endpoint(id="monitor")
@Component
public class CustomEndpoint {

    @ReadOperation
    @Bean
    String display(){
        return "Everything is okay!";
    }
}
