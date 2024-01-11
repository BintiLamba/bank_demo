package com.example.bank.models;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class SellerAdditionResponseDto {

    private String merchantOktaId;
    private Long partnerReferenceNumber;
    private String partnerName;

    private Long merchantId;
    private String emailId;
    private String merchantName;
    private String gstNumber;
    private String companyPAN;
    private String bankAccountNumber;

    private String profileStatus;

}
