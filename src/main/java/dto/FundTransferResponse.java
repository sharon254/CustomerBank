package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class FundTransferResponse {
    private String message;
    private String transactionId;
}
