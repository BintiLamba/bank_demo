package com.example.bank.repositories;

import com.example.bank.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {

//    Optional<Account> findBySortCodeAndAccountNumber(Long partnerReferenceNumber, String escrowAccountNumber);
//    Optional<Account> findByAccountNumber(String escrowAccountNumber);
}
