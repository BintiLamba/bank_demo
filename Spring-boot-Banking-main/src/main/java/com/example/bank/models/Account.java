package com.example.bank.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "account", schema = "online_bank")
public class Account {

    @Id
    private Long partnerReferenceNumber;

    private String partnerName;
    private String legalName;
    private String mobileNumber;
    private String emailId;
    private String address;
    private String city;
    private String state;
    private String pincode;
    private String gstin;
    private String pan;

    private String status;
    private String escrowAccountNumber;
    private double balance;
//    private transient List<Transaction> transactions;

    public Account(Long partnerReferenceNumber, String partnerName, String legalName, String mobileNumber, String emailId, String address, String city, String state, String pincode, String gstin, String pan, String status, String escrowAccountNumber, double balance) {
        this.partnerReferenceNumber = partnerReferenceNumber;
        this.partnerName = partnerName;
        this.legalName = legalName;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.gstin = gstin;
        this.pan = pan;
        this.status = status;
        this.escrowAccountNumber = escrowAccountNumber;
        this.balance=balance;
    }
}
