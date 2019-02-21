package boot.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import boot.spring.entity.Ticket;
import boot.spring.service.TicketBookingService;

@RestController
@RequestMapping(value = "/api/tickets")
public class TicketBookingController {
	
	@Autowired
	private TicketBookingService ticketbookingservice;
	//Autowirirng tells Spring that the Controller class depends on Booking service class
	//Hence Autowiring is done
	
	@GetMapping(value = "/ticket/{ticketId}")
	public Ticket getTicketById(@PathVariable("ticketId") Integer ticketId) {
		return  ticketbookingservice.getTicketById(ticketId);
		
	}
	
	@GetMapping(value = "/ticket/alltickets")
	public Iterable<Ticket> getAllBookedTickets(){
		return ticketbookingservice.getAllBookedTickets();
	}
	
	@PostMapping(value = "/ticket/create")
	//PostMapping notifies Spring that we are using PostMethod. We need to provide a value for post uri.
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return ticketbookingservice.createTicket(ticket);
	}
	
	@DeleteMapping(value = "/ticket/delete/{ticketId}")
		public void deleteTicket(@PathVariable("ticketId") Integer ticketId) {
		ticketbookingservice.deleteTicketById(ticketId);
	}
	
	@PutMapping(value = "/ticket/update/{ticketId}/{newEmail:.+}")
	public Ticket updateTicket(@PathVariable("ticketId") Integer ticketId,@PathVariable("newEmail") String newEmail ) {
		return ticketbookingservice.updateTicket(ticketId,newEmail);
	}
	

}
