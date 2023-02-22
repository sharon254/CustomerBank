package dto;

import java.math.BigDecimal;

public class Transaction {
    private Long id;
    private BigDecimal amount;
    private BankAccount bankAccount;
    private String referenceNumber;
}
