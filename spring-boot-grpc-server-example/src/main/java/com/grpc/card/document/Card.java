package com.grpc.card.document;

import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Card {

    @Id
    private String id;

    private String userId;
    private String holderName;
    private String number;
    private String status;
    private Double balance;
    private String expiredAt;
    private String type;
    private List<String> currencies;
    private Map<String, String> specifications;

}
