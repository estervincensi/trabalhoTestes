package com.jardimBotanico.jardimBotanico.service;

import com.jardimBotanico.jardimBotanico.domain.Account;
import com.jardimBotanico.jardimBotanico.repository.AccountRepository;
import org.springframework.stereotype.Service;

/**
 * Created by harley on 11/06/2017.
 */
@Service
public class AccountService {

    private final AccountRepository accountRepository;

    AccountService(AccountRepository accountService) {
        this.accountRepository = accountService ;

    }


    public Account save (Account account) {
    	Account account2 = accountRepository.findByUser(account.getUser());
    	if(accountRepository.findByUser(account.getUser())!=null){
    		return null;
    	}
         return this.accountRepository.save(account);
    }


}
