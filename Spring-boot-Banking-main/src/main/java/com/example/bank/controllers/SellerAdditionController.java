package com.example.bank.controllers;


import com.example.bank.models.PartnerAdditionRequestDto;
import com.example.bank.models.PartnerAdditionResponseDto;
import com.example.bank.models.SellerAdditionRequestDto;
import com.example.bank.models.SellerAdditionResponseDto;
import com.example.bank.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/seller")
public class SellerAdditionController {

    private final AccountService accountService;

    @Autowired
    public SellerAdditionController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PutMapping(value = "/open/accounts",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SellerAdditionResponseDto> createSellerAccount(
            @Valid @RequestBody SellerAdditionRequestDto sellerAdditionRequestDto) {


        SellerAdditionResponseDto partner = accountService.createSellerAccount(sellerAdditionRequestDto);

        return new ResponseEntity<SellerAdditionResponseDto>(partner, HttpStatus.OK);

    }
}
