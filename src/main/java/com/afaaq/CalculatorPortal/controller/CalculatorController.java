package com.afaaq.CalculatorPortal.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.afaaq.CalculatorPortal.dto.InputDTO;
import com.afaaq.CalculatorPortal.dto.OutputDTO;

@RestController()
@RequestMapping("api")
public class CalculatorController {

	@PostMapping(value = "/add")
	public ResponseEntity<OutputDTO> add(@RequestBody InputDTO input) {
		long result = input.getX() + input.getY();
		/**
		 * Need to handle Exceptional scenarios like
		 * 1. Null Input
		 * 2. Non Numeric Input
		 * etc...
		 */
		return new ResponseEntity<>(new OutputDTO(result), HttpStatus.OK);
	}
	
	@PostMapping(value = "diff")
	public ResponseEntity<OutputDTO> substract(@RequestBody InputDTO input) {
		long result = input.getX() - input.getY();
		/**
		 * Need to handle Exceptional scenarios like
		 * 1. Null Input
		 * 2. Non Numeric Input
		 * etc...
		 */
		return new ResponseEntity<>(new OutputDTO(result), HttpStatus.OK);
	}
}
