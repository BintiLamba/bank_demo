package com.example.bank.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "seller_account", schema = "online_bank")
public class SellerAccount {

    @Id
    private Long partnerReferenceNumber;

    private String merchantOktaId;
    private String partnerName;
    private Long merchantId;
    private String emailId;
    private String merchantName;
    private String gstNumber;
    private String companyPAN;
    private String bankAccountNumber;
    private String profileStatus;
    private Long cardNumber;
    private double balance;

    public SellerAccount(Long partnerReferenceNumber, String merchantOktaId, String partnerName, Long merchantId,
                         String emailId, String merchantName, String gstNumber, String companyPAN,
                         String bankAccountNumber, String profileStatus, Long cardNumber,double balance) {
        this.partnerReferenceNumber = partnerReferenceNumber;
        this.merchantOktaId = merchantOktaId;
        this.partnerName = partnerName;
        this.merchantId = merchantId;
        this.emailId = emailId;
        this.merchantName = merchantName;
        this.gstNumber = gstNumber;
        this.companyPAN = companyPAN;
        this.bankAccountNumber = bankAccountNumber;
        this.profileStatus = profileStatus;
        this.cardNumber = cardNumber;
        this.balance=balance;
    }

}
