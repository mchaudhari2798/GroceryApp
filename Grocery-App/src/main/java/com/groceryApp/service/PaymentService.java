package com.groceryApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.groceryApp.entities.Payment;
import com.groceryApp.repository.PaymentRepository;

@Service
public class PaymentService {
	
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	public Payment saveAll(Payment payment) {
		return paymentRepository.save(payment);
	}
	
	public Payment Delete(long Card_id) {
		return paymentRepository.deleteById(Card_id);
	}
}
