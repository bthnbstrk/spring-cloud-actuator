package com.batuhanbstrk.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Endpoint(id="monitor")
@Component
public class ParamedicEndpoint {

    @ReadOperation
    @Bean
    String level(@Selector String parameter){
        switch (parameter){
            case "status": return "Ok";
            case "level": return "Warning";
        }
        return "Error";
    }
}
