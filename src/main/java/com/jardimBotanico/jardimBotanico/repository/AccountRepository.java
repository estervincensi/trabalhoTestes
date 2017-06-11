package com.jardimBotanico.jardimBotanico.repository;

import com.jardimBotanico.jardimBotanico.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by harley on 11/06/2017.
 */
@Repository
public interface  AccountRepository extends  JpaRepository<Account, Long> {
	public Account findByUser(String user);

}
