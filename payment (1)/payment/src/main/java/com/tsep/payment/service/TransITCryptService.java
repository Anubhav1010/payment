package com.tsep.payment.service;


import com.tsep.payment.model.Merchant;
import org.springframework.stereotype.Service;

@Service
public class TransITCryptService {

    public String encryptManifest(Merchant merchant) {
        return TransITCrypt.encryptManifest(
                merchant.getMerchantID(),
                merchant.getDeviceID(),
                merchant.getAmount(),
                merchant.getTransactionKey()
        );
    }
}
