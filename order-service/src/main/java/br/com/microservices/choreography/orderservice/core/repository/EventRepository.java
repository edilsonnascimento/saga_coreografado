package br.com.microservices.choreography.orderservice.core.repository;

import br.com.microservices.choreography.orderservice.core.document.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface EventRepository extends MongoRepository<Event, String> {
    List<Event> findAllByOrderByCreatedAtDesc();

    Optional<Event> findTop1ByOrderId(String orderId);

    Optional<Event> findTop1ByTransactionId(String transactionId);
}