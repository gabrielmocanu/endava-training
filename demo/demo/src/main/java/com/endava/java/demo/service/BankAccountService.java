package com.endava.java.demo.service;

import com.endava.java.demo.model.BankAccount;
import com.endava.java.demo.repository.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;

@Service
public class BankAccountService {

    private BankAccountRepository bankAccountRepository;

    @Autowired
    public BankAccountService(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    public void addBankAccount(BankAccount bankAccount, HttpServletResponse response) {
        if(bankAccount.getBalance() > 50)
            bankAccountRepository.addBankAccount(bankAccount);
        else
            response.setStatus(403);
    }
}
