package com.cloudschool.registerlogin.customersController;


import com.cloudschool.registerlogin.model.Account;
import com.cloudschool.registerlogin.services.AccountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountServices accountServices;


    //Registering an account
    @PostMapping("/register/")
    public ResponseEntity<Account> create(@RequestBody Account account) throws URISyntaxException {
        Account createdAccount = accountServices.create(account);
        if (createdAccount == null) {
            return ResponseEntity.notFound().build();
        } else {
            URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdAccount.getUserId()).toUri();
            return ResponseEntity.created(uri).body(createdAccount);
        }
    }

    //Log into an account

    @GetMapping("/{id}")
    public ResponseEntity<Account> read(@PathVariable("id") Integer id) {
        Account foundAccount = accountServices.findAccountById(id);
        if (foundAccount == null) {
            return ResponseEntity.notFound().build();
        } else {
            ResponseCookie springCookie = ResponseCookie.from("user - id", "1").httpOnly(true).secure(true).path("/").maxAge(60).domain("example.com").build();
            return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, springCookie.toString()).build();
        }

        }
    }



