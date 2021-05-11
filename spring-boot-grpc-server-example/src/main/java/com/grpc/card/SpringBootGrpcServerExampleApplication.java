package com.grpc.card;

import com.grpc.card.property.GrpcProperties;
import com.grpc.card.service.CardService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringBootGrpcServerExampleApplication {

    private final CardService cardService;
    private final GrpcProperties grpcProperties;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootGrpcServerExampleApplication.class, args);
    }

    @EventListener(ContextRefreshedEvent.class)
    public void startServer() throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(grpcProperties.getPort())
                .addService(cardService)
                .build();
        server.start();
        server.awaitTermination();
    }

}
