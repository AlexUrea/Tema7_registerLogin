package com.cloudschool.registerlogin.services;

import com.cloudschool.registerlogin.model.Account;
import com.cloudschool.registerlogin.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServices {

    @Autowired
    AccountRepository accountRepository;

    public Account findAccountById(Integer Id){
        return accountRepository.findAccountById(Id);
    }

    public Account findAccountByUsername(String username){
        return accountRepository.findAccountByUsername(username);
    }

    public Account checkAccountPassword(String password){
        return accountRepository.checkAccountPassword(password);
    }

    public Account create(Account account){
        accountRepository.save(account);
        return account;
    }

}
