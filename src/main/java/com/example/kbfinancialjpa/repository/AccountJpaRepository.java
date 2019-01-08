package com.example.kbfinancialjpa.repository;

import com.example.kbfinancialjpa.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountJpaRepository extends JpaRepository<Account, Long> {
}
