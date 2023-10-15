package com.lulu.SportsProductShop.Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lulu.SportsProductShop.Management.entity.PurchaseEntity;

@Repository
public interface SportsProductRepository extends JpaRepository<PurchaseEntity, Integer>{

}