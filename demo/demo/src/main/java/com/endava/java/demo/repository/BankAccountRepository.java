package com.endava.java.demo.repository;

import com.endava.java.demo.model.BankAccount;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BankAccountRepository {
    List<BankAccount> bankAccounts = new ArrayList<>();

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    public List<BankAccount> getBankAccounts () {
        return bankAccounts;
    }


}
