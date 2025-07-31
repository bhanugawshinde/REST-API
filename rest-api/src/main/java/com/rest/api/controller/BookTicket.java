package com.rest.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.been.PassengerInfo;
import com.rest.api.been.TicketInfo;

@RestController
public class BookTicket {

	@PostMapping("/bookTicket")
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo passengerInfo){
		TicketInfo ticketInfo = new TicketInfo();
		ticketInfo.setPassengerInfo(passengerInfo);
		ticketInfo.setPnr("JbL4503");
		ticketInfo.setTicketId("32242023");
		ticketInfo.setStatus("CONFORMED");
		
		return new ResponseEntity<TicketInfo>(ticketInfo,HttpStatus.OK);
	}
}
