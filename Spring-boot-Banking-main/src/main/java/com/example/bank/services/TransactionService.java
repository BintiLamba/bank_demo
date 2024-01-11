package com.example.bank.services;

import com.example.bank.models.*;
import com.example.bank.repositories.AccountRepository;
import com.example.bank.repositories.SellerAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransactionService {
    @Autowired
    private AccountRepository accountRepository;


    @Autowired
    private  SellerAccountRepository sellerAccountRepository;


    public boolean makeTransfer(PaymentRequestDto paymentRequestDto) {
        //Customer Account
        long partnerReferenceNumber = paymentRequestDto.getPartnerReferenceNumber();
        long cardNumber =paymentRequestDto.getCardNumber();
        Optional<SellerAccount> sourceAccount = sellerAccountRepository
                .findByPartnerReferenceNumberAndCardNumber(partnerReferenceNumber, cardNumber);
        //Seller Account
//        String targetSortCode = transactionInput.getTargetAccount().getSortCode();
//        String targetAccountNumber = transactionInput.getTargetAccount().getAccountNumber();
//        Optional<Account> targetAccount = accountRepository
//                .findByPartnerReferenceNumberAndAccountNumber(targetSortCode, targetAccountNumber);


        return false;
    }

//     public void updateAccountBalance(Account account, double amount, ACTION action) {
//        if (action == ACTION.WITHDRAW) {
//            account.setCurrentBalance((account.getCurrentBalance() - amount));
//        } else if (action == ACTION.DEPOSIT) {
//            account.setCurrentBalance((account.getCurrentBalance() + amount));
//        }
//        accountRepository.save(account);
//    }

    public boolean isAmountAvailable(double amount, double accountBalance) {
        return (accountBalance - amount) > 0;
    }
}
