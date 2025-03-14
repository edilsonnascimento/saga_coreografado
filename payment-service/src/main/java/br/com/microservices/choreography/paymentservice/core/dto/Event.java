package br.com.microservices.choreography.paymentservice.core.dto;

import br.com.microservices.choreography.paymentservice.core.enums.ESagaStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.ObjectUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Event {

    private String id;
    private String transactionId;
    private String orderId;
    private Order payload;
    private String source;
    private ESagaStatus status;
    private List<History> eventHistory;
    private LocalDateTime createAt;

    public void addToHistory(History history) {
        if(ObjectUtils.isEmpty(this.eventHistory))
            this.eventHistory = new ArrayList<>();
        eventHistory.add(history);
    }
}