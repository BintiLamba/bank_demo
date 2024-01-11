package com.example.bank.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

// TODO Add support for Bank charges, currency conversion, setup repeat payment/ standing order
@Setter
@Getter
@Entity
@Table(name = "transaction", schema = "online_bank")

@SequenceGenerator(name = "transaction_seq", sequenceName = "transaction_sequence", schema = "online_bank", initialValue = 5)
public class Transaction {
//

//
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transaction_seq")
    @Id
    private long id;
    private long sourceAccountId;

    private long targetAccountId;

    private String targetOwnerName;

    private double amount;

    private LocalDateTime initiationDate;

    private LocalDateTime completionDate;

    private String reference;

    private Double latitude;

    private Double longitude;

    public Transaction() {}

    @Override
    public String toString() {
        return "Transaction{" +
                "sourceAccountId=" + sourceAccountId +
                ", targetAccountId=" + targetAccountId +
                ", targetOwnerName='" + targetOwnerName + '\'' +
                ", amount=" + amount +
                ", initiationDate=" + initiationDate +
                ", completionDate=" + completionDate +
                ", reference='" + reference + '\'' +
                '}';
    }
}
