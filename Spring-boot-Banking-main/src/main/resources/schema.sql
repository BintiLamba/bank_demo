--CREATE SCHEMA online_bank;

--CREATE TABLE online_bank.account (
--    id bigint NOT NULL PRIMARY KEY,
--    sort_code CHAR(8) NOT NULL,
--    account_number CHAR(8) NOT NULL,
--    current_balance NUMERIC(10,3) NOT NULL,
--    bank_name VARCHAR(50) NOT NULL,
--    owner_name VARCHAR(50) NOT NULL,
--    UNIQUE (sort_code, account_number)
--);

--DROP TABLE online_bank.ACCOUNT;
--DROP TABLE online_bank.TRANSACTION;
--DROP SEQUENCE online_bank.TRANSACTION_SEQUENCE;


CREATE SCHEMA online_bank;

CREATE TABLE online_bank.account (
    partner_reference_number bigint NOT NULL PRIMARY KEY,
    partner_name VARCHAR(100) NOT NULL,
    legal_name VARCHAR(100) NOT NULL,
    mobile_number VARCHAR(20) NOT NULL,
    email_id VARCHAR(100) NOT NULL,
    address VARCHAR(200) NOT NULL,
    city VARCHAR(50) NOT NULL,
    state VARCHAR(50) NOT NULL,
    pincode VARCHAR(20) NOT NULL,
    gstin VARCHAR(20) NOT NULL,
    pan VARCHAR(20) NOT NULL,
    status VARCHAR(20) NOT NULL,
	balance NUMERIC(10,3) NOT NULL,
    escrow_account_number VARCHAR(20) NOT NULL,
	UNIQUE (partner_reference_number,escrow_account_number)
);

CREATE TABLE online_bank.seller_account (
    partner_reference_number BIGINT PRIMARY KEY,
    merchant_okta_id VARCHAR(100),
    partner_name VARCHAR(100),
    merchant_id BIGINT,
    email_id VARCHAR(100),
    merchant_name VARCHAR(100),
    gst_number VARCHAR(20),
    company_pan VARCHAR(20),
    bank_account_number VARCHAR(50),
    profile_status VARCHAR(20),
    UNIQUE (partner_reference_number,bank_account_number)
);



--CREATE SEQUENCE online_bank.transaction_sequence START WITH 5;
CREATE TABLE online_bank.transaction (
    id bigint NOT NULL PRIMARY KEY,
    source_account_id bigint NOT NULL REFERENCES online_bank.account(partner_reference_number),
    target_account_id bigint NOT NULL REFERENCES online_bank.account(partner_reference_number),
    target_owner_name varchar(50) NOT NULL,
    amount NUMERIC(10,3) NOT NULL,
    initiation_date timestamp NOT NULL,
    completion_date TIMESTAMP,
    reference VARCHAR(255),
    latitude REAL,
    longitude REAL
);
