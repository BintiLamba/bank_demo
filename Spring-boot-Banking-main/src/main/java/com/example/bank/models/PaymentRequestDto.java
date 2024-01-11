package com.example.bank.models;

import lombok.*;

import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class PaymentRequestDto {

    @Id
    private Long transactionId;

    private Long merchantId;
    private Long merchantOktaId;
    private String emailId;
    private String merchantName;


    private Long cardNumber;
    private String expiryDate;
    private String cardHolderName;
    private int CVV;
    private double amount;
    private String referenceNo;

    private long partnerReferenceNumber;
    private String escrowAccountNumber;

}
