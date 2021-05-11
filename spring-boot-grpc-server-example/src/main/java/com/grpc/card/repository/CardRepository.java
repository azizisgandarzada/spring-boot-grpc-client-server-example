package com.grpc.card.repository;

import com.grpc.card.document.Card;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CardRepository extends MongoRepository<Card, String> {

    List<Card> findAllByUserId(String userId);

}
