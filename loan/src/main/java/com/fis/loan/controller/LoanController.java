package com.fis.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.loan.bean.Loan;

@RestController
@RequestMapping("/loans")
public class LoanController {
	@GetMapping("/{number}")
	public Loan getAccount(@PathVariable String number) {
		return new Loan("H00987987972342", "car", 500000l, 3258, 18);
	}
}