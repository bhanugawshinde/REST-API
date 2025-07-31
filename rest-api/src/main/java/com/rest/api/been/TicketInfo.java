package com.rest.api.been;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketInfo {
	private String ticketId;
	private String pnr;
	private String status;
	
	private PassengerInfo passengerInfo;
	
}
