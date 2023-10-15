package com.lulu.SportsProductShop.Management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lulu.SportsProductShop.Management.entity.PurchaseEntity;
import com.lulu.SportsProductShop.Management.repository.SportsProductRepository;

@RestController
public class SportsProductController {

	@Autowired
	SportsProductRepository spr;

	@GetMapping("/getPurchase")
	public List<PurchaseEntity> getJPQL(){
		return spr.findAll();
	}

	@PostMapping("/addPurchase")
	public PurchaseEntity createuser(@RequestBody PurchaseEntity c) {
		return spr.save(c);
	}
	@DeleteMapping("/deletePurchase/{id}")
	public void PurchaseEntity (@PathVariable ("id") Integer id) {
		spr.deleteById(id);
	}


}