package com.grpc.card.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("grpc")
@Data
public class GrpcProperties {

    private String host;
    private int port;

}
