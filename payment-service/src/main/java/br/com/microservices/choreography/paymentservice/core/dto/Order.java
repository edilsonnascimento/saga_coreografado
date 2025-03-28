package br.com.microservices.choreography.paymentservice.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private String id;
    private List<OrderProducts> products;
    private String transactionId;
    private double totalAmount;
    private int totalItems;
}
