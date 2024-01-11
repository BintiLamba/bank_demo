package com.example.bank.controllers;

import com.example.bank.models.PartnerAdditionRequestDto;
import com.example.bank.models.PartnerAdditionResponseDto;
import com.example.bank.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/partner")
public class PartnerAdditionController {

    private final AccountService accountService;

    @Autowired
    public PartnerAdditionController(AccountService accountService) {
        this.accountService = accountService;
    }



    @PutMapping(value = "/accounts",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PartnerAdditionResponseDto> createPartnerAccount(
            @Valid @RequestBody PartnerAdditionRequestDto partnerAdditionRequestDto) {


        PartnerAdditionResponseDto partner = accountService.createPartnerAccount(partnerAdditionRequestDto);

        return new ResponseEntity<PartnerAdditionResponseDto>(partner, HttpStatus.OK);

    }



}
