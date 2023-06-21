package com.deborasroka.snacky;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;


@Transactional
public class SnackTransaction {

	
	SnackRepository snackRepository;
	
	public List<Snack> getAllSnacks(){
		
		//snackRepository.findAll();
		System.out.println("Hello I a here at transaction");
		System.out.println("Hello I am here to change your mind");
		return snackRepository.findAll();
		
	}
}
