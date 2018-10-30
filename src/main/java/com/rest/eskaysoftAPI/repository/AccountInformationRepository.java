package com.rest.eskaysoftAPI.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.AccountInformation;

@Repository("accountInformationRepository")
@Transactional
public interface AccountInformationRepository extends JpaRepository<AccountInformation, Long> {
	public List<AccountInformation> findAllByOrderByAccountnameAsc();

	public List<AccountInformation> findByscheduleIdId(Long id);

	public List<AccountInformation> findBysubScheduleIdId(Long id);

	public List<AccountInformation> findByStatesIdId(Long id);

	public List<AccountInformation> findBydistrictsIdId(Long id);

	public List<AccountInformation> findByareaIdId(Long id);

}