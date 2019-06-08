/*
package com.example.kbfinancialjpa.service;

import com.example.kbfinancialjpa.model.Bank;
import com.example.kbfinancialjpa.repository.BankJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ATMService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BankJpaRepository bankJpaRepository;

    public List<Bank>   getAllBanks(){
        return bankJpaRepository.findAll();
    }

    public int addBank(Bank b) {
        bankJpaRepository.save(b);
        return 1;
    }
}
*/
