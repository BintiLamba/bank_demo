package com.example.bank.utils;

import com.mifmif.common.regex.Generex;

import static com.example.bank.constants.constants.*;

public class CodeGenerator {
    Generex sortCodeGenerex = new Generex(SORT_CODE_PATTERN_STRING);
    Generex accountNumberGenerex = new Generex(ACCOUNT_NUMBER_PATTERN_STRING);

    Generex cardNumberGenerex = new Generex(CARD_NUMBER_PATTERN_STRING);
    Generex partnerReferenceNumberGenerex = new Generex(PARTNER_PATTERN_STRING);
    public CodeGenerator(){}

    public String generateSortCode() {
        return sortCodeGenerex.random();
    }
    public String generateCardNumber() {
        return cardNumberGenerex.random();
    }


    public String genratePartnerReferenceNumber() {return partnerReferenceNumberGenerex.random();}
    public String generateAccountNumber() {
        return accountNumberGenerex.random();
    }
}
