-- Insert dummy data into online_bank.account table
INSERT INTO online_bank.account (
    partner_reference_number,
    partner_name,
    legal_name,
    mobile_number,
    email_id,
    address,
    city,
    state,
    pincode,
    gstin,
    pan,
    status,
    balance,
    escrow_account_number
) VALUES
(1, 'Partner1', 'LegalName1', '1234567890', 'partner1@example.com', 'Address1', 'City1', 'State1', '12345', 'GSTIN123', 'PAN123', 'Active', 1000.0, 'ESCROW123'),
(2, 'Partner2', 'LegalName2', '9876543210', 'partner2@example.com', 'Address2', 'City2', 'State2', '54321', 'GSTIN456', 'PAN456', 'Active', 500.0, 'ESCROW456');

-- Insert dummy data into online_bank.seller_account table
INSERT INTO online_bank.seller_account (
    partner_reference_number,
    merchant_okta_id,
    partner_name,
    merchant_id,
    email_id,
    merchant_name,
    gst_number,
    company_pan,
    bank_account_number,
    profile_status
) VALUES
(1, 'MerchantOkta1', 'Partner1', 101, 'merchant1@example.com', 'Merchant1', 'GST123', 'PAN123', '1234567890', 'Active'),
(2, 'MerchantOkta2', 'Partner2', 102, 'merchant2@example.com', 'Merchant2', 'GST456', 'PAN456', '9876543210', 'Active');

-- Insert dummy data into online_bank.transaction table
-- Assuming that source_account_id and target_account_id are the partner_reference_number values
INSERT INTO online_bank.transaction (
    id,
    source_account_id,
    target_account_id,
    target_owner_name,
    amount,
    initiation_date,
    completion_date,
    reference,
    latitude,
    longitude
) VALUES
(1, 1, 2, 'OwnerName2', 200.0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Reference123', 12.34, 56.78),
(2, 2, 1, 'OwnerName1', 100.0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Reference456', 23.45, 67.89);
