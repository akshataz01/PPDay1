package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Accounts;
import com.wecp.progressive.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/accounts")

public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    public ResponseEntity<List<Accounts>> getAllAccounts() throws SQLException {
        return new ResponseEntity<>(accountService.getAllAccounts(),HttpStatus.OK);
    }

    @GetMapping("/{accountId}")
    public ResponseEntity<Accounts> getAccountById(int accountId) throws SQLException {
        return new ResponseEntity<Accounts>(accountService.getAccountById(accountId), HttpStatus.OK);
    }

    @GetMapping("/user/{customerId}")
    public ResponseEntity<List<Accounts>> getAccountsByUser(@PathVariable int userId) throws SQLException{
        return new ResponseEntity<>(accountService.getAccountsByUser(userId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Integer> addAccount(Accounts accounts) throws SQLException {
        return new ResponseEntity<>(accountService.addAccount(accounts),HttpStatus.OK);
    }

    @PutMapping("/{accountId}")
    public ResponseEntity<Void> updateAccount(int accountId, Accounts accounts)throws SQLException{
        accountService.updateAccount(accounts);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{accountId}")
    public ResponseEntity<Void> deleteAccount(int accountId) throws SQLException {
        accountService.deleteAccount(accountId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}