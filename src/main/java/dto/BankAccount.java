package dto;

import entity.AccountStatus;
import entity.AccountType;

import java.math.BigDecimal;

public class BankAccount {
    private Long id;
    private String number;
    private AccountType type;
    private AccountStatus status;
    private BigDecimal availableBalance;
    private BigDecimal actualBalance;
    private User user;
}
