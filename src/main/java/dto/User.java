package dto;

import java.util.List;

public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String identificationNumber;
    private List<BankAccount> bankAccounts;

    public void setBankAccounts(List<dto.BankAccount> convertToDtoList) {
    }
}
