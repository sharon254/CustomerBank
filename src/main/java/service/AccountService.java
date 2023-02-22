package service;

import dto.BankAccount;
import dto.BankAccountMapper;
import dto.UtilityAccount;
import dto.UtilityAccountMapper;
import entity.BankAccountEntity;
import entity.UtilityAccountEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.BankAccountRepository;
import repository.UtilityAccountRepository;

@Service
@RequiredArgsConstructor
public class AccountService {
    private BankAccountMapper bankAccountMapper = new BankAccountMapper();
    private UtilityAccountMapper utilityAccountMapper = new UtilityAccountMapper();

    private final BankAccountRepository bankAccountRepository;
    private final UtilityAccountRepository utilityAccountRepository;

    public BankAccount readBankAccount(String accountNumber) {
        BankAccountEntity entity = bankAccountRepository.findByNumber(accountNumber).get();
        return bankAccountMapper.convertToDto(entity);
    }

    public UtilityAccount readUtilityAccount(String provider) {
        UtilityAccountEntity utilityAccountEntity = utilityAccountRepository.findByProviderName(provider).get();
        return utilityAccountMapper.convertToDto(utilityAccountEntity);
    }

    public UtilityAccount readUtilityAccount(Long id){
        return utilityAccountMapper.convertToDto(utilityAccountRepository.findById(id).get());
    }
}
