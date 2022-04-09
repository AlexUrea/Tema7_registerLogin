package com.cloudschool.registerlogin.repositories;

import com.cloudschool.registerlogin.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository {

    public Account findAccountById(Integer Id);

    public Account findAccountByUsername(String username);

    public Account checkAccountPassword(String password);

}
