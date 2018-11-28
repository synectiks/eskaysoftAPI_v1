package com.rest.eskaysoftAPI.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.PurchaseEntry;

@Repository("purchaseEntryRepository")
@Transactional
public interface PurchaseEntryRepository extends JpaRepository<PurchaseEntry, Long> {

	public List<PurchaseEntry> findAllByOrderByPurchaseNumberAsc();
}