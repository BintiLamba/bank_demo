package com.example.bank.repositories;

import com.example.bank.models.Account;
import com.example.bank.models.SellerAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SellerAccountRepository extends JpaRepository<SellerAccount, Long> {

    Optional<SellerAccount> findByPartnerReferenceNumberAndCardNumber(Long partnerReferenceNumber, long cardNumber);
}
